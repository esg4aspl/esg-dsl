package com.mert.recherche.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.mert.recherche.services.MkDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMkDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'OR'", "'<'", "'<='", "'=='", "'>='", "'>'", "'black'", "'red'", "'green'", "'blue'", "'orange'", "'ESG'", "'Event'", "','", "'Vertex'", "'ID'", "'Color'", "'Edge'", "'Source'", "'Target'", "'DT'", "'Condition'", "'Rule'", "'value'", "'variables'", "'actions'", "'Action'", "'event'", "'('", "')'", "'var'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMkDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMkDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMkDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMkDsl.g"; }


    	private MkDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MkDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMkDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMkDsl.g:54:1: ( ruleModel EOF )
            // InternalMkDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMkDsl.g:62:1: ruleModel : ( ( rule__Model__DeclarationsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:66:2: ( ( ( rule__Model__DeclarationsAssignment )* ) )
            // InternalMkDsl.g:67:2: ( ( rule__Model__DeclarationsAssignment )* )
            {
            // InternalMkDsl.g:67:2: ( ( rule__Model__DeclarationsAssignment )* )
            // InternalMkDsl.g:68:3: ( rule__Model__DeclarationsAssignment )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment()); 
            // InternalMkDsl.g:69:3: ( rule__Model__DeclarationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMkDsl.g:69:4: rule__Model__DeclarationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__DeclarationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclarationsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclaration"
    // InternalMkDsl.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalMkDsl.g:79:1: ( ruleDeclaration EOF )
            // InternalMkDsl.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalMkDsl.g:87:1: ruleDeclaration : ( ruleESG ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:91:2: ( ( ruleESG ) )
            // InternalMkDsl.g:92:2: ( ruleESG )
            {
            // InternalMkDsl.g:92:2: ( ruleESG )
            // InternalMkDsl.g:93:3: ruleESG
            {
             before(grammarAccess.getDeclarationAccess().getESGParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleESG();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getESGParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleESG"
    // InternalMkDsl.g:103:1: entryRuleESG : ruleESG EOF ;
    public final void entryRuleESG() throws RecognitionException {
        try {
            // InternalMkDsl.g:104:1: ( ruleESG EOF )
            // InternalMkDsl.g:105:1: ruleESG EOF
            {
             before(grammarAccess.getESGRule()); 
            pushFollow(FOLLOW_1);
            ruleESG();

            state._fsp--;

             after(grammarAccess.getESGRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleESG"


    // $ANTLR start "ruleESG"
    // InternalMkDsl.g:112:1: ruleESG : ( ( rule__ESG__Group__0 ) ) ;
    public final void ruleESG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:116:2: ( ( ( rule__ESG__Group__0 ) ) )
            // InternalMkDsl.g:117:2: ( ( rule__ESG__Group__0 ) )
            {
            // InternalMkDsl.g:117:2: ( ( rule__ESG__Group__0 ) )
            // InternalMkDsl.g:118:3: ( rule__ESG__Group__0 )
            {
             before(grammarAccess.getESGAccess().getGroup()); 
            // InternalMkDsl.g:119:3: ( rule__ESG__Group__0 )
            // InternalMkDsl.g:119:4: rule__ESG__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ESG__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getESGAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleESG"


    // $ANTLR start "entryRuleVERTEX"
    // InternalMkDsl.g:128:1: entryRuleVERTEX : ruleVERTEX EOF ;
    public final void entryRuleVERTEX() throws RecognitionException {
        try {
            // InternalMkDsl.g:129:1: ( ruleVERTEX EOF )
            // InternalMkDsl.g:130:1: ruleVERTEX EOF
            {
             before(grammarAccess.getVERTEXRule()); 
            pushFollow(FOLLOW_1);
            ruleVERTEX();

            state._fsp--;

             after(grammarAccess.getVERTEXRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVERTEX"


    // $ANTLR start "ruleVERTEX"
    // InternalMkDsl.g:137:1: ruleVERTEX : ( ( rule__VERTEX__Group__0 ) ) ;
    public final void ruleVERTEX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:141:2: ( ( ( rule__VERTEX__Group__0 ) ) )
            // InternalMkDsl.g:142:2: ( ( rule__VERTEX__Group__0 ) )
            {
            // InternalMkDsl.g:142:2: ( ( rule__VERTEX__Group__0 ) )
            // InternalMkDsl.g:143:3: ( rule__VERTEX__Group__0 )
            {
             before(grammarAccess.getVERTEXAccess().getGroup()); 
            // InternalMkDsl.g:144:3: ( rule__VERTEX__Group__0 )
            // InternalMkDsl.g:144:4: rule__VERTEX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VERTEX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVERTEXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVERTEX"


    // $ANTLR start "entryRuleEvent"
    // InternalMkDsl.g:153:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMkDsl.g:154:1: ( ruleEvent EOF )
            // InternalMkDsl.g:155:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMkDsl.g:162:1: ruleEvent : ( ( rule__Event__NameAssignment ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:166:2: ( ( ( rule__Event__NameAssignment ) ) )
            // InternalMkDsl.g:167:2: ( ( rule__Event__NameAssignment ) )
            {
            // InternalMkDsl.g:167:2: ( ( rule__Event__NameAssignment ) )
            // InternalMkDsl.g:168:3: ( rule__Event__NameAssignment )
            {
             before(grammarAccess.getEventAccess().getNameAssignment()); 
            // InternalMkDsl.g:169:3: ( rule__Event__NameAssignment )
            // InternalMkDsl.g:169:4: rule__Event__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEDGE"
    // InternalMkDsl.g:178:1: entryRuleEDGE : ruleEDGE EOF ;
    public final void entryRuleEDGE() throws RecognitionException {
        try {
            // InternalMkDsl.g:179:1: ( ruleEDGE EOF )
            // InternalMkDsl.g:180:1: ruleEDGE EOF
            {
             before(grammarAccess.getEDGERule()); 
            pushFollow(FOLLOW_1);
            ruleEDGE();

            state._fsp--;

             after(grammarAccess.getEDGERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDGE"


    // $ANTLR start "ruleEDGE"
    // InternalMkDsl.g:187:1: ruleEDGE : ( ( rule__EDGE__Group__0 ) ) ;
    public final void ruleEDGE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:191:2: ( ( ( rule__EDGE__Group__0 ) ) )
            // InternalMkDsl.g:192:2: ( ( rule__EDGE__Group__0 ) )
            {
            // InternalMkDsl.g:192:2: ( ( rule__EDGE__Group__0 ) )
            // InternalMkDsl.g:193:3: ( rule__EDGE__Group__0 )
            {
             before(grammarAccess.getEDGEAccess().getGroup()); 
            // InternalMkDsl.g:194:3: ( rule__EDGE__Group__0 )
            // InternalMkDsl.g:194:4: rule__EDGE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDGE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDGEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDGE"


    // $ANTLR start "entryRuleDT"
    // InternalMkDsl.g:203:1: entryRuleDT : ruleDT EOF ;
    public final void entryRuleDT() throws RecognitionException {
        try {
            // InternalMkDsl.g:204:1: ( ruleDT EOF )
            // InternalMkDsl.g:205:1: ruleDT EOF
            {
             before(grammarAccess.getDTRule()); 
            pushFollow(FOLLOW_1);
            ruleDT();

            state._fsp--;

             after(grammarAccess.getDTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDT"


    // $ANTLR start "ruleDT"
    // InternalMkDsl.g:212:1: ruleDT : ( ( rule__DT__Group__0 ) ) ;
    public final void ruleDT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:216:2: ( ( ( rule__DT__Group__0 ) ) )
            // InternalMkDsl.g:217:2: ( ( rule__DT__Group__0 ) )
            {
            // InternalMkDsl.g:217:2: ( ( rule__DT__Group__0 ) )
            // InternalMkDsl.g:218:3: ( rule__DT__Group__0 )
            {
             before(grammarAccess.getDTAccess().getGroup()); 
            // InternalMkDsl.g:219:3: ( rule__DT__Group__0 )
            // InternalMkDsl.g:219:4: rule__DT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDT"


    // $ANTLR start "entryRuleCONDITION"
    // InternalMkDsl.g:228:1: entryRuleCONDITION : ruleCONDITION EOF ;
    public final void entryRuleCONDITION() throws RecognitionException {
        try {
            // InternalMkDsl.g:229:1: ( ruleCONDITION EOF )
            // InternalMkDsl.g:230:1: ruleCONDITION EOF
            {
             before(grammarAccess.getCONDITIONRule()); 
            pushFollow(FOLLOW_1);
            ruleCONDITION();

            state._fsp--;

             after(grammarAccess.getCONDITIONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCONDITION"


    // $ANTLR start "ruleCONDITION"
    // InternalMkDsl.g:237:1: ruleCONDITION : ( ( rule__CONDITION__Group__0 ) ) ;
    public final void ruleCONDITION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:241:2: ( ( ( rule__CONDITION__Group__0 ) ) )
            // InternalMkDsl.g:242:2: ( ( rule__CONDITION__Group__0 ) )
            {
            // InternalMkDsl.g:242:2: ( ( rule__CONDITION__Group__0 ) )
            // InternalMkDsl.g:243:3: ( rule__CONDITION__Group__0 )
            {
             before(grammarAccess.getCONDITIONAccess().getGroup()); 
            // InternalMkDsl.g:244:3: ( rule__CONDITION__Group__0 )
            // InternalMkDsl.g:244:4: rule__CONDITION__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CONDITION__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCONDITIONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCONDITION"


    // $ANTLR start "entryRuleRULE"
    // InternalMkDsl.g:253:1: entryRuleRULE : ruleRULE EOF ;
    public final void entryRuleRULE() throws RecognitionException {
        try {
            // InternalMkDsl.g:254:1: ( ruleRULE EOF )
            // InternalMkDsl.g:255:1: ruleRULE EOF
            {
             before(grammarAccess.getRULERule()); 
            pushFollow(FOLLOW_1);
            ruleRULE();

            state._fsp--;

             after(grammarAccess.getRULERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRULE"


    // $ANTLR start "ruleRULE"
    // InternalMkDsl.g:262:1: ruleRULE : ( ( rule__RULE__Group__0 ) ) ;
    public final void ruleRULE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:266:2: ( ( ( rule__RULE__Group__0 ) ) )
            // InternalMkDsl.g:267:2: ( ( rule__RULE__Group__0 ) )
            {
            // InternalMkDsl.g:267:2: ( ( rule__RULE__Group__0 ) )
            // InternalMkDsl.g:268:3: ( rule__RULE__Group__0 )
            {
             before(grammarAccess.getRULEAccess().getGroup()); 
            // InternalMkDsl.g:269:3: ( rule__RULE__Group__0 )
            // InternalMkDsl.g:269:4: rule__RULE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RULE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRULEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRULE"


    // $ANTLR start "entryRuleACTION"
    // InternalMkDsl.g:278:1: entryRuleACTION : ruleACTION EOF ;
    public final void entryRuleACTION() throws RecognitionException {
        try {
            // InternalMkDsl.g:279:1: ( ruleACTION EOF )
            // InternalMkDsl.g:280:1: ruleACTION EOF
            {
             before(grammarAccess.getACTIONRule()); 
            pushFollow(FOLLOW_1);
            ruleACTION();

            state._fsp--;

             after(grammarAccess.getACTIONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleACTION"


    // $ANTLR start "ruleACTION"
    // InternalMkDsl.g:287:1: ruleACTION : ( ( rule__ACTION__Group__0 ) ) ;
    public final void ruleACTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:291:2: ( ( ( rule__ACTION__Group__0 ) ) )
            // InternalMkDsl.g:292:2: ( ( rule__ACTION__Group__0 ) )
            {
            // InternalMkDsl.g:292:2: ( ( rule__ACTION__Group__0 ) )
            // InternalMkDsl.g:293:3: ( rule__ACTION__Group__0 )
            {
             before(grammarAccess.getACTIONAccess().getGroup()); 
            // InternalMkDsl.g:294:3: ( rule__ACTION__Group__0 )
            // InternalMkDsl.g:294:4: rule__ACTION__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ACTION__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getACTIONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACTION"


    // $ANTLR start "entryRuleEVALUABLE"
    // InternalMkDsl.g:303:1: entryRuleEVALUABLE : ruleEVALUABLE EOF ;
    public final void entryRuleEVALUABLE() throws RecognitionException {
        try {
            // InternalMkDsl.g:304:1: ( ruleEVALUABLE EOF )
            // InternalMkDsl.g:305:1: ruleEVALUABLE EOF
            {
             before(grammarAccess.getEVALUABLERule()); 
            pushFollow(FOLLOW_1);
            ruleEVALUABLE();

            state._fsp--;

             after(grammarAccess.getEVALUABLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEVALUABLE"


    // $ANTLR start "ruleEVALUABLE"
    // InternalMkDsl.g:312:1: ruleEVALUABLE : ( ( rule__EVALUABLE__Alternatives ) ) ;
    public final void ruleEVALUABLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:316:2: ( ( ( rule__EVALUABLE__Alternatives ) ) )
            // InternalMkDsl.g:317:2: ( ( rule__EVALUABLE__Alternatives ) )
            {
            // InternalMkDsl.g:317:2: ( ( rule__EVALUABLE__Alternatives ) )
            // InternalMkDsl.g:318:3: ( rule__EVALUABLE__Alternatives )
            {
             before(grammarAccess.getEVALUABLEAccess().getAlternatives()); 
            // InternalMkDsl.g:319:3: ( rule__EVALUABLE__Alternatives )
            // InternalMkDsl.g:319:4: rule__EVALUABLE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVALUABLE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEVALUABLEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVALUABLE"


    // $ANTLR start "entryRuleEXPRESSION"
    // InternalMkDsl.g:328:1: entryRuleEXPRESSION : ruleEXPRESSION EOF ;
    public final void entryRuleEXPRESSION() throws RecognitionException {
        try {
            // InternalMkDsl.g:329:1: ( ruleEXPRESSION EOF )
            // InternalMkDsl.g:330:1: ruleEXPRESSION EOF
            {
             before(grammarAccess.getEXPRESSIONRule()); 
            pushFollow(FOLLOW_1);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getEXPRESSIONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXPRESSION"


    // $ANTLR start "ruleEXPRESSION"
    // InternalMkDsl.g:337:1: ruleEXPRESSION : ( ( rule__EXPRESSION__Group__0 ) ) ;
    public final void ruleEXPRESSION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:341:2: ( ( ( rule__EXPRESSION__Group__0 ) ) )
            // InternalMkDsl.g:342:2: ( ( rule__EXPRESSION__Group__0 ) )
            {
            // InternalMkDsl.g:342:2: ( ( rule__EXPRESSION__Group__0 ) )
            // InternalMkDsl.g:343:3: ( rule__EXPRESSION__Group__0 )
            {
             before(grammarAccess.getEXPRESSIONAccess().getGroup()); 
            // InternalMkDsl.g:344:3: ( rule__EXPRESSION__Group__0 )
            // InternalMkDsl.g:344:4: rule__EXPRESSION__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EXPRESSION__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEXPRESSIONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXPRESSION"


    // $ANTLR start "entryRuleCONNECTIVE"
    // InternalMkDsl.g:353:1: entryRuleCONNECTIVE : ruleCONNECTIVE EOF ;
    public final void entryRuleCONNECTIVE() throws RecognitionException {
        try {
            // InternalMkDsl.g:354:1: ( ruleCONNECTIVE EOF )
            // InternalMkDsl.g:355:1: ruleCONNECTIVE EOF
            {
             before(grammarAccess.getCONNECTIVERule()); 
            pushFollow(FOLLOW_1);
            ruleCONNECTIVE();

            state._fsp--;

             after(grammarAccess.getCONNECTIVERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCONNECTIVE"


    // $ANTLR start "ruleCONNECTIVE"
    // InternalMkDsl.g:362:1: ruleCONNECTIVE : ( ( rule__CONNECTIVE__ConnectiveAssignment ) ) ;
    public final void ruleCONNECTIVE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:366:2: ( ( ( rule__CONNECTIVE__ConnectiveAssignment ) ) )
            // InternalMkDsl.g:367:2: ( ( rule__CONNECTIVE__ConnectiveAssignment ) )
            {
            // InternalMkDsl.g:367:2: ( ( rule__CONNECTIVE__ConnectiveAssignment ) )
            // InternalMkDsl.g:368:3: ( rule__CONNECTIVE__ConnectiveAssignment )
            {
             before(grammarAccess.getCONNECTIVEAccess().getConnectiveAssignment()); 
            // InternalMkDsl.g:369:3: ( rule__CONNECTIVE__ConnectiveAssignment )
            // InternalMkDsl.g:369:4: rule__CONNECTIVE__ConnectiveAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CONNECTIVE__ConnectiveAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCONNECTIVEAccess().getConnectiveAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCONNECTIVE"


    // $ANTLR start "entryRuleVARIABLE"
    // InternalMkDsl.g:378:1: entryRuleVARIABLE : ruleVARIABLE EOF ;
    public final void entryRuleVARIABLE() throws RecognitionException {
        try {
            // InternalMkDsl.g:379:1: ( ruleVARIABLE EOF )
            // InternalMkDsl.g:380:1: ruleVARIABLE EOF
            {
             before(grammarAccess.getVARIABLERule()); 
            pushFollow(FOLLOW_1);
            ruleVARIABLE();

            state._fsp--;

             after(grammarAccess.getVARIABLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVARIABLE"


    // $ANTLR start "ruleVARIABLE"
    // InternalMkDsl.g:387:1: ruleVARIABLE : ( ( rule__VARIABLE__Group__0 ) ) ;
    public final void ruleVARIABLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:391:2: ( ( ( rule__VARIABLE__Group__0 ) ) )
            // InternalMkDsl.g:392:2: ( ( rule__VARIABLE__Group__0 ) )
            {
            // InternalMkDsl.g:392:2: ( ( rule__VARIABLE__Group__0 ) )
            // InternalMkDsl.g:393:3: ( rule__VARIABLE__Group__0 )
            {
             before(grammarAccess.getVARIABLEAccess().getGroup()); 
            // InternalMkDsl.g:394:3: ( rule__VARIABLE__Group__0 )
            // InternalMkDsl.g:394:4: rule__VARIABLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VARIABLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVARIABLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVARIABLE"


    // $ANTLR start "entryRuleOPERAND"
    // InternalMkDsl.g:403:1: entryRuleOPERAND : ruleOPERAND EOF ;
    public final void entryRuleOPERAND() throws RecognitionException {
        try {
            // InternalMkDsl.g:404:1: ( ruleOPERAND EOF )
            // InternalMkDsl.g:405:1: ruleOPERAND EOF
            {
             before(grammarAccess.getOPERANDRule()); 
            pushFollow(FOLLOW_1);
            ruleOPERAND();

            state._fsp--;

             after(grammarAccess.getOPERANDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOPERAND"


    // $ANTLR start "ruleOPERAND"
    // InternalMkDsl.g:412:1: ruleOPERAND : ( ( rule__OPERAND__OperandAssignment ) ) ;
    public final void ruleOPERAND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:416:2: ( ( ( rule__OPERAND__OperandAssignment ) ) )
            // InternalMkDsl.g:417:2: ( ( rule__OPERAND__OperandAssignment ) )
            {
            // InternalMkDsl.g:417:2: ( ( rule__OPERAND__OperandAssignment ) )
            // InternalMkDsl.g:418:3: ( rule__OPERAND__OperandAssignment )
            {
             before(grammarAccess.getOPERANDAccess().getOperandAssignment()); 
            // InternalMkDsl.g:419:3: ( rule__OPERAND__OperandAssignment )
            // InternalMkDsl.g:419:4: rule__OPERAND__OperandAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OPERAND__OperandAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOPERANDAccess().getOperandAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOPERAND"


    // $ANTLR start "entryRuleLITERAL"
    // InternalMkDsl.g:428:1: entryRuleLITERAL : ruleLITERAL EOF ;
    public final void entryRuleLITERAL() throws RecognitionException {
        try {
            // InternalMkDsl.g:429:1: ( ruleLITERAL EOF )
            // InternalMkDsl.g:430:1: ruleLITERAL EOF
            {
             before(grammarAccess.getLITERALRule()); 
            pushFollow(FOLLOW_1);
            ruleLITERAL();

            state._fsp--;

             after(grammarAccess.getLITERALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLITERAL"


    // $ANTLR start "ruleLITERAL"
    // InternalMkDsl.g:437:1: ruleLITERAL : ( ( rule__LITERAL__Alternatives ) ) ;
    public final void ruleLITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:441:2: ( ( ( rule__LITERAL__Alternatives ) ) )
            // InternalMkDsl.g:442:2: ( ( rule__LITERAL__Alternatives ) )
            {
            // InternalMkDsl.g:442:2: ( ( rule__LITERAL__Alternatives ) )
            // InternalMkDsl.g:443:3: ( rule__LITERAL__Alternatives )
            {
             before(grammarAccess.getLITERALAccess().getAlternatives()); 
            // InternalMkDsl.g:444:3: ( rule__LITERAL__Alternatives )
            // InternalMkDsl.g:444:4: rule__LITERAL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LITERAL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLITERALAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLITERAL"


    // $ANTLR start "entryRuleCOLOR"
    // InternalMkDsl.g:453:1: entryRuleCOLOR : ruleCOLOR EOF ;
    public final void entryRuleCOLOR() throws RecognitionException {
        try {
            // InternalMkDsl.g:454:1: ( ruleCOLOR EOF )
            // InternalMkDsl.g:455:1: ruleCOLOR EOF
            {
             before(grammarAccess.getCOLORRule()); 
            pushFollow(FOLLOW_1);
            ruleCOLOR();

            state._fsp--;

             after(grammarAccess.getCOLORRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOLOR"


    // $ANTLR start "ruleCOLOR"
    // InternalMkDsl.g:462:1: ruleCOLOR : ( ( rule__COLOR__NameAssignment ) ) ;
    public final void ruleCOLOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:466:2: ( ( ( rule__COLOR__NameAssignment ) ) )
            // InternalMkDsl.g:467:2: ( ( rule__COLOR__NameAssignment ) )
            {
            // InternalMkDsl.g:467:2: ( ( rule__COLOR__NameAssignment ) )
            // InternalMkDsl.g:468:3: ( rule__COLOR__NameAssignment )
            {
             before(grammarAccess.getCOLORAccess().getNameAssignment()); 
            // InternalMkDsl.g:469:3: ( rule__COLOR__NameAssignment )
            // InternalMkDsl.g:469:4: rule__COLOR__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__COLOR__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCOLORAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOLOR"


    // $ANTLR start "rule__ESG__SubESGsAlternatives_3_0"
    // InternalMkDsl.g:477:1: rule__ESG__SubESGsAlternatives_3_0 : ( ( ruleVERTEX ) | ( ruleESG ) );
    public final void rule__ESG__SubESGsAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:481:1: ( ( ruleVERTEX ) | ( ruleESG ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMkDsl.g:482:2: ( ruleVERTEX )
                    {
                    // InternalMkDsl.g:482:2: ( ruleVERTEX )
                    // InternalMkDsl.g:483:3: ruleVERTEX
                    {
                     before(grammarAccess.getESGAccess().getSubESGsVERTEXParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVERTEX();

                    state._fsp--;

                     after(grammarAccess.getESGAccess().getSubESGsVERTEXParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:488:2: ( ruleESG )
                    {
                    // InternalMkDsl.g:488:2: ( ruleESG )
                    // InternalMkDsl.g:489:3: ruleESG
                    {
                     before(grammarAccess.getESGAccess().getSubESGsESGParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleESG();

                    state._fsp--;

                     after(grammarAccess.getESGAccess().getSubESGsESGParserRuleCall_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__SubESGsAlternatives_3_0"


    // $ANTLR start "rule__ESG__SubESGsAlternatives_4_1_0"
    // InternalMkDsl.g:498:1: rule__ESG__SubESGsAlternatives_4_1_0 : ( ( ruleVERTEX ) | ( ruleESG ) );
    public final void rule__ESG__SubESGsAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:502:1: ( ( ruleVERTEX ) | ( ruleESG ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMkDsl.g:503:2: ( ruleVERTEX )
                    {
                    // InternalMkDsl.g:503:2: ( ruleVERTEX )
                    // InternalMkDsl.g:504:3: ruleVERTEX
                    {
                     before(grammarAccess.getESGAccess().getSubESGsVERTEXParserRuleCall_4_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVERTEX();

                    state._fsp--;

                     after(grammarAccess.getESGAccess().getSubESGsVERTEXParserRuleCall_4_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:509:2: ( ruleESG )
                    {
                    // InternalMkDsl.g:509:2: ( ruleESG )
                    // InternalMkDsl.g:510:3: ruleESG
                    {
                     before(grammarAccess.getESGAccess().getSubESGsESGParserRuleCall_4_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleESG();

                    state._fsp--;

                     after(grammarAccess.getESGAccess().getSubESGsESGParserRuleCall_4_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__SubESGsAlternatives_4_1_0"


    // $ANTLR start "rule__EVALUABLE__Alternatives"
    // InternalMkDsl.g:519:1: rule__EVALUABLE__Alternatives : ( ( ruleEXPRESSION ) | ( ruleCONNECTIVE ) );
    public final void rule__EVALUABLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:523:1: ( ( ruleEXPRESSION ) | ( ruleCONNECTIVE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==40) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMkDsl.g:524:2: ( ruleEXPRESSION )
                    {
                    // InternalMkDsl.g:524:2: ( ruleEXPRESSION )
                    // InternalMkDsl.g:525:3: ruleEXPRESSION
                    {
                     before(grammarAccess.getEVALUABLEAccess().getEXPRESSIONParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEXPRESSION();

                    state._fsp--;

                     after(grammarAccess.getEVALUABLEAccess().getEXPRESSIONParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:530:2: ( ruleCONNECTIVE )
                    {
                    // InternalMkDsl.g:530:2: ( ruleCONNECTIVE )
                    // InternalMkDsl.g:531:3: ruleCONNECTIVE
                    {
                     before(grammarAccess.getEVALUABLEAccess().getCONNECTIVEParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCONNECTIVE();

                    state._fsp--;

                     after(grammarAccess.getEVALUABLEAccess().getCONNECTIVEParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVALUABLE__Alternatives"


    // $ANTLR start "rule__CONNECTIVE__ConnectiveAlternatives_0"
    // InternalMkDsl.g:540:1: rule__CONNECTIVE__ConnectiveAlternatives_0 : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__CONNECTIVE__ConnectiveAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:544:1: ( ( 'AND' ) | ( 'OR' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMkDsl.g:545:2: ( 'AND' )
                    {
                    // InternalMkDsl.g:545:2: ( 'AND' )
                    // InternalMkDsl.g:546:3: 'AND'
                    {
                     before(grammarAccess.getCONNECTIVEAccess().getConnectiveANDKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCONNECTIVEAccess().getConnectiveANDKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:551:2: ( 'OR' )
                    {
                    // InternalMkDsl.g:551:2: ( 'OR' )
                    // InternalMkDsl.g:552:3: 'OR'
                    {
                     before(grammarAccess.getCONNECTIVEAccess().getConnectiveORKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCONNECTIVEAccess().getConnectiveORKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONNECTIVE__ConnectiveAlternatives_0"


    // $ANTLR start "rule__OPERAND__OperandAlternatives_0"
    // InternalMkDsl.g:561:1: rule__OPERAND__OperandAlternatives_0 : ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) );
    public final void rule__OPERAND__OperandAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:565:1: ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMkDsl.g:566:2: ( '<' )
                    {
                    // InternalMkDsl.g:566:2: ( '<' )
                    // InternalMkDsl.g:567:3: '<'
                    {
                     before(grammarAccess.getOPERANDAccess().getOperandLessThanSGnKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOPERANDAccess().getOperandLessThanSGnKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:572:2: ( '<=' )
                    {
                    // InternalMkDsl.g:572:2: ( '<=' )
                    // InternalMkDsl.g:573:3: '<='
                    {
                     before(grammarAccess.getOPERANDAccess().getOperandLessThanSGnEqualsSGnKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOPERANDAccess().getOperandLessThanSGnEqualsSGnKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMkDsl.g:578:2: ( '==' )
                    {
                    // InternalMkDsl.g:578:2: ( '==' )
                    // InternalMkDsl.g:579:3: '=='
                    {
                     before(grammarAccess.getOPERANDAccess().getOperandEqualsSGnEqualsSGnKeyword_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOPERANDAccess().getOperandEqualsSGnEqualsSGnKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMkDsl.g:584:2: ( '>=' )
                    {
                    // InternalMkDsl.g:584:2: ( '>=' )
                    // InternalMkDsl.g:585:3: '>='
                    {
                     before(grammarAccess.getOPERANDAccess().getOperandGreaterThanSGnEqualsSGnKeyword_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOPERANDAccess().getOperandGreaterThanSGnEqualsSGnKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMkDsl.g:590:2: ( '>' )
                    {
                    // InternalMkDsl.g:590:2: ( '>' )
                    // InternalMkDsl.g:591:3: '>'
                    {
                     before(grammarAccess.getOPERANDAccess().getOperandGreaterThanSGnKeyword_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOPERANDAccess().getOperandGreaterThanSGnKeyword_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPERAND__OperandAlternatives_0"


    // $ANTLR start "rule__LITERAL__Alternatives"
    // InternalMkDsl.g:600:1: rule__LITERAL__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__LITERAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:604:1: ( ( RULE_INT ) | ( RULE_STRING ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMkDsl.g:605:2: ( RULE_INT )
                    {
                    // InternalMkDsl.g:605:2: ( RULE_INT )
                    // InternalMkDsl.g:606:3: RULE_INT
                    {
                     before(grammarAccess.getLITERALAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getLITERALAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:611:2: ( RULE_STRING )
                    {
                    // InternalMkDsl.g:611:2: ( RULE_STRING )
                    // InternalMkDsl.g:612:3: RULE_STRING
                    {
                     before(grammarAccess.getLITERALAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getLITERALAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LITERAL__Alternatives"


    // $ANTLR start "rule__COLOR__NameAlternatives_0"
    // InternalMkDsl.g:621:1: rule__COLOR__NameAlternatives_0 : ( ( 'black' ) | ( 'red' ) | ( 'green' ) | ( 'blue' ) | ( 'orange' ) );
    public final void rule__COLOR__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:625:1: ( ( 'black' ) | ( 'red' ) | ( 'green' ) | ( 'blue' ) | ( 'orange' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMkDsl.g:626:2: ( 'black' )
                    {
                    // InternalMkDsl.g:626:2: ( 'black' )
                    // InternalMkDsl.g:627:3: 'black'
                    {
                     before(grammarAccess.getCOLORAccess().getNameBlackKeyword_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCOLORAccess().getNameBlackKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:632:2: ( 'red' )
                    {
                    // InternalMkDsl.g:632:2: ( 'red' )
                    // InternalMkDsl.g:633:3: 'red'
                    {
                     before(grammarAccess.getCOLORAccess().getNameRedKeyword_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCOLORAccess().getNameRedKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMkDsl.g:638:2: ( 'green' )
                    {
                    // InternalMkDsl.g:638:2: ( 'green' )
                    // InternalMkDsl.g:639:3: 'green'
                    {
                     before(grammarAccess.getCOLORAccess().getNameGreenKeyword_0_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCOLORAccess().getNameGreenKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMkDsl.g:644:2: ( 'blue' )
                    {
                    // InternalMkDsl.g:644:2: ( 'blue' )
                    // InternalMkDsl.g:645:3: 'blue'
                    {
                     before(grammarAccess.getCOLORAccess().getNameBlueKeyword_0_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCOLORAccess().getNameBlueKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMkDsl.g:650:2: ( 'orange' )
                    {
                    // InternalMkDsl.g:650:2: ( 'orange' )
                    // InternalMkDsl.g:651:3: 'orange'
                    {
                     before(grammarAccess.getCOLORAccess().getNameOrangeKeyword_0_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCOLORAccess().getNameOrangeKeyword_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR__NameAlternatives_0"


    // $ANTLR start "rule__ESG__Group__0"
    // InternalMkDsl.g:660:1: rule__ESG__Group__0 : rule__ESG__Group__0__Impl rule__ESG__Group__1 ;
    public final void rule__ESG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:664:1: ( rule__ESG__Group__0__Impl rule__ESG__Group__1 )
            // InternalMkDsl.g:665:2: rule__ESG__Group__0__Impl rule__ESG__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ESG__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ESG__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__0"


    // $ANTLR start "rule__ESG__Group__0__Impl"
    // InternalMkDsl.g:672:1: rule__ESG__Group__0__Impl : ( 'ESG' ) ;
    public final void rule__ESG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:676:1: ( ( 'ESG' ) )
            // InternalMkDsl.g:677:1: ( 'ESG' )
            {
            // InternalMkDsl.g:677:1: ( 'ESG' )
            // InternalMkDsl.g:678:2: 'ESG'
            {
             before(grammarAccess.getESGAccess().getESGKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getESGAccess().getESGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__0__Impl"


    // $ANTLR start "rule__ESG__Group__1"
    // InternalMkDsl.g:687:1: rule__ESG__Group__1 : rule__ESG__Group__1__Impl rule__ESG__Group__2 ;
    public final void rule__ESG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:691:1: ( rule__ESG__Group__1__Impl rule__ESG__Group__2 )
            // InternalMkDsl.g:692:2: rule__ESG__Group__1__Impl rule__ESG__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ESG__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ESG__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__1"


    // $ANTLR start "rule__ESG__Group__1__Impl"
    // InternalMkDsl.g:699:1: rule__ESG__Group__1__Impl : ( ( rule__ESG__NameAssignment_1 ) ) ;
    public final void rule__ESG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:703:1: ( ( ( rule__ESG__NameAssignment_1 ) ) )
            // InternalMkDsl.g:704:1: ( ( rule__ESG__NameAssignment_1 ) )
            {
            // InternalMkDsl.g:704:1: ( ( rule__ESG__NameAssignment_1 ) )
            // InternalMkDsl.g:705:2: ( rule__ESG__NameAssignment_1 )
            {
             before(grammarAccess.getESGAccess().getNameAssignment_1()); 
            // InternalMkDsl.g:706:2: ( rule__ESG__NameAssignment_1 )
            // InternalMkDsl.g:706:3: rule__ESG__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ESG__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getESGAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__1__Impl"


    // $ANTLR start "rule__ESG__Group__2"
    // InternalMkDsl.g:714:1: rule__ESG__Group__2 : rule__ESG__Group__2__Impl rule__ESG__Group__3 ;
    public final void rule__ESG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:718:1: ( rule__ESG__Group__2__Impl rule__ESG__Group__3 )
            // InternalMkDsl.g:719:2: rule__ESG__Group__2__Impl rule__ESG__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ESG__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ESG__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__2"


    // $ANTLR start "rule__ESG__Group__2__Impl"
    // InternalMkDsl.g:726:1: rule__ESG__Group__2__Impl : ( ( rule__ESG__Group_2__0 )? ) ;
    public final void rule__ESG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:730:1: ( ( ( rule__ESG__Group_2__0 )? ) )
            // InternalMkDsl.g:731:1: ( ( rule__ESG__Group_2__0 )? )
            {
            // InternalMkDsl.g:731:1: ( ( rule__ESG__Group_2__0 )? )
            // InternalMkDsl.g:732:2: ( rule__ESG__Group_2__0 )?
            {
             before(grammarAccess.getESGAccess().getGroup_2()); 
            // InternalMkDsl.g:733:2: ( rule__ESG__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMkDsl.g:733:3: rule__ESG__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ESG__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getESGAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__2__Impl"


    // $ANTLR start "rule__ESG__Group__3"
    // InternalMkDsl.g:741:1: rule__ESG__Group__3 : rule__ESG__Group__3__Impl rule__ESG__Group__4 ;
    public final void rule__ESG__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:745:1: ( rule__ESG__Group__3__Impl rule__ESG__Group__4 )
            // InternalMkDsl.g:746:2: rule__ESG__Group__3__Impl rule__ESG__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ESG__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ESG__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__3"


    // $ANTLR start "rule__ESG__Group__3__Impl"
    // InternalMkDsl.g:753:1: rule__ESG__Group__3__Impl : ( ( rule__ESG__SubESGsAssignment_3 ) ) ;
    public final void rule__ESG__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:757:1: ( ( ( rule__ESG__SubESGsAssignment_3 ) ) )
            // InternalMkDsl.g:758:1: ( ( rule__ESG__SubESGsAssignment_3 ) )
            {
            // InternalMkDsl.g:758:1: ( ( rule__ESG__SubESGsAssignment_3 ) )
            // InternalMkDsl.g:759:2: ( rule__ESG__SubESGsAssignment_3 )
            {
             before(grammarAccess.getESGAccess().getSubESGsAssignment_3()); 
            // InternalMkDsl.g:760:2: ( rule__ESG__SubESGsAssignment_3 )
            // InternalMkDsl.g:760:3: rule__ESG__SubESGsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ESG__SubESGsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getESGAccess().getSubESGsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__3__Impl"


    // $ANTLR start "rule__ESG__Group__4"
    // InternalMkDsl.g:768:1: rule__ESG__Group__4 : rule__ESG__Group__4__Impl rule__ESG__Group__5 ;
    public final void rule__ESG__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:772:1: ( rule__ESG__Group__4__Impl rule__ESG__Group__5 )
            // InternalMkDsl.g:773:2: rule__ESG__Group__4__Impl rule__ESG__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ESG__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ESG__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__4"


    // $ANTLR start "rule__ESG__Group__4__Impl"
    // InternalMkDsl.g:780:1: rule__ESG__Group__4__Impl : ( ( rule__ESG__Group_4__0 )* ) ;
    public final void rule__ESG__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:784:1: ( ( ( rule__ESG__Group_4__0 )* ) )
            // InternalMkDsl.g:785:1: ( ( rule__ESG__Group_4__0 )* )
            {
            // InternalMkDsl.g:785:1: ( ( rule__ESG__Group_4__0 )* )
            // InternalMkDsl.g:786:2: ( rule__ESG__Group_4__0 )*
            {
             before(grammarAccess.getESGAccess().getGroup_4()); 
            // InternalMkDsl.g:787:2: ( rule__ESG__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMkDsl.g:787:3: rule__ESG__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ESG__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getESGAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__4__Impl"


    // $ANTLR start "rule__ESG__Group__5"
    // InternalMkDsl.g:795:1: rule__ESG__Group__5 : rule__ESG__Group__5__Impl rule__ESG__Group__6 ;
    public final void rule__ESG__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:799:1: ( rule__ESG__Group__5__Impl rule__ESG__Group__6 )
            // InternalMkDsl.g:800:2: rule__ESG__Group__5__Impl rule__ESG__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__ESG__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ESG__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__5"


    // $ANTLR start "rule__ESG__Group__5__Impl"
    // InternalMkDsl.g:807:1: rule__ESG__Group__5__Impl : ( ( rule__ESG__EdgesAssignment_5 ) ) ;
    public final void rule__ESG__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:811:1: ( ( ( rule__ESG__EdgesAssignment_5 ) ) )
            // InternalMkDsl.g:812:1: ( ( rule__ESG__EdgesAssignment_5 ) )
            {
            // InternalMkDsl.g:812:1: ( ( rule__ESG__EdgesAssignment_5 ) )
            // InternalMkDsl.g:813:2: ( rule__ESG__EdgesAssignment_5 )
            {
             before(grammarAccess.getESGAccess().getEdgesAssignment_5()); 
            // InternalMkDsl.g:814:2: ( rule__ESG__EdgesAssignment_5 )
            // InternalMkDsl.g:814:3: rule__ESG__EdgesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ESG__EdgesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getESGAccess().getEdgesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__5__Impl"


    // $ANTLR start "rule__ESG__Group__6"
    // InternalMkDsl.g:822:1: rule__ESG__Group__6 : rule__ESG__Group__6__Impl ;
    public final void rule__ESG__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:826:1: ( rule__ESG__Group__6__Impl )
            // InternalMkDsl.g:827:2: rule__ESG__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ESG__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__6"


    // $ANTLR start "rule__ESG__Group__6__Impl"
    // InternalMkDsl.g:833:1: rule__ESG__Group__6__Impl : ( ( rule__ESG__Group_6__0 )* ) ;
    public final void rule__ESG__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:837:1: ( ( ( rule__ESG__Group_6__0 )* ) )
            // InternalMkDsl.g:838:1: ( ( rule__ESG__Group_6__0 )* )
            {
            // InternalMkDsl.g:838:1: ( ( rule__ESG__Group_6__0 )* )
            // InternalMkDsl.g:839:2: ( rule__ESG__Group_6__0 )*
            {
             before(grammarAccess.getESGAccess().getGroup_6()); 
            // InternalMkDsl.g:840:2: ( rule__ESG__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==29) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalMkDsl.g:840:3: rule__ESG__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ESG__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getESGAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group__6__Impl"


    // $ANTLR start "rule__ESG__Group_2__0"
    // InternalMkDsl.g:849:1: rule__ESG__Group_2__0 : rule__ESG__Group_2__0__Impl rule__ESG__Group_2__1 ;
    public final void rule__ESG__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:853:1: ( rule__ESG__Group_2__0__Impl rule__ESG__Group_2__1 )
            // InternalMkDsl.g:854:2: rule__ESG__Group_2__0__Impl rule__ESG__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__ESG__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ESG__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group_2__0"


    // $ANTLR start "rule__ESG__Group_2__0__Impl"
    // InternalMkDsl.g:861:1: rule__ESG__Group_2__0__Impl : ( 'Event' ) ;
    public final void rule__ESG__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:865:1: ( ( 'Event' ) )
            // InternalMkDsl.g:866:1: ( 'Event' )
            {
            // InternalMkDsl.g:866:1: ( 'Event' )
            // InternalMkDsl.g:867:2: 'Event'
            {
             before(grammarAccess.getESGAccess().getEventKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getESGAccess().getEventKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group_2__0__Impl"


    // $ANTLR start "rule__ESG__Group_2__1"
    // InternalMkDsl.g:876:1: rule__ESG__Group_2__1 : rule__ESG__Group_2__1__Impl ;
    public final void rule__ESG__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:880:1: ( rule__ESG__Group_2__1__Impl )
            // InternalMkDsl.g:881:2: rule__ESG__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ESG__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group_2__1"


    // $ANTLR start "rule__ESG__Group_2__1__Impl"
    // InternalMkDsl.g:887:1: rule__ESG__Group_2__1__Impl : ( ( rule__ESG__EventAssignment_2_1 ) ) ;
    public final void rule__ESG__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:891:1: ( ( ( rule__ESG__EventAssignment_2_1 ) ) )
            // InternalMkDsl.g:892:1: ( ( rule__ESG__EventAssignment_2_1 ) )
            {
            // InternalMkDsl.g:892:1: ( ( rule__ESG__EventAssignment_2_1 ) )
            // InternalMkDsl.g:893:2: ( rule__ESG__EventAssignment_2_1 )
            {
             before(grammarAccess.getESGAccess().getEventAssignment_2_1()); 
            // InternalMkDsl.g:894:2: ( rule__ESG__EventAssignment_2_1 )
            // InternalMkDsl.g:894:3: rule__ESG__EventAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ESG__EventAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getESGAccess().getEventAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group_2__1__Impl"


    // $ANTLR start "rule__ESG__Group_4__0"
    // InternalMkDsl.g:903:1: rule__ESG__Group_4__0 : rule__ESG__Group_4__0__Impl rule__ESG__Group_4__1 ;
    public final void rule__ESG__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:907:1: ( rule__ESG__Group_4__0__Impl rule__ESG__Group_4__1 )
            // InternalMkDsl.g:908:2: rule__ESG__Group_4__0__Impl rule__ESG__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__ESG__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ESG__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group_4__0"


    // $ANTLR start "rule__ESG__Group_4__0__Impl"
    // InternalMkDsl.g:915:1: rule__ESG__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ESG__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:919:1: ( ( ',' ) )
            // InternalMkDsl.g:920:1: ( ',' )
            {
            // InternalMkDsl.g:920:1: ( ',' )
            // InternalMkDsl.g:921:2: ','
            {
             before(grammarAccess.getESGAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getESGAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group_4__0__Impl"


    // $ANTLR start "rule__ESG__Group_4__1"
    // InternalMkDsl.g:930:1: rule__ESG__Group_4__1 : rule__ESG__Group_4__1__Impl ;
    public final void rule__ESG__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:934:1: ( rule__ESG__Group_4__1__Impl )
            // InternalMkDsl.g:935:2: rule__ESG__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ESG__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group_4__1"


    // $ANTLR start "rule__ESG__Group_4__1__Impl"
    // InternalMkDsl.g:941:1: rule__ESG__Group_4__1__Impl : ( ( rule__ESG__SubESGsAssignment_4_1 ) ) ;
    public final void rule__ESG__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:945:1: ( ( ( rule__ESG__SubESGsAssignment_4_1 ) ) )
            // InternalMkDsl.g:946:1: ( ( rule__ESG__SubESGsAssignment_4_1 ) )
            {
            // InternalMkDsl.g:946:1: ( ( rule__ESG__SubESGsAssignment_4_1 ) )
            // InternalMkDsl.g:947:2: ( rule__ESG__SubESGsAssignment_4_1 )
            {
             before(grammarAccess.getESGAccess().getSubESGsAssignment_4_1()); 
            // InternalMkDsl.g:948:2: ( rule__ESG__SubESGsAssignment_4_1 )
            // InternalMkDsl.g:948:3: rule__ESG__SubESGsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ESG__SubESGsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getESGAccess().getSubESGsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group_4__1__Impl"


    // $ANTLR start "rule__ESG__Group_6__0"
    // InternalMkDsl.g:957:1: rule__ESG__Group_6__0 : rule__ESG__Group_6__0__Impl rule__ESG__Group_6__1 ;
    public final void rule__ESG__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:961:1: ( rule__ESG__Group_6__0__Impl rule__ESG__Group_6__1 )
            // InternalMkDsl.g:962:2: rule__ESG__Group_6__0__Impl rule__ESG__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__ESG__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ESG__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group_6__0"


    // $ANTLR start "rule__ESG__Group_6__0__Impl"
    // InternalMkDsl.g:969:1: rule__ESG__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ESG__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:973:1: ( ( ',' ) )
            // InternalMkDsl.g:974:1: ( ',' )
            {
            // InternalMkDsl.g:974:1: ( ',' )
            // InternalMkDsl.g:975:2: ','
            {
             before(grammarAccess.getESGAccess().getCommaKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getESGAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group_6__0__Impl"


    // $ANTLR start "rule__ESG__Group_6__1"
    // InternalMkDsl.g:984:1: rule__ESG__Group_6__1 : rule__ESG__Group_6__1__Impl ;
    public final void rule__ESG__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:988:1: ( rule__ESG__Group_6__1__Impl )
            // InternalMkDsl.g:989:2: rule__ESG__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ESG__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group_6__1"


    // $ANTLR start "rule__ESG__Group_6__1__Impl"
    // InternalMkDsl.g:995:1: rule__ESG__Group_6__1__Impl : ( ( rule__ESG__EdgesAssignment_6_1 ) ) ;
    public final void rule__ESG__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:999:1: ( ( ( rule__ESG__EdgesAssignment_6_1 ) ) )
            // InternalMkDsl.g:1000:1: ( ( rule__ESG__EdgesAssignment_6_1 ) )
            {
            // InternalMkDsl.g:1000:1: ( ( rule__ESG__EdgesAssignment_6_1 ) )
            // InternalMkDsl.g:1001:2: ( rule__ESG__EdgesAssignment_6_1 )
            {
             before(grammarAccess.getESGAccess().getEdgesAssignment_6_1()); 
            // InternalMkDsl.g:1002:2: ( rule__ESG__EdgesAssignment_6_1 )
            // InternalMkDsl.g:1002:3: rule__ESG__EdgesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ESG__EdgesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getESGAccess().getEdgesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__Group_6__1__Impl"


    // $ANTLR start "rule__VERTEX__Group__0"
    // InternalMkDsl.g:1011:1: rule__VERTEX__Group__0 : rule__VERTEX__Group__0__Impl rule__VERTEX__Group__1 ;
    public final void rule__VERTEX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1015:1: ( rule__VERTEX__Group__0__Impl rule__VERTEX__Group__1 )
            // InternalMkDsl.g:1016:2: rule__VERTEX__Group__0__Impl rule__VERTEX__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__VERTEX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERTEX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__0"


    // $ANTLR start "rule__VERTEX__Group__0__Impl"
    // InternalMkDsl.g:1023:1: rule__VERTEX__Group__0__Impl : ( 'Vertex' ) ;
    public final void rule__VERTEX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1027:1: ( ( 'Vertex' ) )
            // InternalMkDsl.g:1028:1: ( 'Vertex' )
            {
            // InternalMkDsl.g:1028:1: ( 'Vertex' )
            // InternalMkDsl.g:1029:2: 'Vertex'
            {
             before(grammarAccess.getVERTEXAccess().getVertexKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVERTEXAccess().getVertexKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__0__Impl"


    // $ANTLR start "rule__VERTEX__Group__1"
    // InternalMkDsl.g:1038:1: rule__VERTEX__Group__1 : rule__VERTEX__Group__1__Impl rule__VERTEX__Group__2 ;
    public final void rule__VERTEX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1042:1: ( rule__VERTEX__Group__1__Impl rule__VERTEX__Group__2 )
            // InternalMkDsl.g:1043:2: rule__VERTEX__Group__1__Impl rule__VERTEX__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VERTEX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERTEX__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__1"


    // $ANTLR start "rule__VERTEX__Group__1__Impl"
    // InternalMkDsl.g:1050:1: rule__VERTEX__Group__1__Impl : ( 'ID' ) ;
    public final void rule__VERTEX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1054:1: ( ( 'ID' ) )
            // InternalMkDsl.g:1055:1: ( 'ID' )
            {
            // InternalMkDsl.g:1055:1: ( 'ID' )
            // InternalMkDsl.g:1056:2: 'ID'
            {
             before(grammarAccess.getVERTEXAccess().getIDKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVERTEXAccess().getIDKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__1__Impl"


    // $ANTLR start "rule__VERTEX__Group__2"
    // InternalMkDsl.g:1065:1: rule__VERTEX__Group__2 : rule__VERTEX__Group__2__Impl rule__VERTEX__Group__3 ;
    public final void rule__VERTEX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1069:1: ( rule__VERTEX__Group__2__Impl rule__VERTEX__Group__3 )
            // InternalMkDsl.g:1070:2: rule__VERTEX__Group__2__Impl rule__VERTEX__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__VERTEX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERTEX__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__2"


    // $ANTLR start "rule__VERTEX__Group__2__Impl"
    // InternalMkDsl.g:1077:1: rule__VERTEX__Group__2__Impl : ( ( rule__VERTEX__IDAssignment_2 ) ) ;
    public final void rule__VERTEX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1081:1: ( ( ( rule__VERTEX__IDAssignment_2 ) ) )
            // InternalMkDsl.g:1082:1: ( ( rule__VERTEX__IDAssignment_2 ) )
            {
            // InternalMkDsl.g:1082:1: ( ( rule__VERTEX__IDAssignment_2 ) )
            // InternalMkDsl.g:1083:2: ( rule__VERTEX__IDAssignment_2 )
            {
             before(grammarAccess.getVERTEXAccess().getIDAssignment_2()); 
            // InternalMkDsl.g:1084:2: ( rule__VERTEX__IDAssignment_2 )
            // InternalMkDsl.g:1084:3: rule__VERTEX__IDAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VERTEX__IDAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVERTEXAccess().getIDAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__2__Impl"


    // $ANTLR start "rule__VERTEX__Group__3"
    // InternalMkDsl.g:1092:1: rule__VERTEX__Group__3 : rule__VERTEX__Group__3__Impl rule__VERTEX__Group__4 ;
    public final void rule__VERTEX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1096:1: ( rule__VERTEX__Group__3__Impl rule__VERTEX__Group__4 )
            // InternalMkDsl.g:1097:2: rule__VERTEX__Group__3__Impl rule__VERTEX__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__VERTEX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERTEX__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__3"


    // $ANTLR start "rule__VERTEX__Group__3__Impl"
    // InternalMkDsl.g:1104:1: rule__VERTEX__Group__3__Impl : ( 'Event' ) ;
    public final void rule__VERTEX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1108:1: ( ( 'Event' ) )
            // InternalMkDsl.g:1109:1: ( 'Event' )
            {
            // InternalMkDsl.g:1109:1: ( 'Event' )
            // InternalMkDsl.g:1110:2: 'Event'
            {
             before(grammarAccess.getVERTEXAccess().getEventKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVERTEXAccess().getEventKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__3__Impl"


    // $ANTLR start "rule__VERTEX__Group__4"
    // InternalMkDsl.g:1119:1: rule__VERTEX__Group__4 : rule__VERTEX__Group__4__Impl rule__VERTEX__Group__5 ;
    public final void rule__VERTEX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1123:1: ( rule__VERTEX__Group__4__Impl rule__VERTEX__Group__5 )
            // InternalMkDsl.g:1124:2: rule__VERTEX__Group__4__Impl rule__VERTEX__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__VERTEX__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERTEX__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__4"


    // $ANTLR start "rule__VERTEX__Group__4__Impl"
    // InternalMkDsl.g:1131:1: rule__VERTEX__Group__4__Impl : ( ( rule__VERTEX__EventAssignment_4 ) ) ;
    public final void rule__VERTEX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1135:1: ( ( ( rule__VERTEX__EventAssignment_4 ) ) )
            // InternalMkDsl.g:1136:1: ( ( rule__VERTEX__EventAssignment_4 ) )
            {
            // InternalMkDsl.g:1136:1: ( ( rule__VERTEX__EventAssignment_4 ) )
            // InternalMkDsl.g:1137:2: ( rule__VERTEX__EventAssignment_4 )
            {
             before(grammarAccess.getVERTEXAccess().getEventAssignment_4()); 
            // InternalMkDsl.g:1138:2: ( rule__VERTEX__EventAssignment_4 )
            // InternalMkDsl.g:1138:3: rule__VERTEX__EventAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VERTEX__EventAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVERTEXAccess().getEventAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__4__Impl"


    // $ANTLR start "rule__VERTEX__Group__5"
    // InternalMkDsl.g:1146:1: rule__VERTEX__Group__5 : rule__VERTEX__Group__5__Impl rule__VERTEX__Group__6 ;
    public final void rule__VERTEX__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1150:1: ( rule__VERTEX__Group__5__Impl rule__VERTEX__Group__6 )
            // InternalMkDsl.g:1151:2: rule__VERTEX__Group__5__Impl rule__VERTEX__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__VERTEX__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERTEX__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__5"


    // $ANTLR start "rule__VERTEX__Group__5__Impl"
    // InternalMkDsl.g:1158:1: rule__VERTEX__Group__5__Impl : ( ( rule__VERTEX__Group_5__0 )? ) ;
    public final void rule__VERTEX__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1162:1: ( ( ( rule__VERTEX__Group_5__0 )? ) )
            // InternalMkDsl.g:1163:1: ( ( rule__VERTEX__Group_5__0 )? )
            {
            // InternalMkDsl.g:1163:1: ( ( rule__VERTEX__Group_5__0 )? )
            // InternalMkDsl.g:1164:2: ( rule__VERTEX__Group_5__0 )?
            {
             before(grammarAccess.getVERTEXAccess().getGroup_5()); 
            // InternalMkDsl.g:1165:2: ( rule__VERTEX__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMkDsl.g:1165:3: rule__VERTEX__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERTEX__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVERTEXAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__5__Impl"


    // $ANTLR start "rule__VERTEX__Group__6"
    // InternalMkDsl.g:1173:1: rule__VERTEX__Group__6 : rule__VERTEX__Group__6__Impl ;
    public final void rule__VERTEX__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1177:1: ( rule__VERTEX__Group__6__Impl )
            // InternalMkDsl.g:1178:2: rule__VERTEX__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERTEX__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__6"


    // $ANTLR start "rule__VERTEX__Group__6__Impl"
    // InternalMkDsl.g:1184:1: rule__VERTEX__Group__6__Impl : ( ( rule__VERTEX__DtAssignment_6 )? ) ;
    public final void rule__VERTEX__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1188:1: ( ( ( rule__VERTEX__DtAssignment_6 )? ) )
            // InternalMkDsl.g:1189:1: ( ( rule__VERTEX__DtAssignment_6 )? )
            {
            // InternalMkDsl.g:1189:1: ( ( rule__VERTEX__DtAssignment_6 )? )
            // InternalMkDsl.g:1190:2: ( rule__VERTEX__DtAssignment_6 )?
            {
             before(grammarAccess.getVERTEXAccess().getDtAssignment_6()); 
            // InternalMkDsl.g:1191:2: ( rule__VERTEX__DtAssignment_6 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMkDsl.g:1191:3: rule__VERTEX__DtAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__VERTEX__DtAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVERTEXAccess().getDtAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group__6__Impl"


    // $ANTLR start "rule__VERTEX__Group_5__0"
    // InternalMkDsl.g:1200:1: rule__VERTEX__Group_5__0 : rule__VERTEX__Group_5__0__Impl rule__VERTEX__Group_5__1 ;
    public final void rule__VERTEX__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1204:1: ( rule__VERTEX__Group_5__0__Impl rule__VERTEX__Group_5__1 )
            // InternalMkDsl.g:1205:2: rule__VERTEX__Group_5__0__Impl rule__VERTEX__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__VERTEX__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERTEX__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group_5__0"


    // $ANTLR start "rule__VERTEX__Group_5__0__Impl"
    // InternalMkDsl.g:1212:1: rule__VERTEX__Group_5__0__Impl : ( 'Color' ) ;
    public final void rule__VERTEX__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1216:1: ( ( 'Color' ) )
            // InternalMkDsl.g:1217:1: ( 'Color' )
            {
            // InternalMkDsl.g:1217:1: ( 'Color' )
            // InternalMkDsl.g:1218:2: 'Color'
            {
             before(grammarAccess.getVERTEXAccess().getColorKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVERTEXAccess().getColorKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group_5__0__Impl"


    // $ANTLR start "rule__VERTEX__Group_5__1"
    // InternalMkDsl.g:1227:1: rule__VERTEX__Group_5__1 : rule__VERTEX__Group_5__1__Impl ;
    public final void rule__VERTEX__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1231:1: ( rule__VERTEX__Group_5__1__Impl )
            // InternalMkDsl.g:1232:2: rule__VERTEX__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERTEX__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group_5__1"


    // $ANTLR start "rule__VERTEX__Group_5__1__Impl"
    // InternalMkDsl.g:1238:1: rule__VERTEX__Group_5__1__Impl : ( ( rule__VERTEX__ColorAssignment_5_1 ) ) ;
    public final void rule__VERTEX__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1242:1: ( ( ( rule__VERTEX__ColorAssignment_5_1 ) ) )
            // InternalMkDsl.g:1243:1: ( ( rule__VERTEX__ColorAssignment_5_1 ) )
            {
            // InternalMkDsl.g:1243:1: ( ( rule__VERTEX__ColorAssignment_5_1 ) )
            // InternalMkDsl.g:1244:2: ( rule__VERTEX__ColorAssignment_5_1 )
            {
             before(grammarAccess.getVERTEXAccess().getColorAssignment_5_1()); 
            // InternalMkDsl.g:1245:2: ( rule__VERTEX__ColorAssignment_5_1 )
            // InternalMkDsl.g:1245:3: rule__VERTEX__ColorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__VERTEX__ColorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVERTEXAccess().getColorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__Group_5__1__Impl"


    // $ANTLR start "rule__EDGE__Group__0"
    // InternalMkDsl.g:1254:1: rule__EDGE__Group__0 : rule__EDGE__Group__0__Impl rule__EDGE__Group__1 ;
    public final void rule__EDGE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1258:1: ( rule__EDGE__Group__0__Impl rule__EDGE__Group__1 )
            // InternalMkDsl.g:1259:2: rule__EDGE__Group__0__Impl rule__EDGE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EDGE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDGE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__0"


    // $ANTLR start "rule__EDGE__Group__0__Impl"
    // InternalMkDsl.g:1266:1: rule__EDGE__Group__0__Impl : ( 'Edge' ) ;
    public final void rule__EDGE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1270:1: ( ( 'Edge' ) )
            // InternalMkDsl.g:1271:1: ( 'Edge' )
            {
            // InternalMkDsl.g:1271:1: ( 'Edge' )
            // InternalMkDsl.g:1272:2: 'Edge'
            {
             before(grammarAccess.getEDGEAccess().getEdgeKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEDGEAccess().getEdgeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__0__Impl"


    // $ANTLR start "rule__EDGE__Group__1"
    // InternalMkDsl.g:1281:1: rule__EDGE__Group__1 : rule__EDGE__Group__1__Impl rule__EDGE__Group__2 ;
    public final void rule__EDGE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1285:1: ( rule__EDGE__Group__1__Impl rule__EDGE__Group__2 )
            // InternalMkDsl.g:1286:2: rule__EDGE__Group__1__Impl rule__EDGE__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__EDGE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDGE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__1"


    // $ANTLR start "rule__EDGE__Group__1__Impl"
    // InternalMkDsl.g:1293:1: rule__EDGE__Group__1__Impl : ( ( rule__EDGE__NameAssignment_1 ) ) ;
    public final void rule__EDGE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1297:1: ( ( ( rule__EDGE__NameAssignment_1 ) ) )
            // InternalMkDsl.g:1298:1: ( ( rule__EDGE__NameAssignment_1 ) )
            {
            // InternalMkDsl.g:1298:1: ( ( rule__EDGE__NameAssignment_1 ) )
            // InternalMkDsl.g:1299:2: ( rule__EDGE__NameAssignment_1 )
            {
             before(grammarAccess.getEDGEAccess().getNameAssignment_1()); 
            // InternalMkDsl.g:1300:2: ( rule__EDGE__NameAssignment_1 )
            // InternalMkDsl.g:1300:3: rule__EDGE__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EDGE__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEDGEAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__1__Impl"


    // $ANTLR start "rule__EDGE__Group__2"
    // InternalMkDsl.g:1308:1: rule__EDGE__Group__2 : rule__EDGE__Group__2__Impl rule__EDGE__Group__3 ;
    public final void rule__EDGE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1312:1: ( rule__EDGE__Group__2__Impl rule__EDGE__Group__3 )
            // InternalMkDsl.g:1313:2: rule__EDGE__Group__2__Impl rule__EDGE__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__EDGE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDGE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__2"


    // $ANTLR start "rule__EDGE__Group__2__Impl"
    // InternalMkDsl.g:1320:1: rule__EDGE__Group__2__Impl : ( 'Source' ) ;
    public final void rule__EDGE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1324:1: ( ( 'Source' ) )
            // InternalMkDsl.g:1325:1: ( 'Source' )
            {
            // InternalMkDsl.g:1325:1: ( 'Source' )
            // InternalMkDsl.g:1326:2: 'Source'
            {
             before(grammarAccess.getEDGEAccess().getSourceKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEDGEAccess().getSourceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__2__Impl"


    // $ANTLR start "rule__EDGE__Group__3"
    // InternalMkDsl.g:1335:1: rule__EDGE__Group__3 : rule__EDGE__Group__3__Impl rule__EDGE__Group__4 ;
    public final void rule__EDGE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1339:1: ( rule__EDGE__Group__3__Impl rule__EDGE__Group__4 )
            // InternalMkDsl.g:1340:2: rule__EDGE__Group__3__Impl rule__EDGE__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__EDGE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDGE__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__3"


    // $ANTLR start "rule__EDGE__Group__3__Impl"
    // InternalMkDsl.g:1347:1: rule__EDGE__Group__3__Impl : ( ( rule__EDGE__SourceAssignment_3 ) ) ;
    public final void rule__EDGE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1351:1: ( ( ( rule__EDGE__SourceAssignment_3 ) ) )
            // InternalMkDsl.g:1352:1: ( ( rule__EDGE__SourceAssignment_3 ) )
            {
            // InternalMkDsl.g:1352:1: ( ( rule__EDGE__SourceAssignment_3 ) )
            // InternalMkDsl.g:1353:2: ( rule__EDGE__SourceAssignment_3 )
            {
             before(grammarAccess.getEDGEAccess().getSourceAssignment_3()); 
            // InternalMkDsl.g:1354:2: ( rule__EDGE__SourceAssignment_3 )
            // InternalMkDsl.g:1354:3: rule__EDGE__SourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EDGE__SourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEDGEAccess().getSourceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__3__Impl"


    // $ANTLR start "rule__EDGE__Group__4"
    // InternalMkDsl.g:1362:1: rule__EDGE__Group__4 : rule__EDGE__Group__4__Impl rule__EDGE__Group__5 ;
    public final void rule__EDGE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1366:1: ( rule__EDGE__Group__4__Impl rule__EDGE__Group__5 )
            // InternalMkDsl.g:1367:2: rule__EDGE__Group__4__Impl rule__EDGE__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__EDGE__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDGE__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__4"


    // $ANTLR start "rule__EDGE__Group__4__Impl"
    // InternalMkDsl.g:1374:1: rule__EDGE__Group__4__Impl : ( 'Target' ) ;
    public final void rule__EDGE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1378:1: ( ( 'Target' ) )
            // InternalMkDsl.g:1379:1: ( 'Target' )
            {
            // InternalMkDsl.g:1379:1: ( 'Target' )
            // InternalMkDsl.g:1380:2: 'Target'
            {
             before(grammarAccess.getEDGEAccess().getTargetKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEDGEAccess().getTargetKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__4__Impl"


    // $ANTLR start "rule__EDGE__Group__5"
    // InternalMkDsl.g:1389:1: rule__EDGE__Group__5 : rule__EDGE__Group__5__Impl rule__EDGE__Group__6 ;
    public final void rule__EDGE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1393:1: ( rule__EDGE__Group__5__Impl rule__EDGE__Group__6 )
            // InternalMkDsl.g:1394:2: rule__EDGE__Group__5__Impl rule__EDGE__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__EDGE__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDGE__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__5"


    // $ANTLR start "rule__EDGE__Group__5__Impl"
    // InternalMkDsl.g:1401:1: rule__EDGE__Group__5__Impl : ( ( rule__EDGE__TargetAssignment_5 ) ) ;
    public final void rule__EDGE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1405:1: ( ( ( rule__EDGE__TargetAssignment_5 ) ) )
            // InternalMkDsl.g:1406:1: ( ( rule__EDGE__TargetAssignment_5 ) )
            {
            // InternalMkDsl.g:1406:1: ( ( rule__EDGE__TargetAssignment_5 ) )
            // InternalMkDsl.g:1407:2: ( rule__EDGE__TargetAssignment_5 )
            {
             before(grammarAccess.getEDGEAccess().getTargetAssignment_5()); 
            // InternalMkDsl.g:1408:2: ( rule__EDGE__TargetAssignment_5 )
            // InternalMkDsl.g:1408:3: rule__EDGE__TargetAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EDGE__TargetAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEDGEAccess().getTargetAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__5__Impl"


    // $ANTLR start "rule__EDGE__Group__6"
    // InternalMkDsl.g:1416:1: rule__EDGE__Group__6 : rule__EDGE__Group__6__Impl ;
    public final void rule__EDGE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1420:1: ( rule__EDGE__Group__6__Impl )
            // InternalMkDsl.g:1421:2: rule__EDGE__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDGE__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__6"


    // $ANTLR start "rule__EDGE__Group__6__Impl"
    // InternalMkDsl.g:1427:1: rule__EDGE__Group__6__Impl : ( ( rule__EDGE__Group_6__0 )? ) ;
    public final void rule__EDGE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1431:1: ( ( ( rule__EDGE__Group_6__0 )? ) )
            // InternalMkDsl.g:1432:1: ( ( rule__EDGE__Group_6__0 )? )
            {
            // InternalMkDsl.g:1432:1: ( ( rule__EDGE__Group_6__0 )? )
            // InternalMkDsl.g:1433:2: ( rule__EDGE__Group_6__0 )?
            {
             before(grammarAccess.getEDGEAccess().getGroup_6()); 
            // InternalMkDsl.g:1434:2: ( rule__EDGE__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMkDsl.g:1434:3: rule__EDGE__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDGE__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDGEAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group__6__Impl"


    // $ANTLR start "rule__EDGE__Group_6__0"
    // InternalMkDsl.g:1443:1: rule__EDGE__Group_6__0 : rule__EDGE__Group_6__0__Impl rule__EDGE__Group_6__1 ;
    public final void rule__EDGE__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1447:1: ( rule__EDGE__Group_6__0__Impl rule__EDGE__Group_6__1 )
            // InternalMkDsl.g:1448:2: rule__EDGE__Group_6__0__Impl rule__EDGE__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__EDGE__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDGE__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group_6__0"


    // $ANTLR start "rule__EDGE__Group_6__0__Impl"
    // InternalMkDsl.g:1455:1: rule__EDGE__Group_6__0__Impl : ( 'Color' ) ;
    public final void rule__EDGE__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1459:1: ( ( 'Color' ) )
            // InternalMkDsl.g:1460:1: ( 'Color' )
            {
            // InternalMkDsl.g:1460:1: ( 'Color' )
            // InternalMkDsl.g:1461:2: 'Color'
            {
             before(grammarAccess.getEDGEAccess().getColorKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEDGEAccess().getColorKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group_6__0__Impl"


    // $ANTLR start "rule__EDGE__Group_6__1"
    // InternalMkDsl.g:1470:1: rule__EDGE__Group_6__1 : rule__EDGE__Group_6__1__Impl ;
    public final void rule__EDGE__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1474:1: ( rule__EDGE__Group_6__1__Impl )
            // InternalMkDsl.g:1475:2: rule__EDGE__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDGE__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group_6__1"


    // $ANTLR start "rule__EDGE__Group_6__1__Impl"
    // InternalMkDsl.g:1481:1: rule__EDGE__Group_6__1__Impl : ( ( rule__EDGE__ColorAssignment_6_1 ) ) ;
    public final void rule__EDGE__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1485:1: ( ( ( rule__EDGE__ColorAssignment_6_1 ) ) )
            // InternalMkDsl.g:1486:1: ( ( rule__EDGE__ColorAssignment_6_1 ) )
            {
            // InternalMkDsl.g:1486:1: ( ( rule__EDGE__ColorAssignment_6_1 ) )
            // InternalMkDsl.g:1487:2: ( rule__EDGE__ColorAssignment_6_1 )
            {
             before(grammarAccess.getEDGEAccess().getColorAssignment_6_1()); 
            // InternalMkDsl.g:1488:2: ( rule__EDGE__ColorAssignment_6_1 )
            // InternalMkDsl.g:1488:3: rule__EDGE__ColorAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__EDGE__ColorAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEDGEAccess().getColorAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__Group_6__1__Impl"


    // $ANTLR start "rule__DT__Group__0"
    // InternalMkDsl.g:1497:1: rule__DT__Group__0 : rule__DT__Group__0__Impl rule__DT__Group__1 ;
    public final void rule__DT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1501:1: ( rule__DT__Group__0__Impl rule__DT__Group__1 )
            // InternalMkDsl.g:1502:2: rule__DT__Group__0__Impl rule__DT__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__0"


    // $ANTLR start "rule__DT__Group__0__Impl"
    // InternalMkDsl.g:1509:1: rule__DT__Group__0__Impl : ( 'DT' ) ;
    public final void rule__DT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1513:1: ( ( 'DT' ) )
            // InternalMkDsl.g:1514:1: ( 'DT' )
            {
            // InternalMkDsl.g:1514:1: ( 'DT' )
            // InternalMkDsl.g:1515:2: 'DT'
            {
             before(grammarAccess.getDTAccess().getDTKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDTAccess().getDTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__0__Impl"


    // $ANTLR start "rule__DT__Group__1"
    // InternalMkDsl.g:1524:1: rule__DT__Group__1 : rule__DT__Group__1__Impl rule__DT__Group__2 ;
    public final void rule__DT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1528:1: ( rule__DT__Group__1__Impl rule__DT__Group__2 )
            // InternalMkDsl.g:1529:2: rule__DT__Group__1__Impl rule__DT__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__1"


    // $ANTLR start "rule__DT__Group__1__Impl"
    // InternalMkDsl.g:1536:1: rule__DT__Group__1__Impl : ( ( rule__DT__NameAssignment_1 ) ) ;
    public final void rule__DT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1540:1: ( ( ( rule__DT__NameAssignment_1 ) ) )
            // InternalMkDsl.g:1541:1: ( ( rule__DT__NameAssignment_1 ) )
            {
            // InternalMkDsl.g:1541:1: ( ( rule__DT__NameAssignment_1 ) )
            // InternalMkDsl.g:1542:2: ( rule__DT__NameAssignment_1 )
            {
             before(grammarAccess.getDTAccess().getNameAssignment_1()); 
            // InternalMkDsl.g:1543:2: ( rule__DT__NameAssignment_1 )
            // InternalMkDsl.g:1543:3: rule__DT__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DT__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__1__Impl"


    // $ANTLR start "rule__DT__Group__2"
    // InternalMkDsl.g:1551:1: rule__DT__Group__2 : rule__DT__Group__2__Impl rule__DT__Group__3 ;
    public final void rule__DT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1555:1: ( rule__DT__Group__2__Impl rule__DT__Group__3 )
            // InternalMkDsl.g:1556:2: rule__DT__Group__2__Impl rule__DT__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__DT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__2"


    // $ANTLR start "rule__DT__Group__2__Impl"
    // InternalMkDsl.g:1563:1: rule__DT__Group__2__Impl : ( 'ID' ) ;
    public final void rule__DT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1567:1: ( ( 'ID' ) )
            // InternalMkDsl.g:1568:1: ( 'ID' )
            {
            // InternalMkDsl.g:1568:1: ( 'ID' )
            // InternalMkDsl.g:1569:2: 'ID'
            {
             before(grammarAccess.getDTAccess().getIDKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDTAccess().getIDKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__2__Impl"


    // $ANTLR start "rule__DT__Group__3"
    // InternalMkDsl.g:1578:1: rule__DT__Group__3 : rule__DT__Group__3__Impl rule__DT__Group__4 ;
    public final void rule__DT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1582:1: ( rule__DT__Group__3__Impl rule__DT__Group__4 )
            // InternalMkDsl.g:1583:2: rule__DT__Group__3__Impl rule__DT__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__DT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__3"


    // $ANTLR start "rule__DT__Group__3__Impl"
    // InternalMkDsl.g:1590:1: rule__DT__Group__3__Impl : ( ( rule__DT__IDAssignment_3 ) ) ;
    public final void rule__DT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1594:1: ( ( ( rule__DT__IDAssignment_3 ) ) )
            // InternalMkDsl.g:1595:1: ( ( rule__DT__IDAssignment_3 ) )
            {
            // InternalMkDsl.g:1595:1: ( ( rule__DT__IDAssignment_3 ) )
            // InternalMkDsl.g:1596:2: ( rule__DT__IDAssignment_3 )
            {
             before(grammarAccess.getDTAccess().getIDAssignment_3()); 
            // InternalMkDsl.g:1597:2: ( rule__DT__IDAssignment_3 )
            // InternalMkDsl.g:1597:3: rule__DT__IDAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DT__IDAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getIDAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__3__Impl"


    // $ANTLR start "rule__DT__Group__4"
    // InternalMkDsl.g:1605:1: rule__DT__Group__4 : rule__DT__Group__4__Impl rule__DT__Group__5 ;
    public final void rule__DT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1609:1: ( rule__DT__Group__4__Impl rule__DT__Group__5 )
            // InternalMkDsl.g:1610:2: rule__DT__Group__4__Impl rule__DT__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__DT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__4"


    // $ANTLR start "rule__DT__Group__4__Impl"
    // InternalMkDsl.g:1617:1: rule__DT__Group__4__Impl : ( ( rule__DT__ConditionsAssignment_4 ) ) ;
    public final void rule__DT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1621:1: ( ( ( rule__DT__ConditionsAssignment_4 ) ) )
            // InternalMkDsl.g:1622:1: ( ( rule__DT__ConditionsAssignment_4 ) )
            {
            // InternalMkDsl.g:1622:1: ( ( rule__DT__ConditionsAssignment_4 ) )
            // InternalMkDsl.g:1623:2: ( rule__DT__ConditionsAssignment_4 )
            {
             before(grammarAccess.getDTAccess().getConditionsAssignment_4()); 
            // InternalMkDsl.g:1624:2: ( rule__DT__ConditionsAssignment_4 )
            // InternalMkDsl.g:1624:3: rule__DT__ConditionsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DT__ConditionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getConditionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__4__Impl"


    // $ANTLR start "rule__DT__Group__5"
    // InternalMkDsl.g:1632:1: rule__DT__Group__5 : rule__DT__Group__5__Impl rule__DT__Group__6 ;
    public final void rule__DT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1636:1: ( rule__DT__Group__5__Impl rule__DT__Group__6 )
            // InternalMkDsl.g:1637:2: rule__DT__Group__5__Impl rule__DT__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__DT__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__5"


    // $ANTLR start "rule__DT__Group__5__Impl"
    // InternalMkDsl.g:1644:1: rule__DT__Group__5__Impl : ( ( rule__DT__Group_5__0 )* ) ;
    public final void rule__DT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1648:1: ( ( ( rule__DT__Group_5__0 )* ) )
            // InternalMkDsl.g:1649:1: ( ( rule__DT__Group_5__0 )* )
            {
            // InternalMkDsl.g:1649:1: ( ( rule__DT__Group_5__0 )* )
            // InternalMkDsl.g:1650:2: ( rule__DT__Group_5__0 )*
            {
             before(grammarAccess.getDTAccess().getGroup_5()); 
            // InternalMkDsl.g:1651:2: ( rule__DT__Group_5__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMkDsl.g:1651:3: rule__DT__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DT__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDTAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__5__Impl"


    // $ANTLR start "rule__DT__Group__6"
    // InternalMkDsl.g:1659:1: rule__DT__Group__6 : rule__DT__Group__6__Impl rule__DT__Group__7 ;
    public final void rule__DT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1663:1: ( rule__DT__Group__6__Impl rule__DT__Group__7 )
            // InternalMkDsl.g:1664:2: rule__DT__Group__6__Impl rule__DT__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__DT__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__6"


    // $ANTLR start "rule__DT__Group__6__Impl"
    // InternalMkDsl.g:1671:1: rule__DT__Group__6__Impl : ( ( rule__DT__ActionsAssignment_6 ) ) ;
    public final void rule__DT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1675:1: ( ( ( rule__DT__ActionsAssignment_6 ) ) )
            // InternalMkDsl.g:1676:1: ( ( rule__DT__ActionsAssignment_6 ) )
            {
            // InternalMkDsl.g:1676:1: ( ( rule__DT__ActionsAssignment_6 ) )
            // InternalMkDsl.g:1677:2: ( rule__DT__ActionsAssignment_6 )
            {
             before(grammarAccess.getDTAccess().getActionsAssignment_6()); 
            // InternalMkDsl.g:1678:2: ( rule__DT__ActionsAssignment_6 )
            // InternalMkDsl.g:1678:3: rule__DT__ActionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DT__ActionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getActionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__6__Impl"


    // $ANTLR start "rule__DT__Group__7"
    // InternalMkDsl.g:1686:1: rule__DT__Group__7 : rule__DT__Group__7__Impl rule__DT__Group__8 ;
    public final void rule__DT__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1690:1: ( rule__DT__Group__7__Impl rule__DT__Group__8 )
            // InternalMkDsl.g:1691:2: rule__DT__Group__7__Impl rule__DT__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__DT__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__7"


    // $ANTLR start "rule__DT__Group__7__Impl"
    // InternalMkDsl.g:1698:1: rule__DT__Group__7__Impl : ( ( rule__DT__Group_7__0 )* ) ;
    public final void rule__DT__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1702:1: ( ( ( rule__DT__Group_7__0 )* ) )
            // InternalMkDsl.g:1703:1: ( ( rule__DT__Group_7__0 )* )
            {
            // InternalMkDsl.g:1703:1: ( ( rule__DT__Group_7__0 )* )
            // InternalMkDsl.g:1704:2: ( rule__DT__Group_7__0 )*
            {
             before(grammarAccess.getDTAccess().getGroup_7()); 
            // InternalMkDsl.g:1705:2: ( rule__DT__Group_7__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMkDsl.g:1705:3: rule__DT__Group_7__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DT__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDTAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__7__Impl"


    // $ANTLR start "rule__DT__Group__8"
    // InternalMkDsl.g:1713:1: rule__DT__Group__8 : rule__DT__Group__8__Impl rule__DT__Group__9 ;
    public final void rule__DT__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1717:1: ( rule__DT__Group__8__Impl rule__DT__Group__9 )
            // InternalMkDsl.g:1718:2: rule__DT__Group__8__Impl rule__DT__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__DT__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__8"


    // $ANTLR start "rule__DT__Group__8__Impl"
    // InternalMkDsl.g:1725:1: rule__DT__Group__8__Impl : ( ( rule__DT__RulesAssignment_8 ) ) ;
    public final void rule__DT__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1729:1: ( ( ( rule__DT__RulesAssignment_8 ) ) )
            // InternalMkDsl.g:1730:1: ( ( rule__DT__RulesAssignment_8 ) )
            {
            // InternalMkDsl.g:1730:1: ( ( rule__DT__RulesAssignment_8 ) )
            // InternalMkDsl.g:1731:2: ( rule__DT__RulesAssignment_8 )
            {
             before(grammarAccess.getDTAccess().getRulesAssignment_8()); 
            // InternalMkDsl.g:1732:2: ( rule__DT__RulesAssignment_8 )
            // InternalMkDsl.g:1732:3: rule__DT__RulesAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__DT__RulesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getRulesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__8__Impl"


    // $ANTLR start "rule__DT__Group__9"
    // InternalMkDsl.g:1740:1: rule__DT__Group__9 : rule__DT__Group__9__Impl ;
    public final void rule__DT__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1744:1: ( rule__DT__Group__9__Impl )
            // InternalMkDsl.g:1745:2: rule__DT__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DT__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__9"


    // $ANTLR start "rule__DT__Group__9__Impl"
    // InternalMkDsl.g:1751:1: rule__DT__Group__9__Impl : ( ( rule__DT__Group_9__0 )* ) ;
    public final void rule__DT__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1755:1: ( ( ( rule__DT__Group_9__0 )* ) )
            // InternalMkDsl.g:1756:1: ( ( rule__DT__Group_9__0 )* )
            {
            // InternalMkDsl.g:1756:1: ( ( rule__DT__Group_9__0 )* )
            // InternalMkDsl.g:1757:2: ( rule__DT__Group_9__0 )*
            {
             before(grammarAccess.getDTAccess().getGroup_9()); 
            // InternalMkDsl.g:1758:2: ( rule__DT__Group_9__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==34) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalMkDsl.g:1758:3: rule__DT__Group_9__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DT__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDTAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__9__Impl"


    // $ANTLR start "rule__DT__Group_5__0"
    // InternalMkDsl.g:1767:1: rule__DT__Group_5__0 : rule__DT__Group_5__0__Impl rule__DT__Group_5__1 ;
    public final void rule__DT__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1771:1: ( rule__DT__Group_5__0__Impl rule__DT__Group_5__1 )
            // InternalMkDsl.g:1772:2: rule__DT__Group_5__0__Impl rule__DT__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__DT__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group_5__0"


    // $ANTLR start "rule__DT__Group_5__0__Impl"
    // InternalMkDsl.g:1779:1: rule__DT__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DT__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1783:1: ( ( ',' ) )
            // InternalMkDsl.g:1784:1: ( ',' )
            {
            // InternalMkDsl.g:1784:1: ( ',' )
            // InternalMkDsl.g:1785:2: ','
            {
             before(grammarAccess.getDTAccess().getCommaKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDTAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group_5__0__Impl"


    // $ANTLR start "rule__DT__Group_5__1"
    // InternalMkDsl.g:1794:1: rule__DT__Group_5__1 : rule__DT__Group_5__1__Impl ;
    public final void rule__DT__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1798:1: ( rule__DT__Group_5__1__Impl )
            // InternalMkDsl.g:1799:2: rule__DT__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DT__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group_5__1"


    // $ANTLR start "rule__DT__Group_5__1__Impl"
    // InternalMkDsl.g:1805:1: rule__DT__Group_5__1__Impl : ( ( rule__DT__ConditionsAssignment_5_1 ) ) ;
    public final void rule__DT__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1809:1: ( ( ( rule__DT__ConditionsAssignment_5_1 ) ) )
            // InternalMkDsl.g:1810:1: ( ( rule__DT__ConditionsAssignment_5_1 ) )
            {
            // InternalMkDsl.g:1810:1: ( ( rule__DT__ConditionsAssignment_5_1 ) )
            // InternalMkDsl.g:1811:2: ( rule__DT__ConditionsAssignment_5_1 )
            {
             before(grammarAccess.getDTAccess().getConditionsAssignment_5_1()); 
            // InternalMkDsl.g:1812:2: ( rule__DT__ConditionsAssignment_5_1 )
            // InternalMkDsl.g:1812:3: rule__DT__ConditionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__DT__ConditionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getConditionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group_5__1__Impl"


    // $ANTLR start "rule__DT__Group_7__0"
    // InternalMkDsl.g:1821:1: rule__DT__Group_7__0 : rule__DT__Group_7__0__Impl rule__DT__Group_7__1 ;
    public final void rule__DT__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1825:1: ( rule__DT__Group_7__0__Impl rule__DT__Group_7__1 )
            // InternalMkDsl.g:1826:2: rule__DT__Group_7__0__Impl rule__DT__Group_7__1
            {
            pushFollow(FOLLOW_19);
            rule__DT__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group_7__0"


    // $ANTLR start "rule__DT__Group_7__0__Impl"
    // InternalMkDsl.g:1833:1: rule__DT__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DT__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1837:1: ( ( ',' ) )
            // InternalMkDsl.g:1838:1: ( ',' )
            {
            // InternalMkDsl.g:1838:1: ( ',' )
            // InternalMkDsl.g:1839:2: ','
            {
             before(grammarAccess.getDTAccess().getCommaKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDTAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group_7__0__Impl"


    // $ANTLR start "rule__DT__Group_7__1"
    // InternalMkDsl.g:1848:1: rule__DT__Group_7__1 : rule__DT__Group_7__1__Impl ;
    public final void rule__DT__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1852:1: ( rule__DT__Group_7__1__Impl )
            // InternalMkDsl.g:1853:2: rule__DT__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DT__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group_7__1"


    // $ANTLR start "rule__DT__Group_7__1__Impl"
    // InternalMkDsl.g:1859:1: rule__DT__Group_7__1__Impl : ( ( rule__DT__ActionsAssignment_7_1 ) ) ;
    public final void rule__DT__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1863:1: ( ( ( rule__DT__ActionsAssignment_7_1 ) ) )
            // InternalMkDsl.g:1864:1: ( ( rule__DT__ActionsAssignment_7_1 ) )
            {
            // InternalMkDsl.g:1864:1: ( ( rule__DT__ActionsAssignment_7_1 ) )
            // InternalMkDsl.g:1865:2: ( rule__DT__ActionsAssignment_7_1 )
            {
             before(grammarAccess.getDTAccess().getActionsAssignment_7_1()); 
            // InternalMkDsl.g:1866:2: ( rule__DT__ActionsAssignment_7_1 )
            // InternalMkDsl.g:1866:3: rule__DT__ActionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__DT__ActionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getActionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group_7__1__Impl"


    // $ANTLR start "rule__DT__Group_9__0"
    // InternalMkDsl.g:1875:1: rule__DT__Group_9__0 : rule__DT__Group_9__0__Impl rule__DT__Group_9__1 ;
    public final void rule__DT__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1879:1: ( rule__DT__Group_9__0__Impl rule__DT__Group_9__1 )
            // InternalMkDsl.g:1880:2: rule__DT__Group_9__0__Impl rule__DT__Group_9__1
            {
            pushFollow(FOLLOW_20);
            rule__DT__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group_9__0"


    // $ANTLR start "rule__DT__Group_9__0__Impl"
    // InternalMkDsl.g:1887:1: rule__DT__Group_9__0__Impl : ( ',' ) ;
    public final void rule__DT__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1891:1: ( ( ',' ) )
            // InternalMkDsl.g:1892:1: ( ',' )
            {
            // InternalMkDsl.g:1892:1: ( ',' )
            // InternalMkDsl.g:1893:2: ','
            {
             before(grammarAccess.getDTAccess().getCommaKeyword_9_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDTAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group_9__0__Impl"


    // $ANTLR start "rule__DT__Group_9__1"
    // InternalMkDsl.g:1902:1: rule__DT__Group_9__1 : rule__DT__Group_9__1__Impl ;
    public final void rule__DT__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1906:1: ( rule__DT__Group_9__1__Impl )
            // InternalMkDsl.g:1907:2: rule__DT__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DT__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group_9__1"


    // $ANTLR start "rule__DT__Group_9__1__Impl"
    // InternalMkDsl.g:1913:1: rule__DT__Group_9__1__Impl : ( ( rule__DT__RulesAssignment_9_1 ) ) ;
    public final void rule__DT__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1917:1: ( ( ( rule__DT__RulesAssignment_9_1 ) ) )
            // InternalMkDsl.g:1918:1: ( ( rule__DT__RulesAssignment_9_1 ) )
            {
            // InternalMkDsl.g:1918:1: ( ( rule__DT__RulesAssignment_9_1 ) )
            // InternalMkDsl.g:1919:2: ( rule__DT__RulesAssignment_9_1 )
            {
             before(grammarAccess.getDTAccess().getRulesAssignment_9_1()); 
            // InternalMkDsl.g:1920:2: ( rule__DT__RulesAssignment_9_1 )
            // InternalMkDsl.g:1920:3: rule__DT__RulesAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__DT__RulesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getRulesAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group_9__1__Impl"


    // $ANTLR start "rule__CONDITION__Group__0"
    // InternalMkDsl.g:1929:1: rule__CONDITION__Group__0 : rule__CONDITION__Group__0__Impl rule__CONDITION__Group__1 ;
    public final void rule__CONDITION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1933:1: ( rule__CONDITION__Group__0__Impl rule__CONDITION__Group__1 )
            // InternalMkDsl.g:1934:2: rule__CONDITION__Group__0__Impl rule__CONDITION__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__CONDITION__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CONDITION__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONDITION__Group__0"


    // $ANTLR start "rule__CONDITION__Group__0__Impl"
    // InternalMkDsl.g:1941:1: rule__CONDITION__Group__0__Impl : ( 'Condition' ) ;
    public final void rule__CONDITION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1945:1: ( ( 'Condition' ) )
            // InternalMkDsl.g:1946:1: ( 'Condition' )
            {
            // InternalMkDsl.g:1946:1: ( 'Condition' )
            // InternalMkDsl.g:1947:2: 'Condition'
            {
             before(grammarAccess.getCONDITIONAccess().getConditionKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCONDITIONAccess().getConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONDITION__Group__0__Impl"


    // $ANTLR start "rule__CONDITION__Group__1"
    // InternalMkDsl.g:1956:1: rule__CONDITION__Group__1 : rule__CONDITION__Group__1__Impl rule__CONDITION__Group__2 ;
    public final void rule__CONDITION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1960:1: ( rule__CONDITION__Group__1__Impl rule__CONDITION__Group__2 )
            // InternalMkDsl.g:1961:2: rule__CONDITION__Group__1__Impl rule__CONDITION__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__CONDITION__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CONDITION__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONDITION__Group__1"


    // $ANTLR start "rule__CONDITION__Group__1__Impl"
    // InternalMkDsl.g:1968:1: rule__CONDITION__Group__1__Impl : ( ( rule__CONDITION__NameAssignment_1 ) ) ;
    public final void rule__CONDITION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1972:1: ( ( ( rule__CONDITION__NameAssignment_1 ) ) )
            // InternalMkDsl.g:1973:1: ( ( rule__CONDITION__NameAssignment_1 ) )
            {
            // InternalMkDsl.g:1973:1: ( ( rule__CONDITION__NameAssignment_1 ) )
            // InternalMkDsl.g:1974:2: ( rule__CONDITION__NameAssignment_1 )
            {
             before(grammarAccess.getCONDITIONAccess().getNameAssignment_1()); 
            // InternalMkDsl.g:1975:2: ( rule__CONDITION__NameAssignment_1 )
            // InternalMkDsl.g:1975:3: rule__CONDITION__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CONDITION__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCONDITIONAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONDITION__Group__1__Impl"


    // $ANTLR start "rule__CONDITION__Group__2"
    // InternalMkDsl.g:1983:1: rule__CONDITION__Group__2 : rule__CONDITION__Group__2__Impl rule__CONDITION__Group__3 ;
    public final void rule__CONDITION__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1987:1: ( rule__CONDITION__Group__2__Impl rule__CONDITION__Group__3 )
            // InternalMkDsl.g:1988:2: rule__CONDITION__Group__2__Impl rule__CONDITION__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__CONDITION__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CONDITION__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONDITION__Group__2"


    // $ANTLR start "rule__CONDITION__Group__2__Impl"
    // InternalMkDsl.g:1995:1: rule__CONDITION__Group__2__Impl : ( ( rule__CONDITION__EvalsAssignment_2 ) ) ;
    public final void rule__CONDITION__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:1999:1: ( ( ( rule__CONDITION__EvalsAssignment_2 ) ) )
            // InternalMkDsl.g:2000:1: ( ( rule__CONDITION__EvalsAssignment_2 ) )
            {
            // InternalMkDsl.g:2000:1: ( ( rule__CONDITION__EvalsAssignment_2 ) )
            // InternalMkDsl.g:2001:2: ( rule__CONDITION__EvalsAssignment_2 )
            {
             before(grammarAccess.getCONDITIONAccess().getEvalsAssignment_2()); 
            // InternalMkDsl.g:2002:2: ( rule__CONDITION__EvalsAssignment_2 )
            // InternalMkDsl.g:2002:3: rule__CONDITION__EvalsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CONDITION__EvalsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCONDITIONAccess().getEvalsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONDITION__Group__2__Impl"


    // $ANTLR start "rule__CONDITION__Group__3"
    // InternalMkDsl.g:2010:1: rule__CONDITION__Group__3 : rule__CONDITION__Group__3__Impl ;
    public final void rule__CONDITION__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2014:1: ( rule__CONDITION__Group__3__Impl )
            // InternalMkDsl.g:2015:2: rule__CONDITION__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CONDITION__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONDITION__Group__3"


    // $ANTLR start "rule__CONDITION__Group__3__Impl"
    // InternalMkDsl.g:2021:1: rule__CONDITION__Group__3__Impl : ( ( rule__CONDITION__EvalsAssignment_3 )* ) ;
    public final void rule__CONDITION__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2025:1: ( ( ( rule__CONDITION__EvalsAssignment_3 )* ) )
            // InternalMkDsl.g:2026:1: ( ( rule__CONDITION__EvalsAssignment_3 )* )
            {
            // InternalMkDsl.g:2026:1: ( ( rule__CONDITION__EvalsAssignment_3 )* )
            // InternalMkDsl.g:2027:2: ( rule__CONDITION__EvalsAssignment_3 )*
            {
             before(grammarAccess.getCONDITIONAccess().getEvalsAssignment_3()); 
            // InternalMkDsl.g:2028:2: ( rule__CONDITION__EvalsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=11 && LA18_0<=12)||LA18_0==40) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMkDsl.g:2028:3: rule__CONDITION__EvalsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__CONDITION__EvalsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getCONDITIONAccess().getEvalsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONDITION__Group__3__Impl"


    // $ANTLR start "rule__RULE__Group__0"
    // InternalMkDsl.g:2037:1: rule__RULE__Group__0 : rule__RULE__Group__0__Impl rule__RULE__Group__1 ;
    public final void rule__RULE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2041:1: ( rule__RULE__Group__0__Impl rule__RULE__Group__1 )
            // InternalMkDsl.g:2042:2: rule__RULE__Group__0__Impl rule__RULE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RULE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__0"


    // $ANTLR start "rule__RULE__Group__0__Impl"
    // InternalMkDsl.g:2049:1: rule__RULE__Group__0__Impl : ( 'Rule' ) ;
    public final void rule__RULE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2053:1: ( ( 'Rule' ) )
            // InternalMkDsl.g:2054:1: ( 'Rule' )
            {
            // InternalMkDsl.g:2054:1: ( 'Rule' )
            // InternalMkDsl.g:2055:2: 'Rule'
            {
             before(grammarAccess.getRULEAccess().getRuleKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRULEAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__0__Impl"


    // $ANTLR start "rule__RULE__Group__1"
    // InternalMkDsl.g:2064:1: rule__RULE__Group__1 : rule__RULE__Group__1__Impl rule__RULE__Group__2 ;
    public final void rule__RULE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2068:1: ( rule__RULE__Group__1__Impl rule__RULE__Group__2 )
            // InternalMkDsl.g:2069:2: rule__RULE__Group__1__Impl rule__RULE__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__RULE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__1"


    // $ANTLR start "rule__RULE__Group__1__Impl"
    // InternalMkDsl.g:2076:1: rule__RULE__Group__1__Impl : ( ( rule__RULE__NameAssignment_1 ) ) ;
    public final void rule__RULE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2080:1: ( ( ( rule__RULE__NameAssignment_1 ) ) )
            // InternalMkDsl.g:2081:1: ( ( rule__RULE__NameAssignment_1 ) )
            {
            // InternalMkDsl.g:2081:1: ( ( rule__RULE__NameAssignment_1 ) )
            // InternalMkDsl.g:2082:2: ( rule__RULE__NameAssignment_1 )
            {
             before(grammarAccess.getRULEAccess().getNameAssignment_1()); 
            // InternalMkDsl.g:2083:2: ( rule__RULE__NameAssignment_1 )
            // InternalMkDsl.g:2083:3: rule__RULE__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RULE__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRULEAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__1__Impl"


    // $ANTLR start "rule__RULE__Group__2"
    // InternalMkDsl.g:2091:1: rule__RULE__Group__2 : rule__RULE__Group__2__Impl rule__RULE__Group__3 ;
    public final void rule__RULE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2095:1: ( rule__RULE__Group__2__Impl rule__RULE__Group__3 )
            // InternalMkDsl.g:2096:2: rule__RULE__Group__2__Impl rule__RULE__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__RULE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__2"


    // $ANTLR start "rule__RULE__Group__2__Impl"
    // InternalMkDsl.g:2103:1: rule__RULE__Group__2__Impl : ( 'ID' ) ;
    public final void rule__RULE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2107:1: ( ( 'ID' ) )
            // InternalMkDsl.g:2108:1: ( 'ID' )
            {
            // InternalMkDsl.g:2108:1: ( 'ID' )
            // InternalMkDsl.g:2109:2: 'ID'
            {
             before(grammarAccess.getRULEAccess().getIDKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRULEAccess().getIDKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__2__Impl"


    // $ANTLR start "rule__RULE__Group__3"
    // InternalMkDsl.g:2118:1: rule__RULE__Group__3 : rule__RULE__Group__3__Impl rule__RULE__Group__4 ;
    public final void rule__RULE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2122:1: ( rule__RULE__Group__3__Impl rule__RULE__Group__4 )
            // InternalMkDsl.g:2123:2: rule__RULE__Group__3__Impl rule__RULE__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__RULE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__3"


    // $ANTLR start "rule__RULE__Group__3__Impl"
    // InternalMkDsl.g:2130:1: rule__RULE__Group__3__Impl : ( ( rule__RULE__IDAssignment_3 ) ) ;
    public final void rule__RULE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2134:1: ( ( ( rule__RULE__IDAssignment_3 ) ) )
            // InternalMkDsl.g:2135:1: ( ( rule__RULE__IDAssignment_3 ) )
            {
            // InternalMkDsl.g:2135:1: ( ( rule__RULE__IDAssignment_3 ) )
            // InternalMkDsl.g:2136:2: ( rule__RULE__IDAssignment_3 )
            {
             before(grammarAccess.getRULEAccess().getIDAssignment_3()); 
            // InternalMkDsl.g:2137:2: ( rule__RULE__IDAssignment_3 )
            // InternalMkDsl.g:2137:3: rule__RULE__IDAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RULE__IDAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRULEAccess().getIDAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__3__Impl"


    // $ANTLR start "rule__RULE__Group__4"
    // InternalMkDsl.g:2145:1: rule__RULE__Group__4 : rule__RULE__Group__4__Impl rule__RULE__Group__5 ;
    public final void rule__RULE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2149:1: ( rule__RULE__Group__4__Impl rule__RULE__Group__5 )
            // InternalMkDsl.g:2150:2: rule__RULE__Group__4__Impl rule__RULE__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__RULE__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__4"


    // $ANTLR start "rule__RULE__Group__4__Impl"
    // InternalMkDsl.g:2157:1: rule__RULE__Group__4__Impl : ( 'value' ) ;
    public final void rule__RULE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2161:1: ( ( 'value' ) )
            // InternalMkDsl.g:2162:1: ( 'value' )
            {
            // InternalMkDsl.g:2162:1: ( 'value' )
            // InternalMkDsl.g:2163:2: 'value'
            {
             before(grammarAccess.getRULEAccess().getValueKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRULEAccess().getValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__4__Impl"


    // $ANTLR start "rule__RULE__Group__5"
    // InternalMkDsl.g:2172:1: rule__RULE__Group__5 : rule__RULE__Group__5__Impl rule__RULE__Group__6 ;
    public final void rule__RULE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2176:1: ( rule__RULE__Group__5__Impl rule__RULE__Group__6 )
            // InternalMkDsl.g:2177:2: rule__RULE__Group__5__Impl rule__RULE__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__RULE__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__5"


    // $ANTLR start "rule__RULE__Group__5__Impl"
    // InternalMkDsl.g:2184:1: rule__RULE__Group__5__Impl : ( ( rule__RULE__ValueAssignment_5 ) ) ;
    public final void rule__RULE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2188:1: ( ( ( rule__RULE__ValueAssignment_5 ) ) )
            // InternalMkDsl.g:2189:1: ( ( rule__RULE__ValueAssignment_5 ) )
            {
            // InternalMkDsl.g:2189:1: ( ( rule__RULE__ValueAssignment_5 ) )
            // InternalMkDsl.g:2190:2: ( rule__RULE__ValueAssignment_5 )
            {
             before(grammarAccess.getRULEAccess().getValueAssignment_5()); 
            // InternalMkDsl.g:2191:2: ( rule__RULE__ValueAssignment_5 )
            // InternalMkDsl.g:2191:3: rule__RULE__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RULE__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRULEAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__5__Impl"


    // $ANTLR start "rule__RULE__Group__6"
    // InternalMkDsl.g:2199:1: rule__RULE__Group__6 : rule__RULE__Group__6__Impl rule__RULE__Group__7 ;
    public final void rule__RULE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2203:1: ( rule__RULE__Group__6__Impl rule__RULE__Group__7 )
            // InternalMkDsl.g:2204:2: rule__RULE__Group__6__Impl rule__RULE__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__RULE__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__6"


    // $ANTLR start "rule__RULE__Group__6__Impl"
    // InternalMkDsl.g:2211:1: rule__RULE__Group__6__Impl : ( 'variables' ) ;
    public final void rule__RULE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2215:1: ( ( 'variables' ) )
            // InternalMkDsl.g:2216:1: ( 'variables' )
            {
            // InternalMkDsl.g:2216:1: ( 'variables' )
            // InternalMkDsl.g:2217:2: 'variables'
            {
             before(grammarAccess.getRULEAccess().getVariablesKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRULEAccess().getVariablesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__6__Impl"


    // $ANTLR start "rule__RULE__Group__7"
    // InternalMkDsl.g:2226:1: rule__RULE__Group__7 : rule__RULE__Group__7__Impl rule__RULE__Group__8 ;
    public final void rule__RULE__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2230:1: ( rule__RULE__Group__7__Impl rule__RULE__Group__8 )
            // InternalMkDsl.g:2231:2: rule__RULE__Group__7__Impl rule__RULE__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__RULE__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__7"


    // $ANTLR start "rule__RULE__Group__7__Impl"
    // InternalMkDsl.g:2238:1: rule__RULE__Group__7__Impl : ( ( rule__RULE__VarsAssignment_7 ) ) ;
    public final void rule__RULE__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2242:1: ( ( ( rule__RULE__VarsAssignment_7 ) ) )
            // InternalMkDsl.g:2243:1: ( ( rule__RULE__VarsAssignment_7 ) )
            {
            // InternalMkDsl.g:2243:1: ( ( rule__RULE__VarsAssignment_7 ) )
            // InternalMkDsl.g:2244:2: ( rule__RULE__VarsAssignment_7 )
            {
             before(grammarAccess.getRULEAccess().getVarsAssignment_7()); 
            // InternalMkDsl.g:2245:2: ( rule__RULE__VarsAssignment_7 )
            // InternalMkDsl.g:2245:3: rule__RULE__VarsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__RULE__VarsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRULEAccess().getVarsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__7__Impl"


    // $ANTLR start "rule__RULE__Group__8"
    // InternalMkDsl.g:2253:1: rule__RULE__Group__8 : rule__RULE__Group__8__Impl rule__RULE__Group__9 ;
    public final void rule__RULE__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2257:1: ( rule__RULE__Group__8__Impl rule__RULE__Group__9 )
            // InternalMkDsl.g:2258:2: rule__RULE__Group__8__Impl rule__RULE__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__RULE__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__8"


    // $ANTLR start "rule__RULE__Group__8__Impl"
    // InternalMkDsl.g:2265:1: rule__RULE__Group__8__Impl : ( ( rule__RULE__Group_8__0 )* ) ;
    public final void rule__RULE__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2269:1: ( ( ( rule__RULE__Group_8__0 )* ) )
            // InternalMkDsl.g:2270:1: ( ( rule__RULE__Group_8__0 )* )
            {
            // InternalMkDsl.g:2270:1: ( ( rule__RULE__Group_8__0 )* )
            // InternalMkDsl.g:2271:2: ( rule__RULE__Group_8__0 )*
            {
             before(grammarAccess.getRULEAccess().getGroup_8()); 
            // InternalMkDsl.g:2272:2: ( rule__RULE__Group_8__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMkDsl.g:2272:3: rule__RULE__Group_8__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RULE__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRULEAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__8__Impl"


    // $ANTLR start "rule__RULE__Group__9"
    // InternalMkDsl.g:2280:1: rule__RULE__Group__9 : rule__RULE__Group__9__Impl rule__RULE__Group__10 ;
    public final void rule__RULE__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2284:1: ( rule__RULE__Group__9__Impl rule__RULE__Group__10 )
            // InternalMkDsl.g:2285:2: rule__RULE__Group__9__Impl rule__RULE__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__RULE__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__9"


    // $ANTLR start "rule__RULE__Group__9__Impl"
    // InternalMkDsl.g:2292:1: rule__RULE__Group__9__Impl : ( 'actions' ) ;
    public final void rule__RULE__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2296:1: ( ( 'actions' ) )
            // InternalMkDsl.g:2297:1: ( 'actions' )
            {
            // InternalMkDsl.g:2297:1: ( 'actions' )
            // InternalMkDsl.g:2298:2: 'actions'
            {
             before(grammarAccess.getRULEAccess().getActionsKeyword_9()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRULEAccess().getActionsKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__9__Impl"


    // $ANTLR start "rule__RULE__Group__10"
    // InternalMkDsl.g:2307:1: rule__RULE__Group__10 : rule__RULE__Group__10__Impl rule__RULE__Group__11 ;
    public final void rule__RULE__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2311:1: ( rule__RULE__Group__10__Impl rule__RULE__Group__11 )
            // InternalMkDsl.g:2312:2: rule__RULE__Group__10__Impl rule__RULE__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__RULE__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__10"


    // $ANTLR start "rule__RULE__Group__10__Impl"
    // InternalMkDsl.g:2319:1: rule__RULE__Group__10__Impl : ( ( rule__RULE__ActionsAssignment_10 ) ) ;
    public final void rule__RULE__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2323:1: ( ( ( rule__RULE__ActionsAssignment_10 ) ) )
            // InternalMkDsl.g:2324:1: ( ( rule__RULE__ActionsAssignment_10 ) )
            {
            // InternalMkDsl.g:2324:1: ( ( rule__RULE__ActionsAssignment_10 ) )
            // InternalMkDsl.g:2325:2: ( rule__RULE__ActionsAssignment_10 )
            {
             before(grammarAccess.getRULEAccess().getActionsAssignment_10()); 
            // InternalMkDsl.g:2326:2: ( rule__RULE__ActionsAssignment_10 )
            // InternalMkDsl.g:2326:3: rule__RULE__ActionsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__RULE__ActionsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getRULEAccess().getActionsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__10__Impl"


    // $ANTLR start "rule__RULE__Group__11"
    // InternalMkDsl.g:2334:1: rule__RULE__Group__11 : rule__RULE__Group__11__Impl ;
    public final void rule__RULE__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2338:1: ( rule__RULE__Group__11__Impl )
            // InternalMkDsl.g:2339:2: rule__RULE__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RULE__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__11"


    // $ANTLR start "rule__RULE__Group__11__Impl"
    // InternalMkDsl.g:2345:1: rule__RULE__Group__11__Impl : ( ( rule__RULE__Group_11__0 )* ) ;
    public final void rule__RULE__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2349:1: ( ( ( rule__RULE__Group_11__0 )* ) )
            // InternalMkDsl.g:2350:1: ( ( rule__RULE__Group_11__0 )* )
            {
            // InternalMkDsl.g:2350:1: ( ( rule__RULE__Group_11__0 )* )
            // InternalMkDsl.g:2351:2: ( rule__RULE__Group_11__0 )*
            {
             before(grammarAccess.getRULEAccess().getGroup_11()); 
            // InternalMkDsl.g:2352:2: ( rule__RULE__Group_11__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==RULE_ID) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalMkDsl.g:2352:3: rule__RULE__Group_11__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RULE__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRULEAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group__11__Impl"


    // $ANTLR start "rule__RULE__Group_8__0"
    // InternalMkDsl.g:2361:1: rule__RULE__Group_8__0 : rule__RULE__Group_8__0__Impl rule__RULE__Group_8__1 ;
    public final void rule__RULE__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2365:1: ( rule__RULE__Group_8__0__Impl rule__RULE__Group_8__1 )
            // InternalMkDsl.g:2366:2: rule__RULE__Group_8__0__Impl rule__RULE__Group_8__1
            {
            pushFollow(FOLLOW_25);
            rule__RULE__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group_8__0"


    // $ANTLR start "rule__RULE__Group_8__0__Impl"
    // InternalMkDsl.g:2373:1: rule__RULE__Group_8__0__Impl : ( ',' ) ;
    public final void rule__RULE__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2377:1: ( ( ',' ) )
            // InternalMkDsl.g:2378:1: ( ',' )
            {
            // InternalMkDsl.g:2378:1: ( ',' )
            // InternalMkDsl.g:2379:2: ','
            {
             before(grammarAccess.getRULEAccess().getCommaKeyword_8_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRULEAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group_8__0__Impl"


    // $ANTLR start "rule__RULE__Group_8__1"
    // InternalMkDsl.g:2388:1: rule__RULE__Group_8__1 : rule__RULE__Group_8__1__Impl ;
    public final void rule__RULE__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2392:1: ( rule__RULE__Group_8__1__Impl )
            // InternalMkDsl.g:2393:2: rule__RULE__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RULE__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group_8__1"


    // $ANTLR start "rule__RULE__Group_8__1__Impl"
    // InternalMkDsl.g:2399:1: rule__RULE__Group_8__1__Impl : ( ( rule__RULE__VarsAssignment_8_1 ) ) ;
    public final void rule__RULE__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2403:1: ( ( ( rule__RULE__VarsAssignment_8_1 ) ) )
            // InternalMkDsl.g:2404:1: ( ( rule__RULE__VarsAssignment_8_1 ) )
            {
            // InternalMkDsl.g:2404:1: ( ( rule__RULE__VarsAssignment_8_1 ) )
            // InternalMkDsl.g:2405:2: ( rule__RULE__VarsAssignment_8_1 )
            {
             before(grammarAccess.getRULEAccess().getVarsAssignment_8_1()); 
            // InternalMkDsl.g:2406:2: ( rule__RULE__VarsAssignment_8_1 )
            // InternalMkDsl.g:2406:3: rule__RULE__VarsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__RULE__VarsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRULEAccess().getVarsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group_8__1__Impl"


    // $ANTLR start "rule__RULE__Group_11__0"
    // InternalMkDsl.g:2415:1: rule__RULE__Group_11__0 : rule__RULE__Group_11__0__Impl rule__RULE__Group_11__1 ;
    public final void rule__RULE__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2419:1: ( rule__RULE__Group_11__0__Impl rule__RULE__Group_11__1 )
            // InternalMkDsl.g:2420:2: rule__RULE__Group_11__0__Impl rule__RULE__Group_11__1
            {
            pushFollow(FOLLOW_27);
            rule__RULE__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RULE__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group_11__0"


    // $ANTLR start "rule__RULE__Group_11__0__Impl"
    // InternalMkDsl.g:2427:1: rule__RULE__Group_11__0__Impl : ( ',' ) ;
    public final void rule__RULE__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2431:1: ( ( ',' ) )
            // InternalMkDsl.g:2432:1: ( ',' )
            {
            // InternalMkDsl.g:2432:1: ( ',' )
            // InternalMkDsl.g:2433:2: ','
            {
             before(grammarAccess.getRULEAccess().getCommaKeyword_11_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRULEAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group_11__0__Impl"


    // $ANTLR start "rule__RULE__Group_11__1"
    // InternalMkDsl.g:2442:1: rule__RULE__Group_11__1 : rule__RULE__Group_11__1__Impl ;
    public final void rule__RULE__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2446:1: ( rule__RULE__Group_11__1__Impl )
            // InternalMkDsl.g:2447:2: rule__RULE__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RULE__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group_11__1"


    // $ANTLR start "rule__RULE__Group_11__1__Impl"
    // InternalMkDsl.g:2453:1: rule__RULE__Group_11__1__Impl : ( ( rule__RULE__ActionsAssignment_11_1 ) ) ;
    public final void rule__RULE__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2457:1: ( ( ( rule__RULE__ActionsAssignment_11_1 ) ) )
            // InternalMkDsl.g:2458:1: ( ( rule__RULE__ActionsAssignment_11_1 ) )
            {
            // InternalMkDsl.g:2458:1: ( ( rule__RULE__ActionsAssignment_11_1 ) )
            // InternalMkDsl.g:2459:2: ( rule__RULE__ActionsAssignment_11_1 )
            {
             before(grammarAccess.getRULEAccess().getActionsAssignment_11_1()); 
            // InternalMkDsl.g:2460:2: ( rule__RULE__ActionsAssignment_11_1 )
            // InternalMkDsl.g:2460:3: rule__RULE__ActionsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__RULE__ActionsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getRULEAccess().getActionsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__Group_11__1__Impl"


    // $ANTLR start "rule__ACTION__Group__0"
    // InternalMkDsl.g:2469:1: rule__ACTION__Group__0 : rule__ACTION__Group__0__Impl rule__ACTION__Group__1 ;
    public final void rule__ACTION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2473:1: ( rule__ACTION__Group__0__Impl rule__ACTION__Group__1 )
            // InternalMkDsl.g:2474:2: rule__ACTION__Group__0__Impl rule__ACTION__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ACTION__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACTION__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Group__0"


    // $ANTLR start "rule__ACTION__Group__0__Impl"
    // InternalMkDsl.g:2481:1: rule__ACTION__Group__0__Impl : ( 'Action' ) ;
    public final void rule__ACTION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2485:1: ( ( 'Action' ) )
            // InternalMkDsl.g:2486:1: ( 'Action' )
            {
            // InternalMkDsl.g:2486:1: ( 'Action' )
            // InternalMkDsl.g:2487:2: 'Action'
            {
             before(grammarAccess.getACTIONAccess().getActionKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getACTIONAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Group__0__Impl"


    // $ANTLR start "rule__ACTION__Group__1"
    // InternalMkDsl.g:2496:1: rule__ACTION__Group__1 : rule__ACTION__Group__1__Impl rule__ACTION__Group__2 ;
    public final void rule__ACTION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2500:1: ( rule__ACTION__Group__1__Impl rule__ACTION__Group__2 )
            // InternalMkDsl.g:2501:2: rule__ACTION__Group__1__Impl rule__ACTION__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ACTION__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACTION__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Group__1"


    // $ANTLR start "rule__ACTION__Group__1__Impl"
    // InternalMkDsl.g:2508:1: rule__ACTION__Group__1__Impl : ( ( rule__ACTION__NameAssignment_1 ) ) ;
    public final void rule__ACTION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2512:1: ( ( ( rule__ACTION__NameAssignment_1 ) ) )
            // InternalMkDsl.g:2513:1: ( ( rule__ACTION__NameAssignment_1 ) )
            {
            // InternalMkDsl.g:2513:1: ( ( rule__ACTION__NameAssignment_1 ) )
            // InternalMkDsl.g:2514:2: ( rule__ACTION__NameAssignment_1 )
            {
             before(grammarAccess.getACTIONAccess().getNameAssignment_1()); 
            // InternalMkDsl.g:2515:2: ( rule__ACTION__NameAssignment_1 )
            // InternalMkDsl.g:2515:3: rule__ACTION__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ACTION__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getACTIONAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Group__1__Impl"


    // $ANTLR start "rule__ACTION__Group__2"
    // InternalMkDsl.g:2523:1: rule__ACTION__Group__2 : rule__ACTION__Group__2__Impl rule__ACTION__Group__3 ;
    public final void rule__ACTION__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2527:1: ( rule__ACTION__Group__2__Impl rule__ACTION__Group__3 )
            // InternalMkDsl.g:2528:2: rule__ACTION__Group__2__Impl rule__ACTION__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ACTION__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACTION__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Group__2"


    // $ANTLR start "rule__ACTION__Group__2__Impl"
    // InternalMkDsl.g:2535:1: rule__ACTION__Group__2__Impl : ( 'ID' ) ;
    public final void rule__ACTION__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2539:1: ( ( 'ID' ) )
            // InternalMkDsl.g:2540:1: ( 'ID' )
            {
            // InternalMkDsl.g:2540:1: ( 'ID' )
            // InternalMkDsl.g:2541:2: 'ID'
            {
             before(grammarAccess.getACTIONAccess().getIDKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getACTIONAccess().getIDKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Group__2__Impl"


    // $ANTLR start "rule__ACTION__Group__3"
    // InternalMkDsl.g:2550:1: rule__ACTION__Group__3 : rule__ACTION__Group__3__Impl rule__ACTION__Group__4 ;
    public final void rule__ACTION__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2554:1: ( rule__ACTION__Group__3__Impl rule__ACTION__Group__4 )
            // InternalMkDsl.g:2555:2: rule__ACTION__Group__3__Impl rule__ACTION__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ACTION__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACTION__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Group__3"


    // $ANTLR start "rule__ACTION__Group__3__Impl"
    // InternalMkDsl.g:2562:1: rule__ACTION__Group__3__Impl : ( ( rule__ACTION__IDAssignment_3 ) ) ;
    public final void rule__ACTION__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2566:1: ( ( ( rule__ACTION__IDAssignment_3 ) ) )
            // InternalMkDsl.g:2567:1: ( ( rule__ACTION__IDAssignment_3 ) )
            {
            // InternalMkDsl.g:2567:1: ( ( rule__ACTION__IDAssignment_3 ) )
            // InternalMkDsl.g:2568:2: ( rule__ACTION__IDAssignment_3 )
            {
             before(grammarAccess.getACTIONAccess().getIDAssignment_3()); 
            // InternalMkDsl.g:2569:2: ( rule__ACTION__IDAssignment_3 )
            // InternalMkDsl.g:2569:3: rule__ACTION__IDAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ACTION__IDAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getACTIONAccess().getIDAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Group__3__Impl"


    // $ANTLR start "rule__ACTION__Group__4"
    // InternalMkDsl.g:2577:1: rule__ACTION__Group__4 : rule__ACTION__Group__4__Impl rule__ACTION__Group__5 ;
    public final void rule__ACTION__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2581:1: ( rule__ACTION__Group__4__Impl rule__ACTION__Group__5 )
            // InternalMkDsl.g:2582:2: rule__ACTION__Group__4__Impl rule__ACTION__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ACTION__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACTION__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Group__4"


    // $ANTLR start "rule__ACTION__Group__4__Impl"
    // InternalMkDsl.g:2589:1: rule__ACTION__Group__4__Impl : ( 'event' ) ;
    public final void rule__ACTION__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2593:1: ( ( 'event' ) )
            // InternalMkDsl.g:2594:1: ( 'event' )
            {
            // InternalMkDsl.g:2594:1: ( 'event' )
            // InternalMkDsl.g:2595:2: 'event'
            {
             before(grammarAccess.getACTIONAccess().getEventKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getACTIONAccess().getEventKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Group__4__Impl"


    // $ANTLR start "rule__ACTION__Group__5"
    // InternalMkDsl.g:2604:1: rule__ACTION__Group__5 : rule__ACTION__Group__5__Impl ;
    public final void rule__ACTION__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2608:1: ( rule__ACTION__Group__5__Impl )
            // InternalMkDsl.g:2609:2: rule__ACTION__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ACTION__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Group__5"


    // $ANTLR start "rule__ACTION__Group__5__Impl"
    // InternalMkDsl.g:2615:1: rule__ACTION__Group__5__Impl : ( ( rule__ACTION__EventAssignment_5 ) ) ;
    public final void rule__ACTION__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2619:1: ( ( ( rule__ACTION__EventAssignment_5 ) ) )
            // InternalMkDsl.g:2620:1: ( ( rule__ACTION__EventAssignment_5 ) )
            {
            // InternalMkDsl.g:2620:1: ( ( rule__ACTION__EventAssignment_5 ) )
            // InternalMkDsl.g:2621:2: ( rule__ACTION__EventAssignment_5 )
            {
             before(grammarAccess.getACTIONAccess().getEventAssignment_5()); 
            // InternalMkDsl.g:2622:2: ( rule__ACTION__EventAssignment_5 )
            // InternalMkDsl.g:2622:3: rule__ACTION__EventAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ACTION__EventAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getACTIONAccess().getEventAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Group__5__Impl"


    // $ANTLR start "rule__EXPRESSION__Group__0"
    // InternalMkDsl.g:2631:1: rule__EXPRESSION__Group__0 : rule__EXPRESSION__Group__0__Impl rule__EXPRESSION__Group__1 ;
    public final void rule__EXPRESSION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2635:1: ( rule__EXPRESSION__Group__0__Impl rule__EXPRESSION__Group__1 )
            // InternalMkDsl.g:2636:2: rule__EXPRESSION__Group__0__Impl rule__EXPRESSION__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__EXPRESSION__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EXPRESSION__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group__0"


    // $ANTLR start "rule__EXPRESSION__Group__0__Impl"
    // InternalMkDsl.g:2643:1: rule__EXPRESSION__Group__0__Impl : ( '(' ) ;
    public final void rule__EXPRESSION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2647:1: ( ( '(' ) )
            // InternalMkDsl.g:2648:1: ( '(' )
            {
            // InternalMkDsl.g:2648:1: ( '(' )
            // InternalMkDsl.g:2649:2: '('
            {
             before(grammarAccess.getEXPRESSIONAccess().getLeftParenthesSKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEXPRESSIONAccess().getLeftParenthesSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group__0__Impl"


    // $ANTLR start "rule__EXPRESSION__Group__1"
    // InternalMkDsl.g:2658:1: rule__EXPRESSION__Group__1 : rule__EXPRESSION__Group__1__Impl rule__EXPRESSION__Group__2 ;
    public final void rule__EXPRESSION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2662:1: ( rule__EXPRESSION__Group__1__Impl rule__EXPRESSION__Group__2 )
            // InternalMkDsl.g:2663:2: rule__EXPRESSION__Group__1__Impl rule__EXPRESSION__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__EXPRESSION__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EXPRESSION__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group__1"


    // $ANTLR start "rule__EXPRESSION__Group__1__Impl"
    // InternalMkDsl.g:2670:1: rule__EXPRESSION__Group__1__Impl : ( ( rule__EXPRESSION__LeftAssignment_1 ) ) ;
    public final void rule__EXPRESSION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2674:1: ( ( ( rule__EXPRESSION__LeftAssignment_1 ) ) )
            // InternalMkDsl.g:2675:1: ( ( rule__EXPRESSION__LeftAssignment_1 ) )
            {
            // InternalMkDsl.g:2675:1: ( ( rule__EXPRESSION__LeftAssignment_1 ) )
            // InternalMkDsl.g:2676:2: ( rule__EXPRESSION__LeftAssignment_1 )
            {
             before(grammarAccess.getEXPRESSIONAccess().getLeftAssignment_1()); 
            // InternalMkDsl.g:2677:2: ( rule__EXPRESSION__LeftAssignment_1 )
            // InternalMkDsl.g:2677:3: rule__EXPRESSION__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EXPRESSION__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEXPRESSIONAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group__1__Impl"


    // $ANTLR start "rule__EXPRESSION__Group__2"
    // InternalMkDsl.g:2685:1: rule__EXPRESSION__Group__2 : rule__EXPRESSION__Group__2__Impl rule__EXPRESSION__Group__3 ;
    public final void rule__EXPRESSION__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2689:1: ( rule__EXPRESSION__Group__2__Impl rule__EXPRESSION__Group__3 )
            // InternalMkDsl.g:2690:2: rule__EXPRESSION__Group__2__Impl rule__EXPRESSION__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__EXPRESSION__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EXPRESSION__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group__2"


    // $ANTLR start "rule__EXPRESSION__Group__2__Impl"
    // InternalMkDsl.g:2697:1: rule__EXPRESSION__Group__2__Impl : ( ( rule__EXPRESSION__OperandAssignment_2 )? ) ;
    public final void rule__EXPRESSION__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2701:1: ( ( ( rule__EXPRESSION__OperandAssignment_2 )? ) )
            // InternalMkDsl.g:2702:1: ( ( rule__EXPRESSION__OperandAssignment_2 )? )
            {
            // InternalMkDsl.g:2702:1: ( ( rule__EXPRESSION__OperandAssignment_2 )? )
            // InternalMkDsl.g:2703:2: ( rule__EXPRESSION__OperandAssignment_2 )?
            {
             before(grammarAccess.getEXPRESSIONAccess().getOperandAssignment_2()); 
            // InternalMkDsl.g:2704:2: ( rule__EXPRESSION__OperandAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=13 && LA21_0<=17)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMkDsl.g:2704:3: rule__EXPRESSION__OperandAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSION__OperandAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEXPRESSIONAccess().getOperandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group__2__Impl"


    // $ANTLR start "rule__EXPRESSION__Group__3"
    // InternalMkDsl.g:2712:1: rule__EXPRESSION__Group__3 : rule__EXPRESSION__Group__3__Impl rule__EXPRESSION__Group__4 ;
    public final void rule__EXPRESSION__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2716:1: ( rule__EXPRESSION__Group__3__Impl rule__EXPRESSION__Group__4 )
            // InternalMkDsl.g:2717:2: rule__EXPRESSION__Group__3__Impl rule__EXPRESSION__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__EXPRESSION__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EXPRESSION__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group__3"


    // $ANTLR start "rule__EXPRESSION__Group__3__Impl"
    // InternalMkDsl.g:2724:1: rule__EXPRESSION__Group__3__Impl : ( ( rule__EXPRESSION__RightAssignment_3 )? ) ;
    public final void rule__EXPRESSION__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2728:1: ( ( ( rule__EXPRESSION__RightAssignment_3 )? ) )
            // InternalMkDsl.g:2729:1: ( ( rule__EXPRESSION__RightAssignment_3 )? )
            {
            // InternalMkDsl.g:2729:1: ( ( rule__EXPRESSION__RightAssignment_3 )? )
            // InternalMkDsl.g:2730:2: ( rule__EXPRESSION__RightAssignment_3 )?
            {
             before(grammarAccess.getEXPRESSIONAccess().getRightAssignment_3()); 
            // InternalMkDsl.g:2731:2: ( rule__EXPRESSION__RightAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_INT && LA22_0<=RULE_STRING)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMkDsl.g:2731:3: rule__EXPRESSION__RightAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSION__RightAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEXPRESSIONAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group__3__Impl"


    // $ANTLR start "rule__EXPRESSION__Group__4"
    // InternalMkDsl.g:2739:1: rule__EXPRESSION__Group__4 : rule__EXPRESSION__Group__4__Impl ;
    public final void rule__EXPRESSION__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2743:1: ( rule__EXPRESSION__Group__4__Impl )
            // InternalMkDsl.g:2744:2: rule__EXPRESSION__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EXPRESSION__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group__4"


    // $ANTLR start "rule__EXPRESSION__Group__4__Impl"
    // InternalMkDsl.g:2750:1: rule__EXPRESSION__Group__4__Impl : ( ')' ) ;
    public final void rule__EXPRESSION__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2754:1: ( ( ')' ) )
            // InternalMkDsl.g:2755:1: ( ')' )
            {
            // InternalMkDsl.g:2755:1: ( ')' )
            // InternalMkDsl.g:2756:2: ')'
            {
             before(grammarAccess.getEXPRESSIONAccess().getRGhtParenthesSKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEXPRESSIONAccess().getRGhtParenthesSKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group__4__Impl"


    // $ANTLR start "rule__VARIABLE__Group__0"
    // InternalMkDsl.g:2766:1: rule__VARIABLE__Group__0 : rule__VARIABLE__Group__0__Impl rule__VARIABLE__Group__1 ;
    public final void rule__VARIABLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2770:1: ( rule__VARIABLE__Group__0__Impl rule__VARIABLE__Group__1 )
            // InternalMkDsl.g:2771:2: rule__VARIABLE__Group__0__Impl rule__VARIABLE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VARIABLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VARIABLE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE__Group__0"


    // $ANTLR start "rule__VARIABLE__Group__0__Impl"
    // InternalMkDsl.g:2778:1: rule__VARIABLE__Group__0__Impl : ( 'var' ) ;
    public final void rule__VARIABLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2782:1: ( ( 'var' ) )
            // InternalMkDsl.g:2783:1: ( 'var' )
            {
            // InternalMkDsl.g:2783:1: ( 'var' )
            // InternalMkDsl.g:2784:2: 'var'
            {
             before(grammarAccess.getVARIABLEAccess().getVarKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVARIABLEAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE__Group__0__Impl"


    // $ANTLR start "rule__VARIABLE__Group__1"
    // InternalMkDsl.g:2793:1: rule__VARIABLE__Group__1 : rule__VARIABLE__Group__1__Impl rule__VARIABLE__Group__2 ;
    public final void rule__VARIABLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2797:1: ( rule__VARIABLE__Group__1__Impl rule__VARIABLE__Group__2 )
            // InternalMkDsl.g:2798:2: rule__VARIABLE__Group__1__Impl rule__VARIABLE__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__VARIABLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VARIABLE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE__Group__1"


    // $ANTLR start "rule__VARIABLE__Group__1__Impl"
    // InternalMkDsl.g:2805:1: rule__VARIABLE__Group__1__Impl : ( ( rule__VARIABLE__NameAssignment_1 ) ) ;
    public final void rule__VARIABLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2809:1: ( ( ( rule__VARIABLE__NameAssignment_1 ) ) )
            // InternalMkDsl.g:2810:1: ( ( rule__VARIABLE__NameAssignment_1 ) )
            {
            // InternalMkDsl.g:2810:1: ( ( rule__VARIABLE__NameAssignment_1 ) )
            // InternalMkDsl.g:2811:2: ( rule__VARIABLE__NameAssignment_1 )
            {
             before(grammarAccess.getVARIABLEAccess().getNameAssignment_1()); 
            // InternalMkDsl.g:2812:2: ( rule__VARIABLE__NameAssignment_1 )
            // InternalMkDsl.g:2812:3: rule__VARIABLE__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VARIABLE__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVARIABLEAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE__Group__1__Impl"


    // $ANTLR start "rule__VARIABLE__Group__2"
    // InternalMkDsl.g:2820:1: rule__VARIABLE__Group__2 : rule__VARIABLE__Group__2__Impl rule__VARIABLE__Group__3 ;
    public final void rule__VARIABLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2824:1: ( rule__VARIABLE__Group__2__Impl rule__VARIABLE__Group__3 )
            // InternalMkDsl.g:2825:2: rule__VARIABLE__Group__2__Impl rule__VARIABLE__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__VARIABLE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VARIABLE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE__Group__2"


    // $ANTLR start "rule__VARIABLE__Group__2__Impl"
    // InternalMkDsl.g:2832:1: rule__VARIABLE__Group__2__Impl : ( 'value' ) ;
    public final void rule__VARIABLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2836:1: ( ( 'value' ) )
            // InternalMkDsl.g:2837:1: ( 'value' )
            {
            // InternalMkDsl.g:2837:1: ( 'value' )
            // InternalMkDsl.g:2838:2: 'value'
            {
             before(grammarAccess.getVARIABLEAccess().getValueKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVARIABLEAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE__Group__2__Impl"


    // $ANTLR start "rule__VARIABLE__Group__3"
    // InternalMkDsl.g:2847:1: rule__VARIABLE__Group__3 : rule__VARIABLE__Group__3__Impl ;
    public final void rule__VARIABLE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2851:1: ( rule__VARIABLE__Group__3__Impl )
            // InternalMkDsl.g:2852:2: rule__VARIABLE__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VARIABLE__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE__Group__3"


    // $ANTLR start "rule__VARIABLE__Group__3__Impl"
    // InternalMkDsl.g:2858:1: rule__VARIABLE__Group__3__Impl : ( ( rule__VARIABLE__ValueAssignment_3 ) ) ;
    public final void rule__VARIABLE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2862:1: ( ( ( rule__VARIABLE__ValueAssignment_3 ) ) )
            // InternalMkDsl.g:2863:1: ( ( rule__VARIABLE__ValueAssignment_3 ) )
            {
            // InternalMkDsl.g:2863:1: ( ( rule__VARIABLE__ValueAssignment_3 ) )
            // InternalMkDsl.g:2864:2: ( rule__VARIABLE__ValueAssignment_3 )
            {
             before(grammarAccess.getVARIABLEAccess().getValueAssignment_3()); 
            // InternalMkDsl.g:2865:2: ( rule__VARIABLE__ValueAssignment_3 )
            // InternalMkDsl.g:2865:3: rule__VARIABLE__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VARIABLE__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVARIABLEAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE__Group__3__Impl"


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // InternalMkDsl.g:2874:1: rule__Model__DeclarationsAssignment : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2878:1: ( ( ruleDeclaration ) )
            // InternalMkDsl.g:2879:2: ( ruleDeclaration )
            {
            // InternalMkDsl.g:2879:2: ( ruleDeclaration )
            // InternalMkDsl.g:2880:3: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclarationsAssignment"


    // $ANTLR start "rule__ESG__NameAssignment_1"
    // InternalMkDsl.g:2889:1: rule__ESG__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ESG__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2893:1: ( ( RULE_STRING ) )
            // InternalMkDsl.g:2894:2: ( RULE_STRING )
            {
            // InternalMkDsl.g:2894:2: ( RULE_STRING )
            // InternalMkDsl.g:2895:3: RULE_STRING
            {
             before(grammarAccess.getESGAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getESGAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__NameAssignment_1"


    // $ANTLR start "rule__ESG__EventAssignment_2_1"
    // InternalMkDsl.g:2904:1: rule__ESG__EventAssignment_2_1 : ( ruleEvent ) ;
    public final void rule__ESG__EventAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2908:1: ( ( ruleEvent ) )
            // InternalMkDsl.g:2909:2: ( ruleEvent )
            {
            // InternalMkDsl.g:2909:2: ( ruleEvent )
            // InternalMkDsl.g:2910:3: ruleEvent
            {
             before(grammarAccess.getESGAccess().getEventEventParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getESGAccess().getEventEventParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__EventAssignment_2_1"


    // $ANTLR start "rule__ESG__SubESGsAssignment_3"
    // InternalMkDsl.g:2919:1: rule__ESG__SubESGsAssignment_3 : ( ( rule__ESG__SubESGsAlternatives_3_0 ) ) ;
    public final void rule__ESG__SubESGsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2923:1: ( ( ( rule__ESG__SubESGsAlternatives_3_0 ) ) )
            // InternalMkDsl.g:2924:2: ( ( rule__ESG__SubESGsAlternatives_3_0 ) )
            {
            // InternalMkDsl.g:2924:2: ( ( rule__ESG__SubESGsAlternatives_3_0 ) )
            // InternalMkDsl.g:2925:3: ( rule__ESG__SubESGsAlternatives_3_0 )
            {
             before(grammarAccess.getESGAccess().getSubESGsAlternatives_3_0()); 
            // InternalMkDsl.g:2926:3: ( rule__ESG__SubESGsAlternatives_3_0 )
            // InternalMkDsl.g:2926:4: rule__ESG__SubESGsAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ESG__SubESGsAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getESGAccess().getSubESGsAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__SubESGsAssignment_3"


    // $ANTLR start "rule__ESG__SubESGsAssignment_4_1"
    // InternalMkDsl.g:2934:1: rule__ESG__SubESGsAssignment_4_1 : ( ( rule__ESG__SubESGsAlternatives_4_1_0 ) ) ;
    public final void rule__ESG__SubESGsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2938:1: ( ( ( rule__ESG__SubESGsAlternatives_4_1_0 ) ) )
            // InternalMkDsl.g:2939:2: ( ( rule__ESG__SubESGsAlternatives_4_1_0 ) )
            {
            // InternalMkDsl.g:2939:2: ( ( rule__ESG__SubESGsAlternatives_4_1_0 ) )
            // InternalMkDsl.g:2940:3: ( rule__ESG__SubESGsAlternatives_4_1_0 )
            {
             before(grammarAccess.getESGAccess().getSubESGsAlternatives_4_1_0()); 
            // InternalMkDsl.g:2941:3: ( rule__ESG__SubESGsAlternatives_4_1_0 )
            // InternalMkDsl.g:2941:4: rule__ESG__SubESGsAlternatives_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ESG__SubESGsAlternatives_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getESGAccess().getSubESGsAlternatives_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__SubESGsAssignment_4_1"


    // $ANTLR start "rule__ESG__EdgesAssignment_5"
    // InternalMkDsl.g:2949:1: rule__ESG__EdgesAssignment_5 : ( ruleEDGE ) ;
    public final void rule__ESG__EdgesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2953:1: ( ( ruleEDGE ) )
            // InternalMkDsl.g:2954:2: ( ruleEDGE )
            {
            // InternalMkDsl.g:2954:2: ( ruleEDGE )
            // InternalMkDsl.g:2955:3: ruleEDGE
            {
             before(grammarAccess.getESGAccess().getEdgesEDGEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDGE();

            state._fsp--;

             after(grammarAccess.getESGAccess().getEdgesEDGEParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__EdgesAssignment_5"


    // $ANTLR start "rule__ESG__EdgesAssignment_6_1"
    // InternalMkDsl.g:2964:1: rule__ESG__EdgesAssignment_6_1 : ( ruleEDGE ) ;
    public final void rule__ESG__EdgesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2968:1: ( ( ruleEDGE ) )
            // InternalMkDsl.g:2969:2: ( ruleEDGE )
            {
            // InternalMkDsl.g:2969:2: ( ruleEDGE )
            // InternalMkDsl.g:2970:3: ruleEDGE
            {
             before(grammarAccess.getESGAccess().getEdgesEDGEParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDGE();

            state._fsp--;

             after(grammarAccess.getESGAccess().getEdgesEDGEParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ESG__EdgesAssignment_6_1"


    // $ANTLR start "rule__VERTEX__IDAssignment_2"
    // InternalMkDsl.g:2979:1: rule__VERTEX__IDAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VERTEX__IDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2983:1: ( ( RULE_STRING ) )
            // InternalMkDsl.g:2984:2: ( RULE_STRING )
            {
            // InternalMkDsl.g:2984:2: ( RULE_STRING )
            // InternalMkDsl.g:2985:3: RULE_STRING
            {
             before(grammarAccess.getVERTEXAccess().getIDSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVERTEXAccess().getIDSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__IDAssignment_2"


    // $ANTLR start "rule__VERTEX__EventAssignment_4"
    // InternalMkDsl.g:2994:1: rule__VERTEX__EventAssignment_4 : ( ruleEvent ) ;
    public final void rule__VERTEX__EventAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:2998:1: ( ( ruleEvent ) )
            // InternalMkDsl.g:2999:2: ( ruleEvent )
            {
            // InternalMkDsl.g:2999:2: ( ruleEvent )
            // InternalMkDsl.g:3000:3: ruleEvent
            {
             before(grammarAccess.getVERTEXAccess().getEventEventParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getVERTEXAccess().getEventEventParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__EventAssignment_4"


    // $ANTLR start "rule__VERTEX__ColorAssignment_5_1"
    // InternalMkDsl.g:3009:1: rule__VERTEX__ColorAssignment_5_1 : ( ruleCOLOR ) ;
    public final void rule__VERTEX__ColorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3013:1: ( ( ruleCOLOR ) )
            // InternalMkDsl.g:3014:2: ( ruleCOLOR )
            {
            // InternalMkDsl.g:3014:2: ( ruleCOLOR )
            // InternalMkDsl.g:3015:3: ruleCOLOR
            {
             before(grammarAccess.getVERTEXAccess().getColorCOLORParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCOLOR();

            state._fsp--;

             after(grammarAccess.getVERTEXAccess().getColorCOLORParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__ColorAssignment_5_1"


    // $ANTLR start "rule__VERTEX__DtAssignment_6"
    // InternalMkDsl.g:3024:1: rule__VERTEX__DtAssignment_6 : ( ruleDT ) ;
    public final void rule__VERTEX__DtAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3028:1: ( ( ruleDT ) )
            // InternalMkDsl.g:3029:2: ( ruleDT )
            {
            // InternalMkDsl.g:3029:2: ( ruleDT )
            // InternalMkDsl.g:3030:3: ruleDT
            {
             before(grammarAccess.getVERTEXAccess().getDtDTParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDT();

            state._fsp--;

             after(grammarAccess.getVERTEXAccess().getDtDTParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERTEX__DtAssignment_6"


    // $ANTLR start "rule__Event__NameAssignment"
    // InternalMkDsl.g:3039:1: rule__Event__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Event__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3043:1: ( ( RULE_STRING ) )
            // InternalMkDsl.g:3044:2: ( RULE_STRING )
            {
            // InternalMkDsl.g:3044:2: ( RULE_STRING )
            // InternalMkDsl.g:3045:3: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment"


    // $ANTLR start "rule__EDGE__NameAssignment_1"
    // InternalMkDsl.g:3054:1: rule__EDGE__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EDGE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3058:1: ( ( RULE_STRING ) )
            // InternalMkDsl.g:3059:2: ( RULE_STRING )
            {
            // InternalMkDsl.g:3059:2: ( RULE_STRING )
            // InternalMkDsl.g:3060:3: RULE_STRING
            {
             before(grammarAccess.getEDGEAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEDGEAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__NameAssignment_1"


    // $ANTLR start "rule__EDGE__SourceAssignment_3"
    // InternalMkDsl.g:3069:1: rule__EDGE__SourceAssignment_3 : ( RULE_INT ) ;
    public final void rule__EDGE__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3073:1: ( ( RULE_INT ) )
            // InternalMkDsl.g:3074:2: ( RULE_INT )
            {
            // InternalMkDsl.g:3074:2: ( RULE_INT )
            // InternalMkDsl.g:3075:3: RULE_INT
            {
             before(grammarAccess.getEDGEAccess().getSourceINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDGEAccess().getSourceINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__SourceAssignment_3"


    // $ANTLR start "rule__EDGE__TargetAssignment_5"
    // InternalMkDsl.g:3084:1: rule__EDGE__TargetAssignment_5 : ( RULE_INT ) ;
    public final void rule__EDGE__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3088:1: ( ( RULE_INT ) )
            // InternalMkDsl.g:3089:2: ( RULE_INT )
            {
            // InternalMkDsl.g:3089:2: ( RULE_INT )
            // InternalMkDsl.g:3090:3: RULE_INT
            {
             before(grammarAccess.getEDGEAccess().getTargetINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDGEAccess().getTargetINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__TargetAssignment_5"


    // $ANTLR start "rule__EDGE__ColorAssignment_6_1"
    // InternalMkDsl.g:3099:1: rule__EDGE__ColorAssignment_6_1 : ( ruleCOLOR ) ;
    public final void rule__EDGE__ColorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3103:1: ( ( ruleCOLOR ) )
            // InternalMkDsl.g:3104:2: ( ruleCOLOR )
            {
            // InternalMkDsl.g:3104:2: ( ruleCOLOR )
            // InternalMkDsl.g:3105:3: ruleCOLOR
            {
             before(grammarAccess.getEDGEAccess().getColorCOLORParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCOLOR();

            state._fsp--;

             after(grammarAccess.getEDGEAccess().getColorCOLORParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDGE__ColorAssignment_6_1"


    // $ANTLR start "rule__DT__NameAssignment_1"
    // InternalMkDsl.g:3114:1: rule__DT__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DT__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3118:1: ( ( RULE_STRING ) )
            // InternalMkDsl.g:3119:2: ( RULE_STRING )
            {
            // InternalMkDsl.g:3119:2: ( RULE_STRING )
            // InternalMkDsl.g:3120:3: RULE_STRING
            {
             before(grammarAccess.getDTAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDTAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__NameAssignment_1"


    // $ANTLR start "rule__DT__IDAssignment_3"
    // InternalMkDsl.g:3129:1: rule__DT__IDAssignment_3 : ( RULE_INT ) ;
    public final void rule__DT__IDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3133:1: ( ( RULE_INT ) )
            // InternalMkDsl.g:3134:2: ( RULE_INT )
            {
            // InternalMkDsl.g:3134:2: ( RULE_INT )
            // InternalMkDsl.g:3135:3: RULE_INT
            {
             before(grammarAccess.getDTAccess().getIDINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDTAccess().getIDINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__IDAssignment_3"


    // $ANTLR start "rule__DT__ConditionsAssignment_4"
    // InternalMkDsl.g:3144:1: rule__DT__ConditionsAssignment_4 : ( ruleCONDITION ) ;
    public final void rule__DT__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3148:1: ( ( ruleCONDITION ) )
            // InternalMkDsl.g:3149:2: ( ruleCONDITION )
            {
            // InternalMkDsl.g:3149:2: ( ruleCONDITION )
            // InternalMkDsl.g:3150:3: ruleCONDITION
            {
             before(grammarAccess.getDTAccess().getConditionsCONDITIONParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCONDITION();

            state._fsp--;

             after(grammarAccess.getDTAccess().getConditionsCONDITIONParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__ConditionsAssignment_4"


    // $ANTLR start "rule__DT__ConditionsAssignment_5_1"
    // InternalMkDsl.g:3159:1: rule__DT__ConditionsAssignment_5_1 : ( ruleCONDITION ) ;
    public final void rule__DT__ConditionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3163:1: ( ( ruleCONDITION ) )
            // InternalMkDsl.g:3164:2: ( ruleCONDITION )
            {
            // InternalMkDsl.g:3164:2: ( ruleCONDITION )
            // InternalMkDsl.g:3165:3: ruleCONDITION
            {
             before(grammarAccess.getDTAccess().getConditionsCONDITIONParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCONDITION();

            state._fsp--;

             after(grammarAccess.getDTAccess().getConditionsCONDITIONParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__ConditionsAssignment_5_1"


    // $ANTLR start "rule__DT__ActionsAssignment_6"
    // InternalMkDsl.g:3174:1: rule__DT__ActionsAssignment_6 : ( ruleACTION ) ;
    public final void rule__DT__ActionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3178:1: ( ( ruleACTION ) )
            // InternalMkDsl.g:3179:2: ( ruleACTION )
            {
            // InternalMkDsl.g:3179:2: ( ruleACTION )
            // InternalMkDsl.g:3180:3: ruleACTION
            {
             before(grammarAccess.getDTAccess().getActionsACTIONParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleACTION();

            state._fsp--;

             after(grammarAccess.getDTAccess().getActionsACTIONParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__ActionsAssignment_6"


    // $ANTLR start "rule__DT__ActionsAssignment_7_1"
    // InternalMkDsl.g:3189:1: rule__DT__ActionsAssignment_7_1 : ( ruleACTION ) ;
    public final void rule__DT__ActionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3193:1: ( ( ruleACTION ) )
            // InternalMkDsl.g:3194:2: ( ruleACTION )
            {
            // InternalMkDsl.g:3194:2: ( ruleACTION )
            // InternalMkDsl.g:3195:3: ruleACTION
            {
             before(grammarAccess.getDTAccess().getActionsACTIONParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleACTION();

            state._fsp--;

             after(grammarAccess.getDTAccess().getActionsACTIONParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__ActionsAssignment_7_1"


    // $ANTLR start "rule__DT__RulesAssignment_8"
    // InternalMkDsl.g:3204:1: rule__DT__RulesAssignment_8 : ( ruleRULE ) ;
    public final void rule__DT__RulesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3208:1: ( ( ruleRULE ) )
            // InternalMkDsl.g:3209:2: ( ruleRULE )
            {
            // InternalMkDsl.g:3209:2: ( ruleRULE )
            // InternalMkDsl.g:3210:3: ruleRULE
            {
             before(grammarAccess.getDTAccess().getRulesRULEParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleRULE();

            state._fsp--;

             after(grammarAccess.getDTAccess().getRulesRULEParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__RulesAssignment_8"


    // $ANTLR start "rule__DT__RulesAssignment_9_1"
    // InternalMkDsl.g:3219:1: rule__DT__RulesAssignment_9_1 : ( ruleRULE ) ;
    public final void rule__DT__RulesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3223:1: ( ( ruleRULE ) )
            // InternalMkDsl.g:3224:2: ( ruleRULE )
            {
            // InternalMkDsl.g:3224:2: ( ruleRULE )
            // InternalMkDsl.g:3225:3: ruleRULE
            {
             before(grammarAccess.getDTAccess().getRulesRULEParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRULE();

            state._fsp--;

             after(grammarAccess.getDTAccess().getRulesRULEParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__RulesAssignment_9_1"


    // $ANTLR start "rule__CONDITION__NameAssignment_1"
    // InternalMkDsl.g:3234:1: rule__CONDITION__NameAssignment_1 : ( RULE_INT ) ;
    public final void rule__CONDITION__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3238:1: ( ( RULE_INT ) )
            // InternalMkDsl.g:3239:2: ( RULE_INT )
            {
            // InternalMkDsl.g:3239:2: ( RULE_INT )
            // InternalMkDsl.g:3240:3: RULE_INT
            {
             before(grammarAccess.getCONDITIONAccess().getNameINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCONDITIONAccess().getNameINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONDITION__NameAssignment_1"


    // $ANTLR start "rule__CONDITION__EvalsAssignment_2"
    // InternalMkDsl.g:3249:1: rule__CONDITION__EvalsAssignment_2 : ( ruleEVALUABLE ) ;
    public final void rule__CONDITION__EvalsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3253:1: ( ( ruleEVALUABLE ) )
            // InternalMkDsl.g:3254:2: ( ruleEVALUABLE )
            {
            // InternalMkDsl.g:3254:2: ( ruleEVALUABLE )
            // InternalMkDsl.g:3255:3: ruleEVALUABLE
            {
             before(grammarAccess.getCONDITIONAccess().getEvalsEVALUABLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEVALUABLE();

            state._fsp--;

             after(grammarAccess.getCONDITIONAccess().getEvalsEVALUABLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONDITION__EvalsAssignment_2"


    // $ANTLR start "rule__CONDITION__EvalsAssignment_3"
    // InternalMkDsl.g:3264:1: rule__CONDITION__EvalsAssignment_3 : ( ruleEVALUABLE ) ;
    public final void rule__CONDITION__EvalsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3268:1: ( ( ruleEVALUABLE ) )
            // InternalMkDsl.g:3269:2: ( ruleEVALUABLE )
            {
            // InternalMkDsl.g:3269:2: ( ruleEVALUABLE )
            // InternalMkDsl.g:3270:3: ruleEVALUABLE
            {
             before(grammarAccess.getCONDITIONAccess().getEvalsEVALUABLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEVALUABLE();

            state._fsp--;

             after(grammarAccess.getCONDITIONAccess().getEvalsEVALUABLEParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONDITION__EvalsAssignment_3"


    // $ANTLR start "rule__RULE__NameAssignment_1"
    // InternalMkDsl.g:3279:1: rule__RULE__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RULE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3283:1: ( ( RULE_STRING ) )
            // InternalMkDsl.g:3284:2: ( RULE_STRING )
            {
            // InternalMkDsl.g:3284:2: ( RULE_STRING )
            // InternalMkDsl.g:3285:3: RULE_STRING
            {
             before(grammarAccess.getRULEAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRULEAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__NameAssignment_1"


    // $ANTLR start "rule__RULE__IDAssignment_3"
    // InternalMkDsl.g:3294:1: rule__RULE__IDAssignment_3 : ( RULE_INT ) ;
    public final void rule__RULE__IDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3298:1: ( ( RULE_INT ) )
            // InternalMkDsl.g:3299:2: ( RULE_INT )
            {
            // InternalMkDsl.g:3299:2: ( RULE_INT )
            // InternalMkDsl.g:3300:3: RULE_INT
            {
             before(grammarAccess.getRULEAccess().getIDINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRULEAccess().getIDINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__IDAssignment_3"


    // $ANTLR start "rule__RULE__ValueAssignment_5"
    // InternalMkDsl.g:3309:1: rule__RULE__ValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__RULE__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3313:1: ( ( RULE_STRING ) )
            // InternalMkDsl.g:3314:2: ( RULE_STRING )
            {
            // InternalMkDsl.g:3314:2: ( RULE_STRING )
            // InternalMkDsl.g:3315:3: RULE_STRING
            {
             before(grammarAccess.getRULEAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRULEAccess().getValueSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__ValueAssignment_5"


    // $ANTLR start "rule__RULE__VarsAssignment_7"
    // InternalMkDsl.g:3324:1: rule__RULE__VarsAssignment_7 : ( ruleVARIABLE ) ;
    public final void rule__RULE__VarsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3328:1: ( ( ruleVARIABLE ) )
            // InternalMkDsl.g:3329:2: ( ruleVARIABLE )
            {
            // InternalMkDsl.g:3329:2: ( ruleVARIABLE )
            // InternalMkDsl.g:3330:3: ruleVARIABLE
            {
             before(grammarAccess.getRULEAccess().getVarsVARIABLEParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleVARIABLE();

            state._fsp--;

             after(grammarAccess.getRULEAccess().getVarsVARIABLEParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__VarsAssignment_7"


    // $ANTLR start "rule__RULE__VarsAssignment_8_1"
    // InternalMkDsl.g:3339:1: rule__RULE__VarsAssignment_8_1 : ( ruleVARIABLE ) ;
    public final void rule__RULE__VarsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3343:1: ( ( ruleVARIABLE ) )
            // InternalMkDsl.g:3344:2: ( ruleVARIABLE )
            {
            // InternalMkDsl.g:3344:2: ( ruleVARIABLE )
            // InternalMkDsl.g:3345:3: ruleVARIABLE
            {
             before(grammarAccess.getRULEAccess().getVarsVARIABLEParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVARIABLE();

            state._fsp--;

             after(grammarAccess.getRULEAccess().getVarsVARIABLEParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__VarsAssignment_8_1"


    // $ANTLR start "rule__RULE__ActionsAssignment_10"
    // InternalMkDsl.g:3354:1: rule__RULE__ActionsAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__RULE__ActionsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3358:1: ( ( ( RULE_ID ) ) )
            // InternalMkDsl.g:3359:2: ( ( RULE_ID ) )
            {
            // InternalMkDsl.g:3359:2: ( ( RULE_ID ) )
            // InternalMkDsl.g:3360:3: ( RULE_ID )
            {
             before(grammarAccess.getRULEAccess().getActionsACTIONCrossReference_10_0()); 
            // InternalMkDsl.g:3361:3: ( RULE_ID )
            // InternalMkDsl.g:3362:4: RULE_ID
            {
             before(grammarAccess.getRULEAccess().getActionsACTIONIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRULEAccess().getActionsACTIONIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getRULEAccess().getActionsACTIONCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__ActionsAssignment_10"


    // $ANTLR start "rule__RULE__ActionsAssignment_11_1"
    // InternalMkDsl.g:3373:1: rule__RULE__ActionsAssignment_11_1 : ( ( RULE_ID ) ) ;
    public final void rule__RULE__ActionsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3377:1: ( ( ( RULE_ID ) ) )
            // InternalMkDsl.g:3378:2: ( ( RULE_ID ) )
            {
            // InternalMkDsl.g:3378:2: ( ( RULE_ID ) )
            // InternalMkDsl.g:3379:3: ( RULE_ID )
            {
             before(grammarAccess.getRULEAccess().getActionsACTIONCrossReference_11_1_0()); 
            // InternalMkDsl.g:3380:3: ( RULE_ID )
            // InternalMkDsl.g:3381:4: RULE_ID
            {
             before(grammarAccess.getRULEAccess().getActionsACTIONIDTerminalRuleCall_11_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRULEAccess().getActionsACTIONIDTerminalRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getRULEAccess().getActionsACTIONCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RULE__ActionsAssignment_11_1"


    // $ANTLR start "rule__ACTION__NameAssignment_1"
    // InternalMkDsl.g:3392:1: rule__ACTION__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ACTION__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3396:1: ( ( RULE_ID ) )
            // InternalMkDsl.g:3397:2: ( RULE_ID )
            {
            // InternalMkDsl.g:3397:2: ( RULE_ID )
            // InternalMkDsl.g:3398:3: RULE_ID
            {
             before(grammarAccess.getACTIONAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getACTIONAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__NameAssignment_1"


    // $ANTLR start "rule__ACTION__IDAssignment_3"
    // InternalMkDsl.g:3407:1: rule__ACTION__IDAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ACTION__IDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3411:1: ( ( RULE_STRING ) )
            // InternalMkDsl.g:3412:2: ( RULE_STRING )
            {
            // InternalMkDsl.g:3412:2: ( RULE_STRING )
            // InternalMkDsl.g:3413:3: RULE_STRING
            {
             before(grammarAccess.getACTIONAccess().getIDSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getACTIONAccess().getIDSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__IDAssignment_3"


    // $ANTLR start "rule__ACTION__EventAssignment_5"
    // InternalMkDsl.g:3422:1: rule__ACTION__EventAssignment_5 : ( RULE_INT ) ;
    public final void rule__ACTION__EventAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3426:1: ( ( RULE_INT ) )
            // InternalMkDsl.g:3427:2: ( RULE_INT )
            {
            // InternalMkDsl.g:3427:2: ( RULE_INT )
            // InternalMkDsl.g:3428:3: RULE_INT
            {
             before(grammarAccess.getACTIONAccess().getEventINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getACTIONAccess().getEventINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__EventAssignment_5"


    // $ANTLR start "rule__EXPRESSION__LeftAssignment_1"
    // InternalMkDsl.g:3437:1: rule__EXPRESSION__LeftAssignment_1 : ( ruleLITERAL ) ;
    public final void rule__EXPRESSION__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3441:1: ( ( ruleLITERAL ) )
            // InternalMkDsl.g:3442:2: ( ruleLITERAL )
            {
            // InternalMkDsl.g:3442:2: ( ruleLITERAL )
            // InternalMkDsl.g:3443:3: ruleLITERAL
            {
             before(grammarAccess.getEXPRESSIONAccess().getLeftLITERALParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLITERAL();

            state._fsp--;

             after(grammarAccess.getEXPRESSIONAccess().getLeftLITERALParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__LeftAssignment_1"


    // $ANTLR start "rule__EXPRESSION__OperandAssignment_2"
    // InternalMkDsl.g:3452:1: rule__EXPRESSION__OperandAssignment_2 : ( ruleOPERAND ) ;
    public final void rule__EXPRESSION__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3456:1: ( ( ruleOPERAND ) )
            // InternalMkDsl.g:3457:2: ( ruleOPERAND )
            {
            // InternalMkDsl.g:3457:2: ( ruleOPERAND )
            // InternalMkDsl.g:3458:3: ruleOPERAND
            {
             before(grammarAccess.getEXPRESSIONAccess().getOperandOPERANDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOPERAND();

            state._fsp--;

             after(grammarAccess.getEXPRESSIONAccess().getOperandOPERANDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__OperandAssignment_2"


    // $ANTLR start "rule__EXPRESSION__RightAssignment_3"
    // InternalMkDsl.g:3467:1: rule__EXPRESSION__RightAssignment_3 : ( ruleLITERAL ) ;
    public final void rule__EXPRESSION__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3471:1: ( ( ruleLITERAL ) )
            // InternalMkDsl.g:3472:2: ( ruleLITERAL )
            {
            // InternalMkDsl.g:3472:2: ( ruleLITERAL )
            // InternalMkDsl.g:3473:3: ruleLITERAL
            {
             before(grammarAccess.getEXPRESSIONAccess().getRightLITERALParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLITERAL();

            state._fsp--;

             after(grammarAccess.getEXPRESSIONAccess().getRightLITERALParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__RightAssignment_3"


    // $ANTLR start "rule__CONNECTIVE__ConnectiveAssignment"
    // InternalMkDsl.g:3482:1: rule__CONNECTIVE__ConnectiveAssignment : ( ( rule__CONNECTIVE__ConnectiveAlternatives_0 ) ) ;
    public final void rule__CONNECTIVE__ConnectiveAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3486:1: ( ( ( rule__CONNECTIVE__ConnectiveAlternatives_0 ) ) )
            // InternalMkDsl.g:3487:2: ( ( rule__CONNECTIVE__ConnectiveAlternatives_0 ) )
            {
            // InternalMkDsl.g:3487:2: ( ( rule__CONNECTIVE__ConnectiveAlternatives_0 ) )
            // InternalMkDsl.g:3488:3: ( rule__CONNECTIVE__ConnectiveAlternatives_0 )
            {
             before(grammarAccess.getCONNECTIVEAccess().getConnectiveAlternatives_0()); 
            // InternalMkDsl.g:3489:3: ( rule__CONNECTIVE__ConnectiveAlternatives_0 )
            // InternalMkDsl.g:3489:4: rule__CONNECTIVE__ConnectiveAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__CONNECTIVE__ConnectiveAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCONNECTIVEAccess().getConnectiveAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONNECTIVE__ConnectiveAssignment"


    // $ANTLR start "rule__VARIABLE__NameAssignment_1"
    // InternalMkDsl.g:3497:1: rule__VARIABLE__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__VARIABLE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3501:1: ( ( RULE_STRING ) )
            // InternalMkDsl.g:3502:2: ( RULE_STRING )
            {
            // InternalMkDsl.g:3502:2: ( RULE_STRING )
            // InternalMkDsl.g:3503:3: RULE_STRING
            {
             before(grammarAccess.getVARIABLEAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVARIABLEAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE__NameAssignment_1"


    // $ANTLR start "rule__VARIABLE__ValueAssignment_3"
    // InternalMkDsl.g:3512:1: rule__VARIABLE__ValueAssignment_3 : ( ruleLITERAL ) ;
    public final void rule__VARIABLE__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3516:1: ( ( ruleLITERAL ) )
            // InternalMkDsl.g:3517:2: ( ruleLITERAL )
            {
            // InternalMkDsl.g:3517:2: ( ruleLITERAL )
            // InternalMkDsl.g:3518:3: ruleLITERAL
            {
             before(grammarAccess.getVARIABLEAccess().getValueLITERALParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLITERAL();

            state._fsp--;

             after(grammarAccess.getVARIABLEAccess().getValueLITERALParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE__ValueAssignment_3"


    // $ANTLR start "rule__OPERAND__OperandAssignment"
    // InternalMkDsl.g:3527:1: rule__OPERAND__OperandAssignment : ( ( rule__OPERAND__OperandAlternatives_0 ) ) ;
    public final void rule__OPERAND__OperandAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3531:1: ( ( ( rule__OPERAND__OperandAlternatives_0 ) ) )
            // InternalMkDsl.g:3532:2: ( ( rule__OPERAND__OperandAlternatives_0 ) )
            {
            // InternalMkDsl.g:3532:2: ( ( rule__OPERAND__OperandAlternatives_0 ) )
            // InternalMkDsl.g:3533:3: ( rule__OPERAND__OperandAlternatives_0 )
            {
             before(grammarAccess.getOPERANDAccess().getOperandAlternatives_0()); 
            // InternalMkDsl.g:3534:3: ( rule__OPERAND__OperandAlternatives_0 )
            // InternalMkDsl.g:3534:4: rule__OPERAND__OperandAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__OPERAND__OperandAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOPERANDAccess().getOperandAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPERAND__OperandAssignment"


    // $ANTLR start "rule__COLOR__NameAssignment"
    // InternalMkDsl.g:3542:1: rule__COLOR__NameAssignment : ( ( rule__COLOR__NameAlternatives_0 ) ) ;
    public final void rule__COLOR__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMkDsl.g:3546:1: ( ( ( rule__COLOR__NameAlternatives_0 ) ) )
            // InternalMkDsl.g:3547:2: ( ( rule__COLOR__NameAlternatives_0 ) )
            {
            // InternalMkDsl.g:3547:2: ( ( rule__COLOR__NameAlternatives_0 ) )
            // InternalMkDsl.g:3548:3: ( rule__COLOR__NameAlternatives_0 )
            {
             before(grammarAccess.getCOLORAccess().getNameAlternatives_0()); 
            // InternalMkDsl.g:3549:3: ( rule__COLOR__NameAlternatives_0 )
            // InternalMkDsl.g:3549:4: rule__COLOR__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__COLOR__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCOLORAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000005800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000001800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000001802L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000002000003E030L});

}