/**
 * generated by Xtext 2.25.0
 */
package com.mert.recherche.mkDsl.util;

import com.mert.recherche.mkDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.mert.recherche.mkDsl.MkDslPackage
 * @generated
 */
public class MkDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MkDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MkDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MkDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MkDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.DECLARAT�ON:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.ESG:
      {
        ESG esg = (ESG)theEObject;
        T result = caseESG(esg);
        if (result == null) result = caseDeclaration(esg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.VERTEX:
      {
        VERTEX vertex = (VERTEX)theEObject;
        T result = caseVERTEX(vertex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.EDGE:
      {
        EDGE edge = (EDGE)theEObject;
        T result = caseEDGE(edge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.DT:
      {
        DT dt = (DT)theEObject;
        T result = caseDT(dt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.CONDITION:
      {
        CONDITION cond�t�on = (CONDITION)theEObject;
        T result = caseCONDITION(cond�t�on);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.RULE:
      {
        RULE rule = (RULE)theEObject;
        T result = caseRULE(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.ACTION:
      {
        ACTION act�on = (ACTION)theEObject;
        T result = caseACTION(act�on);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.EVALUABLE:
      {
        EVALUABLE evaluable = (EVALUABLE)theEObject;
        T result = caseEVALUABLE(evaluable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.EXPRESSION:
      {
        EXPRESSION express�on = (EXPRESSION)theEObject;
        T result = caseEXPRESSION(express�on);
        if (result == null) result = caseEVALUABLE(express�on);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.CONNECTIVE:
      {
        CONNECTIVE connect�ve = (CONNECTIVE)theEObject;
        T result = caseCONNECTIVE(connect�ve);
        if (result == null) result = caseEVALUABLE(connect�ve);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.VARIABLE:
      {
        VARIABLE var�able = (VARIABLE)theEObject;
        T result = caseVARIABLE(var�able);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.OPERAND:
      {
        OPERAND operand = (OPERAND)theEObject;
        T result = caseOPERAND(operand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MkDslPackage.COLOR:
      {
        COLOR color = (COLOR)theEObject;
        T result = caseCOLOR(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ESG</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ESG</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseESG(ESG object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VERTEX</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VERTEX</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVERTEX(VERTEX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EDGE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EDGE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEDGE(EDGE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDT(DT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CONDITION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CONDITION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCONDITION(CONDITION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RULE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RULE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRULE(RULE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ACTION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ACTION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseACTION(ACTION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EVALUABLE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EVALUABLE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEVALUABLE(EVALUABLE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EXPRESSION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EXPRESSION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEXPRESSION(EXPRESSION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CONNECTIVE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CONNECTIVE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCONNECTIVE(CONNECTIVE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VARIABLE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VARIABLE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVARIABLE(VARIABLE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OPERAND</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OPERAND</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOPERAND(OPERAND object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>COLOR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>COLOR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCOLOR(COLOR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MkDslSwitch
