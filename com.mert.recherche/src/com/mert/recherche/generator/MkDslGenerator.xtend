/*
 * generated by Xtext 2.25.0
 */
package com.mert.recherche.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.mert.recherche.mkDsl.Declaration
import com.mert.recherche.mkDsl.ESG
import com.mert.recherche.mkDsl.VERTEX
import com.mert.recherche.mkDsl.DT
import com.mert.recherche.mkDsl.CONDITION
import org.eclipse.emf.common.util.EList
import com.mert.recherche.mkDsl.RULE
import com.mert.recherche.mkDsl.ACTION
import com.mert.recherche.mkDsl.EXPRESSION
import com.mert.recherche.mkDsl.EDGE
import com.mert.recherche.mkDsl.VARIABLE
import com.mert.recherche.mkDsl.CONNECTIVE
import com.mert.recherche.mkDsl.COLOR

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MkDslGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val simpleClassName = resource.getURI.trimFileExtension.lastSegment
		if(resource.contents?.head == null) {
			return;
		}
		val declarations = resource.contents.head.eContents.filter(Declaration)
		fsa.generateFile(simpleClassName + '.json', '''
		{
			�FOR graph : declarations.filter(ESG)�
			"ID": �graph.name�,
			"name":"refinedESG",
			"vertices":[
				�FOR subESG : graph.subESGs SEPARATOR ","�
					�IF(subESG instanceof ESG)�
						�runSubESGRule(subESG)�
					�ENDIF�
					�IF(subESG instanceof VERTEX)�
						�runVertexRule(subESG)�
					�ENDIF�
				�ENDFOR�
			],
				�runEdgeRule(graph.edges)�
				�FOR subESG : graph.subESGs�
					�IF(subESG instanceof VERTEX)�		
						�IF(subESG.dt != null)�
						,		
						�runDecisionTableRule(subESG.dt, subESG)�
						�ENDIF�
					�ENDIF�		
				�ENDFOR�
		}
		�ENDFOR�
	'''
	)}
	
	def runEdgeRule(EList<EDGE> edges) {
	'''
	"edges":[
	�FOR edge : edges SEPARATOR ","�
	{
		"ID": �edge.name�,
		"source": �edge.source�,
		"target": �edge.target�,
		"color":"�getColor(edge.color)�"			
	}
	�ENDFOR�
	]
	'''
	}
	
	def runSubESGRule(ESG esg) {
	'''{
		"ID": �esg.name�,
		"event":"�esg.event.name�",
		"isRefinedVertex" : true,
		"subESG": {
			"ID": �esg.name�,
			"name": "�esg.event.name�_subESG",
			"vertices":[
			�FOR subESG : esg.subESGs SEPARATOR ","�		
				�IF(subESG instanceof VERTEX)�
					�runVertexRule(subESG)�
				�ENDIF�
				�IF(subESG instanceof ESG)�
					�runSubESGRule(subESG)�
				�ENDIF�
			�ENDFOR�
					
			],
			�runEdgeRule(esg.edges)�
			�FOR subESG : esg.subESGs�
				�IF(subESG instanceof VERTEX)�		
					�IF(subESG.dt != null)�
						,		
						�runDecisionTableRule(subESG.dt, subESG)�
					�ENDIF�
				�ENDIF�		
			�ENDFOR�
			}
		}'''
	}
	
	def runVertexRule(VERTEX vertice) {
		'''
		{
			"ID": �vertice.ID�,
			"event":"�vertice.event.name�",
			"isRefinedVertex" : false,
			"color": "�getColor(vertice.color)�"
			�IF(vertice.dt != null)�
			,"decisionTable" : true
			�ENDIF�
		}'''
	}
	
	def runDecisionTableRule(DT dt, VERTEX v) {
		'''
		"decisionTables": [
			{
				"ID": �dt.ID�,
				"name": "�dt.name�",
				"vertexID": �v.ID�,
				�printConditions(dt.conditions)�
				�printActions(dt.actions)�
				�printRules(dt.rules, dt.conditions)�
			}
		]
		'''
	}
	
	
	def printConditions(EList<CONDITION> conditions) {
		var count = 0 as int
		'''
		"conditions": [
		�FOR condition : conditions SEPARATOR ","�
		{
			"ID": �condition.name�,
			"expressions": [ 
			�FOR eval : condition.evals SEPARATOR ","�
			�IF(eval instanceof EXPRESSION)�
				{
					"ID": �count++�,
					"expression": "�printExpression(eval)�"
				}		
			�ENDIF�
			�IF(eval instanceof CONNECTIVE)�
				{
					"connective": "�printConnective(eval)�"
				}
			�ENDIF�			
			�ENDFOR�
			]	
		}
		�ENDFOR�
		],
		'''
	}
	
	def String printConnective(CONNECTIVE c) {
		var result = "" as String
		
		if(c.connective == "AND") {
			result = "AND";
		} else {
			result = "OR";
		}
		
		return result
	}
	
	def String printExpression(EXPRESSION exp) {
		var left = exp.left.replace('"', '')
		var operand = "" as String
		var right = "" as String
		
		if(exp.operand != null) {
			operand = exp.operand.operand.toString()
		}
		if(exp.right != null) {
			right = exp.right.replace('"','')
		}
		
		return left + " " + operand + " " + right
	}
	
	def printActions(EList<ACTION> actions) {
		'''
		"actions": [
		�FOR action : actions SEPARATOR ","�
			{
				"ID": �Integer.parseInt(action.ID)�,
				"actionEvent": �action.event�
			}
		�ENDFOR�
		],
		'''
	}
	
	def printRules(EList<RULE> rules, EList<CONDITION> conditions) {
		'''
		"rules": [
		�FOR rule : rules SEPARATOR ","�
		�IF(rule != null)�
		{
			"ID": �rule.ID�,
			"variables": [
			�printVariables(rule.vars)�
			],
			�printConditionResults(conditions, rule.value)�
			"actionIDs": [
				�FOR action : rule.actions SEPARATOR ","�
				�action.ID�
				�ENDFOR�
			]
		}
		�ENDIF�	
		�ENDFOR�
		]
		'''
	}
	
	def printVariables(EList<VARIABLE> variables) {
		var id = 0 as int
		'''
		�FOR v : variables SEPARATOR ","�
			�printVariable(v, id++)�
		�ENDFOR�
		'''
	}
	
	def printVariable(VARIABLE v, int id) {
		'''
		{
			"ID": �id�,
			"name": "�v.name�",
			"type": "�getType(v.value)�",
			"value": "�v.value.replace('"', '')�"
			
		}
		'''
	}
	
	def String getType(String s) {
		if(s != null && !s.isEmpty()) {
			for(char c : s.toCharArray()) {
				if(!Character.isDigit(c)) {
					return "String"
				}
			}
		}
		
		return "Integer"
	}
	
	def printConditionResults(EList<CONDITION> conditions, String value) {
		var count = 0 as int
		'''
		"conditionResults": [
		�FOR cond : conditions SEPARATOR ","�
			�IF(cond != null)�
			{
				"condition": �cond.name�,
				"result":  �checkChar(value.charAt(count++))�
			}
		�ENDIF�	
		�ENDFOR�
		],
		'''
	}

	def String checkChar(char c) {
		var result = "-" as String
		if(c.toString()  == "T") {
			result = "true"
		} else if(c.toString() == "F") {
			result = "false"
		} else {
			result = "-"
		}
	
		return result
	}
	
	def String getColor(COLOR c) {
		var result = "black" as String
		if(c != null) {
			result = c.name;
		}
		return result;
	}
}
