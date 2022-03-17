package com.mert.recherche.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.mert.recherche.services.MkDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMkDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ESG'", "'Event'", "','", "'Vertex'", "'ID'", "'Color'", "'Edge'", "'Source'", "'Target'", "'DT'", "'Condition'", "'Rule'", "'value'", "'variables'", "'actions'", "'Action'", "'event'", "'('", "')'", "'AND'", "'OR'", "'var'", "'<'", "'<='", "'=='", "'>='", "'>'", "'black'", "'red'", "'green'", "'blue'", "'orange'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_INT=5;
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

        public InternalMkDslParser(TokenStream input, MkDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MkDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMkDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMkDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMkDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMkDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_declarations_0_0= ruleDeclaration ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;



        	enterRule();

        try {
            // InternalMkDsl.g:77:2: ( ( (lv_declarations_0_0= ruleDeclaration ) )* )
            // InternalMkDsl.g:78:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            {
            // InternalMkDsl.g:78:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMkDsl.g:79:3: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // InternalMkDsl.g:79:3: (lv_declarations_0_0= ruleDeclaration )
            	    // InternalMkDsl.g:80:4: lv_declarations_0_0= ruleDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"declarations",
            	    					lv_declarations_0_0,
            	    					"com.mert.recherche.MkDsl.Declaration");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclaration"
    // InternalMkDsl.g:100:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalMkDsl.g:100:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMkDsl.g:101:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalMkDsl.g:107:1: ruleDeclaration returns [EObject current=null] : this_ESG_0= ruleESG ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ESG_0 = null;



        	enterRule();

        try {
            // InternalMkDsl.g:113:2: (this_ESG_0= ruleESG )
            // InternalMkDsl.g:114:2: this_ESG_0= ruleESG
            {

            		newCompositeNode(grammarAccess.getDeclarationAccess().getESGParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ESG_0=ruleESG();

            state._fsp--;


            		current = this_ESG_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleESG"
    // InternalMkDsl.g:125:1: entryRuleESG returns [EObject current=null] : iv_ruleESG= ruleESG EOF ;
    public final EObject entryRuleESG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESG = null;


        try {
            // InternalMkDsl.g:125:44: (iv_ruleESG= ruleESG EOF )
            // InternalMkDsl.g:126:2: iv_ruleESG= ruleESG EOF
            {
             newCompositeNode(grammarAccess.getESGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESG=ruleESG();

            state._fsp--;

             current =iv_ruleESG; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleESG"


    // $ANTLR start "ruleESG"
    // InternalMkDsl.g:132:1: ruleESG returns [EObject current=null] : (otherlv_0= 'ESG' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Event' ( (lv_event_3_0= ruleEvent ) ) )? ( ( (lv_subESGs_4_1= ruleVERTEX | lv_subESGs_4_2= ruleESG ) ) ) (otherlv_5= ',' ( ( (lv_subESGs_6_1= ruleVERTEX | lv_subESGs_6_2= ruleESG ) ) ) )* ( (lv_edges_7_0= ruleEDGE ) ) (otherlv_8= ',' ( (lv_edges_9_0= ruleEDGE ) ) )* ) ;
    public final EObject ruleESG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_event_3_0 = null;

        EObject lv_subESGs_4_1 = null;

        EObject lv_subESGs_4_2 = null;

        EObject lv_subESGs_6_1 = null;

        EObject lv_subESGs_6_2 = null;

        EObject lv_edges_7_0 = null;

        EObject lv_edges_9_0 = null;



        	enterRule();

        try {
            // InternalMkDsl.g:138:2: ( (otherlv_0= 'ESG' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Event' ( (lv_event_3_0= ruleEvent ) ) )? ( ( (lv_subESGs_4_1= ruleVERTEX | lv_subESGs_4_2= ruleESG ) ) ) (otherlv_5= ',' ( ( (lv_subESGs_6_1= ruleVERTEX | lv_subESGs_6_2= ruleESG ) ) ) )* ( (lv_edges_7_0= ruleEDGE ) ) (otherlv_8= ',' ( (lv_edges_9_0= ruleEDGE ) ) )* ) )
            // InternalMkDsl.g:139:2: (otherlv_0= 'ESG' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Event' ( (lv_event_3_0= ruleEvent ) ) )? ( ( (lv_subESGs_4_1= ruleVERTEX | lv_subESGs_4_2= ruleESG ) ) ) (otherlv_5= ',' ( ( (lv_subESGs_6_1= ruleVERTEX | lv_subESGs_6_2= ruleESG ) ) ) )* ( (lv_edges_7_0= ruleEDGE ) ) (otherlv_8= ',' ( (lv_edges_9_0= ruleEDGE ) ) )* )
            {
            // InternalMkDsl.g:139:2: (otherlv_0= 'ESG' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Event' ( (lv_event_3_0= ruleEvent ) ) )? ( ( (lv_subESGs_4_1= ruleVERTEX | lv_subESGs_4_2= ruleESG ) ) ) (otherlv_5= ',' ( ( (lv_subESGs_6_1= ruleVERTEX | lv_subESGs_6_2= ruleESG ) ) ) )* ( (lv_edges_7_0= ruleEDGE ) ) (otherlv_8= ',' ( (lv_edges_9_0= ruleEDGE ) ) )* )
            // InternalMkDsl.g:140:3: otherlv_0= 'ESG' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'Event' ( (lv_event_3_0= ruleEvent ) ) )? ( ( (lv_subESGs_4_1= ruleVERTEX | lv_subESGs_4_2= ruleESG ) ) ) (otherlv_5= ',' ( ( (lv_subESGs_6_1= ruleVERTEX | lv_subESGs_6_2= ruleESG ) ) ) )* ( (lv_edges_7_0= ruleEDGE ) ) (otherlv_8= ',' ( (lv_edges_9_0= ruleEDGE ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getESGAccess().getESGKeyword_0());
            		
            // InternalMkDsl.g:144:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMkDsl.g:145:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMkDsl.g:145:4: (lv_name_1_0= RULE_STRING )
            // InternalMkDsl.g:146:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getESGAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getESGRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMkDsl.g:162:3: (otherlv_2= 'Event' ( (lv_event_3_0= ruleEvent ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMkDsl.g:163:4: otherlv_2= 'Event' ( (lv_event_3_0= ruleEvent ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getESGAccess().getEventKeyword_2_0());
                    			
                    // InternalMkDsl.g:167:4: ( (lv_event_3_0= ruleEvent ) )
                    // InternalMkDsl.g:168:5: (lv_event_3_0= ruleEvent )
                    {
                    // InternalMkDsl.g:168:5: (lv_event_3_0= ruleEvent )
                    // InternalMkDsl.g:169:6: lv_event_3_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getESGAccess().getEventEventParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_event_3_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getESGRule());
                    						}
                    						set(
                    							current,
                    							"event",
                    							lv_event_3_0,
                    							"com.mert.recherche.MkDsl.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMkDsl.g:187:3: ( ( (lv_subESGs_4_1= ruleVERTEX | lv_subESGs_4_2= ruleESG ) ) )
            // InternalMkDsl.g:188:4: ( (lv_subESGs_4_1= ruleVERTEX | lv_subESGs_4_2= ruleESG ) )
            {
            // InternalMkDsl.g:188:4: ( (lv_subESGs_4_1= ruleVERTEX | lv_subESGs_4_2= ruleESG ) )
            // InternalMkDsl.g:189:5: (lv_subESGs_4_1= ruleVERTEX | lv_subESGs_4_2= ruleESG )
            {
            // InternalMkDsl.g:189:5: (lv_subESGs_4_1= ruleVERTEX | lv_subESGs_4_2= ruleESG )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMkDsl.g:190:6: lv_subESGs_4_1= ruleVERTEX
                    {

                    						newCompositeNode(grammarAccess.getESGAccess().getSubESGsVERTEXParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_subESGs_4_1=ruleVERTEX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getESGRule());
                    						}
                    						add(
                    							current,
                    							"subESGs",
                    							lv_subESGs_4_1,
                    							"com.mert.recherche.MkDsl.VERTEX");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:206:6: lv_subESGs_4_2= ruleESG
                    {

                    						newCompositeNode(grammarAccess.getESGAccess().getSubESGsESGParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_5);
                    lv_subESGs_4_2=ruleESG();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getESGRule());
                    						}
                    						add(
                    							current,
                    							"subESGs",
                    							lv_subESGs_4_2,
                    							"com.mert.recherche.MkDsl.ESG");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMkDsl.g:224:3: (otherlv_5= ',' ( ( (lv_subESGs_6_1= ruleVERTEX | lv_subESGs_6_2= ruleESG ) ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMkDsl.g:225:4: otherlv_5= ',' ( ( (lv_subESGs_6_1= ruleVERTEX | lv_subESGs_6_2= ruleESG ) ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getESGAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMkDsl.g:229:4: ( ( (lv_subESGs_6_1= ruleVERTEX | lv_subESGs_6_2= ruleESG ) ) )
            	    // InternalMkDsl.g:230:5: ( (lv_subESGs_6_1= ruleVERTEX | lv_subESGs_6_2= ruleESG ) )
            	    {
            	    // InternalMkDsl.g:230:5: ( (lv_subESGs_6_1= ruleVERTEX | lv_subESGs_6_2= ruleESG ) )
            	    // InternalMkDsl.g:231:6: (lv_subESGs_6_1= ruleVERTEX | lv_subESGs_6_2= ruleESG )
            	    {
            	    // InternalMkDsl.g:231:6: (lv_subESGs_6_1= ruleVERTEX | lv_subESGs_6_2= ruleESG )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==14) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==11) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMkDsl.g:232:7: lv_subESGs_6_1= ruleVERTEX
            	            {

            	            							newCompositeNode(grammarAccess.getESGAccess().getSubESGsVERTEXParserRuleCall_4_1_0_0());
            	            						
            	            pushFollow(FOLLOW_5);
            	            lv_subESGs_6_1=ruleVERTEX();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getESGRule());
            	            							}
            	            							add(
            	            								current,
            	            								"subESGs",
            	            								lv_subESGs_6_1,
            	            								"com.mert.recherche.MkDsl.VERTEX");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMkDsl.g:248:7: lv_subESGs_6_2= ruleESG
            	            {

            	            							newCompositeNode(grammarAccess.getESGAccess().getSubESGsESGParserRuleCall_4_1_0_1());
            	            						
            	            pushFollow(FOLLOW_5);
            	            lv_subESGs_6_2=ruleESG();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getESGRule());
            	            							}
            	            							add(
            	            								current,
            	            								"subESGs",
            	            								lv_subESGs_6_2,
            	            								"com.mert.recherche.MkDsl.ESG");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMkDsl.g:267:3: ( (lv_edges_7_0= ruleEDGE ) )
            // InternalMkDsl.g:268:4: (lv_edges_7_0= ruleEDGE )
            {
            // InternalMkDsl.g:268:4: (lv_edges_7_0= ruleEDGE )
            // InternalMkDsl.g:269:5: lv_edges_7_0= ruleEDGE
            {

            					newCompositeNode(grammarAccess.getESGAccess().getEdgesEDGEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_edges_7_0=ruleEDGE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getESGRule());
            					}
            					add(
            						current,
            						"edges",
            						lv_edges_7_0,
            						"com.mert.recherche.MkDsl.EDGE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMkDsl.g:286:3: (otherlv_8= ',' ( (lv_edges_9_0= ruleEDGE ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==17) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalMkDsl.g:287:4: otherlv_8= ',' ( (lv_edges_9_0= ruleEDGE ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_8, grammarAccess.getESGAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMkDsl.g:291:4: ( (lv_edges_9_0= ruleEDGE ) )
            	    // InternalMkDsl.g:292:5: (lv_edges_9_0= ruleEDGE )
            	    {
            	    // InternalMkDsl.g:292:5: (lv_edges_9_0= ruleEDGE )
            	    // InternalMkDsl.g:293:6: lv_edges_9_0= ruleEDGE
            	    {

            	    						newCompositeNode(grammarAccess.getESGAccess().getEdgesEDGEParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_edges_9_0=ruleEDGE();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getESGRule());
            	    						}
            	    						add(
            	    							current,
            	    							"edges",
            	    							lv_edges_9_0,
            	    							"com.mert.recherche.MkDsl.EDGE");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleESG"


    // $ANTLR start "entryRuleVERTEX"
    // InternalMkDsl.g:315:1: entryRuleVERTEX returns [EObject current=null] : iv_ruleVERTEX= ruleVERTEX EOF ;
    public final EObject entryRuleVERTEX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVERTEX = null;


        try {
            // InternalMkDsl.g:315:47: (iv_ruleVERTEX= ruleVERTEX EOF )
            // InternalMkDsl.g:316:2: iv_ruleVERTEX= ruleVERTEX EOF
            {
             newCompositeNode(grammarAccess.getVERTEXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVERTEX=ruleVERTEX();

            state._fsp--;

             current =iv_ruleVERTEX; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVERTEX"


    // $ANTLR start "ruleVERTEX"
    // InternalMkDsl.g:322:1: ruleVERTEX returns [EObject current=null] : (otherlv_0= 'Vertex' otherlv_1= 'ID' ( (lv_ID_2_0= RULE_STRING ) ) otherlv_3= 'Event' ( (lv_event_4_0= ruleEvent ) ) (otherlv_5= 'Color' ( (lv_color_6_0= ruleCOLOR ) ) )? ( (lv_dt_7_0= ruleDT ) )? ) ;
    public final EObject ruleVERTEX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ID_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_event_4_0 = null;

        EObject lv_color_6_0 = null;

        EObject lv_dt_7_0 = null;



        	enterRule();

        try {
            // InternalMkDsl.g:328:2: ( (otherlv_0= 'Vertex' otherlv_1= 'ID' ( (lv_ID_2_0= RULE_STRING ) ) otherlv_3= 'Event' ( (lv_event_4_0= ruleEvent ) ) (otherlv_5= 'Color' ( (lv_color_6_0= ruleCOLOR ) ) )? ( (lv_dt_7_0= ruleDT ) )? ) )
            // InternalMkDsl.g:329:2: (otherlv_0= 'Vertex' otherlv_1= 'ID' ( (lv_ID_2_0= RULE_STRING ) ) otherlv_3= 'Event' ( (lv_event_4_0= ruleEvent ) ) (otherlv_5= 'Color' ( (lv_color_6_0= ruleCOLOR ) ) )? ( (lv_dt_7_0= ruleDT ) )? )
            {
            // InternalMkDsl.g:329:2: (otherlv_0= 'Vertex' otherlv_1= 'ID' ( (lv_ID_2_0= RULE_STRING ) ) otherlv_3= 'Event' ( (lv_event_4_0= ruleEvent ) ) (otherlv_5= 'Color' ( (lv_color_6_0= ruleCOLOR ) ) )? ( (lv_dt_7_0= ruleDT ) )? )
            // InternalMkDsl.g:330:3: otherlv_0= 'Vertex' otherlv_1= 'ID' ( (lv_ID_2_0= RULE_STRING ) ) otherlv_3= 'Event' ( (lv_event_4_0= ruleEvent ) ) (otherlv_5= 'Color' ( (lv_color_6_0= ruleCOLOR ) ) )? ( (lv_dt_7_0= ruleDT ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getVERTEXAccess().getVertexKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVERTEXAccess().getIDKeyword_1());
            		
            // InternalMkDsl.g:338:3: ( (lv_ID_2_0= RULE_STRING ) )
            // InternalMkDsl.g:339:4: (lv_ID_2_0= RULE_STRING )
            {
            // InternalMkDsl.g:339:4: (lv_ID_2_0= RULE_STRING )
            // InternalMkDsl.g:340:5: lv_ID_2_0= RULE_STRING
            {
            lv_ID_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_ID_2_0, grammarAccess.getVERTEXAccess().getIDSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVERTEXRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ID",
            						lv_ID_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getVERTEXAccess().getEventKeyword_3());
            		
            // InternalMkDsl.g:360:3: ( (lv_event_4_0= ruleEvent ) )
            // InternalMkDsl.g:361:4: (lv_event_4_0= ruleEvent )
            {
            // InternalMkDsl.g:361:4: (lv_event_4_0= ruleEvent )
            // InternalMkDsl.g:362:5: lv_event_4_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getVERTEXAccess().getEventEventParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_event_4_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVERTEXRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_4_0,
            						"com.mert.recherche.MkDsl.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMkDsl.g:379:3: (otherlv_5= 'Color' ( (lv_color_6_0= ruleCOLOR ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMkDsl.g:380:4: otherlv_5= 'Color' ( (lv_color_6_0= ruleCOLOR ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getVERTEXAccess().getColorKeyword_5_0());
                    			
                    // InternalMkDsl.g:384:4: ( (lv_color_6_0= ruleCOLOR ) )
                    // InternalMkDsl.g:385:5: (lv_color_6_0= ruleCOLOR )
                    {
                    // InternalMkDsl.g:385:5: (lv_color_6_0= ruleCOLOR )
                    // InternalMkDsl.g:386:6: lv_color_6_0= ruleCOLOR
                    {

                    						newCompositeNode(grammarAccess.getVERTEXAccess().getColorCOLORParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_color_6_0=ruleCOLOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVERTEXRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_6_0,
                    							"com.mert.recherche.MkDsl.COLOR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMkDsl.g:404:3: ( (lv_dt_7_0= ruleDT ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMkDsl.g:405:4: (lv_dt_7_0= ruleDT )
                    {
                    // InternalMkDsl.g:405:4: (lv_dt_7_0= ruleDT )
                    // InternalMkDsl.g:406:5: lv_dt_7_0= ruleDT
                    {

                    					newCompositeNode(grammarAccess.getVERTEXAccess().getDtDTParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dt_7_0=ruleDT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVERTEXRule());
                    					}
                    					set(
                    						current,
                    						"dt",
                    						lv_dt_7_0,
                    						"com.mert.recherche.MkDsl.DT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVERTEX"


    // $ANTLR start "entryRuleEvent"
    // InternalMkDsl.g:427:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMkDsl.g:427:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMkDsl.g:428:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMkDsl.g:434:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMkDsl.g:440:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalMkDsl.g:441:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalMkDsl.g:441:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalMkDsl.g:442:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalMkDsl.g:442:3: (lv_name_0_0= RULE_STRING )
            // InternalMkDsl.g:443:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEventRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEDGE"
    // InternalMkDsl.g:462:1: entryRuleEDGE returns [EObject current=null] : iv_ruleEDGE= ruleEDGE EOF ;
    public final EObject entryRuleEDGE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDGE = null;


        try {
            // InternalMkDsl.g:462:45: (iv_ruleEDGE= ruleEDGE EOF )
            // InternalMkDsl.g:463:2: iv_ruleEDGE= ruleEDGE EOF
            {
             newCompositeNode(grammarAccess.getEDGERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDGE=ruleEDGE();

            state._fsp--;

             current =iv_ruleEDGE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDGE"


    // $ANTLR start "ruleEDGE"
    // InternalMkDsl.g:469:1: ruleEDGE returns [EObject current=null] : (otherlv_0= 'Edge' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Source' ( (lv_source_3_0= RULE_INT ) ) otherlv_4= 'Target' ( (lv_target_5_0= RULE_INT ) ) (otherlv_6= 'Color' ( (lv_color_7_0= ruleCOLOR ) ) )? ) ;
    public final EObject ruleEDGE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_source_3_0=null;
        Token otherlv_4=null;
        Token lv_target_5_0=null;
        Token otherlv_6=null;
        EObject lv_color_7_0 = null;



        	enterRule();

        try {
            // InternalMkDsl.g:475:2: ( (otherlv_0= 'Edge' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Source' ( (lv_source_3_0= RULE_INT ) ) otherlv_4= 'Target' ( (lv_target_5_0= RULE_INT ) ) (otherlv_6= 'Color' ( (lv_color_7_0= ruleCOLOR ) ) )? ) )
            // InternalMkDsl.g:476:2: (otherlv_0= 'Edge' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Source' ( (lv_source_3_0= RULE_INT ) ) otherlv_4= 'Target' ( (lv_target_5_0= RULE_INT ) ) (otherlv_6= 'Color' ( (lv_color_7_0= ruleCOLOR ) ) )? )
            {
            // InternalMkDsl.g:476:2: (otherlv_0= 'Edge' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Source' ( (lv_source_3_0= RULE_INT ) ) otherlv_4= 'Target' ( (lv_target_5_0= RULE_INT ) ) (otherlv_6= 'Color' ( (lv_color_7_0= ruleCOLOR ) ) )? )
            // InternalMkDsl.g:477:3: otherlv_0= 'Edge' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Source' ( (lv_source_3_0= RULE_INT ) ) otherlv_4= 'Target' ( (lv_target_5_0= RULE_INT ) ) (otherlv_6= 'Color' ( (lv_color_7_0= ruleCOLOR ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEDGEAccess().getEdgeKeyword_0());
            		
            // InternalMkDsl.g:481:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMkDsl.g:482:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMkDsl.g:482:4: (lv_name_1_0= RULE_STRING )
            // InternalMkDsl.g:483:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEDGEAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDGERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEDGEAccess().getSourceKeyword_2());
            		
            // InternalMkDsl.g:503:3: ( (lv_source_3_0= RULE_INT ) )
            // InternalMkDsl.g:504:4: (lv_source_3_0= RULE_INT )
            {
            // InternalMkDsl.g:504:4: (lv_source_3_0= RULE_INT )
            // InternalMkDsl.g:505:5: lv_source_3_0= RULE_INT
            {
            lv_source_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_source_3_0, grammarAccess.getEDGEAccess().getSourceINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDGERule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getEDGEAccess().getTargetKeyword_4());
            		
            // InternalMkDsl.g:525:3: ( (lv_target_5_0= RULE_INT ) )
            // InternalMkDsl.g:526:4: (lv_target_5_0= RULE_INT )
            {
            // InternalMkDsl.g:526:4: (lv_target_5_0= RULE_INT )
            // InternalMkDsl.g:527:5: lv_target_5_0= RULE_INT
            {
            lv_target_5_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_target_5_0, grammarAccess.getEDGEAccess().getTargetINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDGERule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMkDsl.g:543:3: (otherlv_6= 'Color' ( (lv_color_7_0= ruleCOLOR ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMkDsl.g:544:4: otherlv_6= 'Color' ( (lv_color_7_0= ruleCOLOR ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getEDGEAccess().getColorKeyword_6_0());
                    			
                    // InternalMkDsl.g:548:4: ( (lv_color_7_0= ruleCOLOR ) )
                    // InternalMkDsl.g:549:5: (lv_color_7_0= ruleCOLOR )
                    {
                    // InternalMkDsl.g:549:5: (lv_color_7_0= ruleCOLOR )
                    // InternalMkDsl.g:550:6: lv_color_7_0= ruleCOLOR
                    {

                    						newCompositeNode(grammarAccess.getEDGEAccess().getColorCOLORParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_color_7_0=ruleCOLOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDGERule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_7_0,
                    							"com.mert.recherche.MkDsl.COLOR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDGE"


    // $ANTLR start "entryRuleDT"
    // InternalMkDsl.g:572:1: entryRuleDT returns [EObject current=null] : iv_ruleDT= ruleDT EOF ;
    public final EObject entryRuleDT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDT = null;


        try {
            // InternalMkDsl.g:572:43: (iv_ruleDT= ruleDT EOF )
            // InternalMkDsl.g:573:2: iv_ruleDT= ruleDT EOF
            {
             newCompositeNode(grammarAccess.getDTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDT=ruleDT();

            state._fsp--;

             current =iv_ruleDT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDT"


    // $ANTLR start "ruleDT"
    // InternalMkDsl.g:579:1: ruleDT returns [EObject current=null] : (otherlv_0= 'DT' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_INT ) ) ( (lv_conditions_4_0= ruleCONDITION ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCONDITION ) ) )* ( (lv_actions_7_0= ruleACTION ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleACTION ) ) )* ( (lv_rules_10_0= ruleRULE ) ) (otherlv_11= ',' ( (lv_rules_12_0= ruleRULE ) ) )* ) ;
    public final EObject ruleDT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_ID_3_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_conditions_4_0 = null;

        EObject lv_conditions_6_0 = null;

        EObject lv_actions_7_0 = null;

        EObject lv_actions_9_0 = null;

        EObject lv_rules_10_0 = null;

        EObject lv_rules_12_0 = null;



        	enterRule();

        try {
            // InternalMkDsl.g:585:2: ( (otherlv_0= 'DT' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_INT ) ) ( (lv_conditions_4_0= ruleCONDITION ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCONDITION ) ) )* ( (lv_actions_7_0= ruleACTION ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleACTION ) ) )* ( (lv_rules_10_0= ruleRULE ) ) (otherlv_11= ',' ( (lv_rules_12_0= ruleRULE ) ) )* ) )
            // InternalMkDsl.g:586:2: (otherlv_0= 'DT' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_INT ) ) ( (lv_conditions_4_0= ruleCONDITION ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCONDITION ) ) )* ( (lv_actions_7_0= ruleACTION ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleACTION ) ) )* ( (lv_rules_10_0= ruleRULE ) ) (otherlv_11= ',' ( (lv_rules_12_0= ruleRULE ) ) )* )
            {
            // InternalMkDsl.g:586:2: (otherlv_0= 'DT' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_INT ) ) ( (lv_conditions_4_0= ruleCONDITION ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCONDITION ) ) )* ( (lv_actions_7_0= ruleACTION ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleACTION ) ) )* ( (lv_rules_10_0= ruleRULE ) ) (otherlv_11= ',' ( (lv_rules_12_0= ruleRULE ) ) )* )
            // InternalMkDsl.g:587:3: otherlv_0= 'DT' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_INT ) ) ( (lv_conditions_4_0= ruleCONDITION ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCONDITION ) ) )* ( (lv_actions_7_0= ruleACTION ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleACTION ) ) )* ( (lv_rules_10_0= ruleRULE ) ) (otherlv_11= ',' ( (lv_rules_12_0= ruleRULE ) ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDTAccess().getDTKeyword_0());
            		
            // InternalMkDsl.g:591:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMkDsl.g:592:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMkDsl.g:592:4: (lv_name_1_0= RULE_STRING )
            // InternalMkDsl.g:593:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDTAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDTAccess().getIDKeyword_2());
            		
            // InternalMkDsl.g:613:3: ( (lv_ID_3_0= RULE_INT ) )
            // InternalMkDsl.g:614:4: (lv_ID_3_0= RULE_INT )
            {
            // InternalMkDsl.g:614:4: (lv_ID_3_0= RULE_INT )
            // InternalMkDsl.g:615:5: lv_ID_3_0= RULE_INT
            {
            lv_ID_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_ID_3_0, grammarAccess.getDTAccess().getIDINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ID",
            						lv_ID_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMkDsl.g:631:3: ( (lv_conditions_4_0= ruleCONDITION ) )
            // InternalMkDsl.g:632:4: (lv_conditions_4_0= ruleCONDITION )
            {
            // InternalMkDsl.g:632:4: (lv_conditions_4_0= ruleCONDITION )
            // InternalMkDsl.g:633:5: lv_conditions_4_0= ruleCONDITION
            {

            					newCompositeNode(grammarAccess.getDTAccess().getConditionsCONDITIONParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_conditions_4_0=ruleCONDITION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDTRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_4_0,
            						"com.mert.recherche.MkDsl.CONDITION");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMkDsl.g:650:3: (otherlv_5= ',' ( (lv_conditions_6_0= ruleCONDITION ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMkDsl.g:651:4: otherlv_5= ',' ( (lv_conditions_6_0= ruleCONDITION ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_16); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDTAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMkDsl.g:655:4: ( (lv_conditions_6_0= ruleCONDITION ) )
            	    // InternalMkDsl.g:656:5: (lv_conditions_6_0= ruleCONDITION )
            	    {
            	    // InternalMkDsl.g:656:5: (lv_conditions_6_0= ruleCONDITION )
            	    // InternalMkDsl.g:657:6: lv_conditions_6_0= ruleCONDITION
            	    {

            	    						newCompositeNode(grammarAccess.getDTAccess().getConditionsCONDITIONParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_conditions_6_0=ruleCONDITION();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDTRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_6_0,
            	    							"com.mert.recherche.MkDsl.CONDITION");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMkDsl.g:675:3: ( (lv_actions_7_0= ruleACTION ) )
            // InternalMkDsl.g:676:4: (lv_actions_7_0= ruleACTION )
            {
            // InternalMkDsl.g:676:4: (lv_actions_7_0= ruleACTION )
            // InternalMkDsl.g:677:5: lv_actions_7_0= ruleACTION
            {

            					newCompositeNode(grammarAccess.getDTAccess().getActionsACTIONParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_actions_7_0=ruleACTION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDTRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_7_0,
            						"com.mert.recherche.MkDsl.ACTION");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMkDsl.g:694:3: (otherlv_8= ',' ( (lv_actions_9_0= ruleACTION ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMkDsl.g:695:4: otherlv_8= ',' ( (lv_actions_9_0= ruleACTION ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_17); 

            	    				newLeafNode(otherlv_8, grammarAccess.getDTAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMkDsl.g:699:4: ( (lv_actions_9_0= ruleACTION ) )
            	    // InternalMkDsl.g:700:5: (lv_actions_9_0= ruleACTION )
            	    {
            	    // InternalMkDsl.g:700:5: (lv_actions_9_0= ruleACTION )
            	    // InternalMkDsl.g:701:6: lv_actions_9_0= ruleACTION
            	    {

            	    						newCompositeNode(grammarAccess.getDTAccess().getActionsACTIONParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_actions_9_0=ruleACTION();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDTRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_9_0,
            	    							"com.mert.recherche.MkDsl.ACTION");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalMkDsl.g:719:3: ( (lv_rules_10_0= ruleRULE ) )
            // InternalMkDsl.g:720:4: (lv_rules_10_0= ruleRULE )
            {
            // InternalMkDsl.g:720:4: (lv_rules_10_0= ruleRULE )
            // InternalMkDsl.g:721:5: lv_rules_10_0= ruleRULE
            {

            					newCompositeNode(grammarAccess.getDTAccess().getRulesRULEParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_rules_10_0=ruleRULE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDTRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_10_0,
            						"com.mert.recherche.MkDsl.RULE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMkDsl.g:738:3: (otherlv_11= ',' ( (lv_rules_12_0= ruleRULE ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==22) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalMkDsl.g:739:4: otherlv_11= ',' ( (lv_rules_12_0= ruleRULE ) )
            	    {
            	    otherlv_11=(Token)match(input,13,FOLLOW_18); 

            	    				newLeafNode(otherlv_11, grammarAccess.getDTAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMkDsl.g:743:4: ( (lv_rules_12_0= ruleRULE ) )
            	    // InternalMkDsl.g:744:5: (lv_rules_12_0= ruleRULE )
            	    {
            	    // InternalMkDsl.g:744:5: (lv_rules_12_0= ruleRULE )
            	    // InternalMkDsl.g:745:6: lv_rules_12_0= ruleRULE
            	    {

            	    						newCompositeNode(grammarAccess.getDTAccess().getRulesRULEParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_rules_12_0=ruleRULE();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDTRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_12_0,
            	    							"com.mert.recherche.MkDsl.RULE");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDT"


    // $ANTLR start "entryRuleCONDITION"
    // InternalMkDsl.g:767:1: entryRuleCONDITION returns [EObject current=null] : iv_ruleCONDITION= ruleCONDITION EOF ;
    public final EObject entryRuleCONDITION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCONDITION = null;


        try {
            // InternalMkDsl.g:767:50: (iv_ruleCONDITION= ruleCONDITION EOF )
            // InternalMkDsl.g:768:2: iv_ruleCONDITION= ruleCONDITION EOF
            {
             newCompositeNode(grammarAccess.getCONDITIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCONDITION=ruleCONDITION();

            state._fsp--;

             current =iv_ruleCONDITION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCONDITION"


    // $ANTLR start "ruleCONDITION"
    // InternalMkDsl.g:774:1: ruleCONDITION returns [EObject current=null] : (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_INT ) ) ( (lv_evals_2_0= ruleEVALUABLE ) ) ( (lv_evals_3_0= ruleEVALUABLE ) )* ) ;
    public final EObject ruleCONDITION() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_evals_2_0 = null;

        EObject lv_evals_3_0 = null;



        	enterRule();

        try {
            // InternalMkDsl.g:780:2: ( (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_INT ) ) ( (lv_evals_2_0= ruleEVALUABLE ) ) ( (lv_evals_3_0= ruleEVALUABLE ) )* ) )
            // InternalMkDsl.g:781:2: (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_INT ) ) ( (lv_evals_2_0= ruleEVALUABLE ) ) ( (lv_evals_3_0= ruleEVALUABLE ) )* )
            {
            // InternalMkDsl.g:781:2: (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_INT ) ) ( (lv_evals_2_0= ruleEVALUABLE ) ) ( (lv_evals_3_0= ruleEVALUABLE ) )* )
            // InternalMkDsl.g:782:3: otherlv_0= 'Condition' ( (lv_name_1_0= RULE_INT ) ) ( (lv_evals_2_0= ruleEVALUABLE ) ) ( (lv_evals_3_0= ruleEVALUABLE ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getCONDITIONAccess().getConditionKeyword_0());
            		
            // InternalMkDsl.g:786:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalMkDsl.g:787:4: (lv_name_1_0= RULE_INT )
            {
            // InternalMkDsl.g:787:4: (lv_name_1_0= RULE_INT )
            // InternalMkDsl.g:788:5: lv_name_1_0= RULE_INT
            {
            lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCONDITIONAccess().getNameINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCONDITIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMkDsl.g:804:3: ( (lv_evals_2_0= ruleEVALUABLE ) )
            // InternalMkDsl.g:805:4: (lv_evals_2_0= ruleEVALUABLE )
            {
            // InternalMkDsl.g:805:4: (lv_evals_2_0= ruleEVALUABLE )
            // InternalMkDsl.g:806:5: lv_evals_2_0= ruleEVALUABLE
            {

            					newCompositeNode(grammarAccess.getCONDITIONAccess().getEvalsEVALUABLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_evals_2_0=ruleEVALUABLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCONDITIONRule());
            					}
            					add(
            						current,
            						"evals",
            						lv_evals_2_0,
            						"com.mert.recherche.MkDsl.EVALUABLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMkDsl.g:823:3: ( (lv_evals_3_0= ruleEVALUABLE ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28||(LA13_0>=30 && LA13_0<=31)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMkDsl.g:824:4: (lv_evals_3_0= ruleEVALUABLE )
            	    {
            	    // InternalMkDsl.g:824:4: (lv_evals_3_0= ruleEVALUABLE )
            	    // InternalMkDsl.g:825:5: lv_evals_3_0= ruleEVALUABLE
            	    {

            	    					newCompositeNode(grammarAccess.getCONDITIONAccess().getEvalsEVALUABLEParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_evals_3_0=ruleEVALUABLE();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCONDITIONRule());
            	    					}
            	    					add(
            	    						current,
            	    						"evals",
            	    						lv_evals_3_0,
            	    						"com.mert.recherche.MkDsl.EVALUABLE");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCONDITION"


    // $ANTLR start "entryRuleRULE"
    // InternalMkDsl.g:846:1: entryRuleRULE returns [EObject current=null] : iv_ruleRULE= ruleRULE EOF ;
    public final EObject entryRuleRULE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRULE = null;


        try {
            // InternalMkDsl.g:846:45: (iv_ruleRULE= ruleRULE EOF )
            // InternalMkDsl.g:847:2: iv_ruleRULE= ruleRULE EOF
            {
             newCompositeNode(grammarAccess.getRULERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRULE=ruleRULE();

            state._fsp--;

             current =iv_ruleRULE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRULE"


    // $ANTLR start "ruleRULE"
    // InternalMkDsl.g:853:1: ruleRULE returns [EObject current=null] : (otherlv_0= 'Rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_INT ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= 'variables' ( (lv_vars_7_0= ruleVARIABLE ) ) (otherlv_8= ',' ( (lv_vars_9_0= ruleVARIABLE ) ) )* otherlv_10= 'actions' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* ) ;
    public final EObject ruleRULE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_ID_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_vars_7_0 = null;

        EObject lv_vars_9_0 = null;



        	enterRule();

        try {
            // InternalMkDsl.g:859:2: ( (otherlv_0= 'Rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_INT ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= 'variables' ( (lv_vars_7_0= ruleVARIABLE ) ) (otherlv_8= ',' ( (lv_vars_9_0= ruleVARIABLE ) ) )* otherlv_10= 'actions' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* ) )
            // InternalMkDsl.g:860:2: (otherlv_0= 'Rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_INT ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= 'variables' ( (lv_vars_7_0= ruleVARIABLE ) ) (otherlv_8= ',' ( (lv_vars_9_0= ruleVARIABLE ) ) )* otherlv_10= 'actions' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )
            {
            // InternalMkDsl.g:860:2: (otherlv_0= 'Rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_INT ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= 'variables' ( (lv_vars_7_0= ruleVARIABLE ) ) (otherlv_8= ',' ( (lv_vars_9_0= ruleVARIABLE ) ) )* otherlv_10= 'actions' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )
            // InternalMkDsl.g:861:3: otherlv_0= 'Rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_INT ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= 'variables' ( (lv_vars_7_0= ruleVARIABLE ) ) (otherlv_8= ',' ( (lv_vars_9_0= ruleVARIABLE ) ) )* otherlv_10= 'actions' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRULEAccess().getRuleKeyword_0());
            		
            // InternalMkDsl.g:865:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMkDsl.g:866:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMkDsl.g:866:4: (lv_name_1_0= RULE_STRING )
            // InternalMkDsl.g:867:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRULEAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRULERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRULEAccess().getIDKeyword_2());
            		
            // InternalMkDsl.g:887:3: ( (lv_ID_3_0= RULE_INT ) )
            // InternalMkDsl.g:888:4: (lv_ID_3_0= RULE_INT )
            {
            // InternalMkDsl.g:888:4: (lv_ID_3_0= RULE_INT )
            // InternalMkDsl.g:889:5: lv_ID_3_0= RULE_INT
            {
            lv_ID_3_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_ID_3_0, grammarAccess.getRULEAccess().getIDINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRULERule());
            					}
            					setWithLastConsumed(
            						current,
            						"ID",
            						lv_ID_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getRULEAccess().getValueKeyword_4());
            		
            // InternalMkDsl.g:909:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalMkDsl.g:910:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalMkDsl.g:910:4: (lv_value_5_0= RULE_STRING )
            // InternalMkDsl.g:911:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_value_5_0, grammarAccess.getRULEAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRULERule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getRULEAccess().getVariablesKeyword_6());
            		
            // InternalMkDsl.g:931:3: ( (lv_vars_7_0= ruleVARIABLE ) )
            // InternalMkDsl.g:932:4: (lv_vars_7_0= ruleVARIABLE )
            {
            // InternalMkDsl.g:932:4: (lv_vars_7_0= ruleVARIABLE )
            // InternalMkDsl.g:933:5: lv_vars_7_0= ruleVARIABLE
            {

            					newCompositeNode(grammarAccess.getRULEAccess().getVarsVARIABLEParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_24);
            lv_vars_7_0=ruleVARIABLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRULERule());
            					}
            					add(
            						current,
            						"vars",
            						lv_vars_7_0,
            						"com.mert.recherche.MkDsl.VARIABLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMkDsl.g:950:3: (otherlv_8= ',' ( (lv_vars_9_0= ruleVARIABLE ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMkDsl.g:951:4: otherlv_8= ',' ( (lv_vars_9_0= ruleVARIABLE ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_23); 

            	    				newLeafNode(otherlv_8, grammarAccess.getRULEAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMkDsl.g:955:4: ( (lv_vars_9_0= ruleVARIABLE ) )
            	    // InternalMkDsl.g:956:5: (lv_vars_9_0= ruleVARIABLE )
            	    {
            	    // InternalMkDsl.g:956:5: (lv_vars_9_0= ruleVARIABLE )
            	    // InternalMkDsl.g:957:6: lv_vars_9_0= ruleVARIABLE
            	    {

            	    						newCompositeNode(grammarAccess.getRULEAccess().getVarsVARIABLEParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_vars_9_0=ruleVARIABLE();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRULERule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_9_0,
            	    							"com.mert.recherche.MkDsl.VARIABLE");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_10=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_10, grammarAccess.getRULEAccess().getActionsKeyword_9());
            		
            // InternalMkDsl.g:979:3: ( (otherlv_11= RULE_ID ) )
            // InternalMkDsl.g:980:4: (otherlv_11= RULE_ID )
            {
            // InternalMkDsl.g:980:4: (otherlv_11= RULE_ID )
            // InternalMkDsl.g:981:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRULERule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_11, grammarAccess.getRULEAccess().getActionsACTIONCrossReference_10_0());
            				

            }


            }

            // InternalMkDsl.g:992:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_ID) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalMkDsl.g:993:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,13,FOLLOW_25); 

            	    				newLeafNode(otherlv_12, grammarAccess.getRULEAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalMkDsl.g:997:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalMkDsl.g:998:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMkDsl.g:998:5: (otherlv_13= RULE_ID )
            	    // InternalMkDsl.g:999:6: otherlv_13= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRULERule());
            	    						}
            	    					
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(otherlv_13, grammarAccess.getRULEAccess().getActionsACTIONCrossReference_11_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRULE"


    // $ANTLR start "entryRuleACTION"
    // InternalMkDsl.g:1015:1: entryRuleACTION returns [EObject current=null] : iv_ruleACTION= ruleACTION EOF ;
    public final EObject entryRuleACTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACTION = null;


        try {
            // InternalMkDsl.g:1015:47: (iv_ruleACTION= ruleACTION EOF )
            // InternalMkDsl.g:1016:2: iv_ruleACTION= ruleACTION EOF
            {
             newCompositeNode(grammarAccess.getACTIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleACTION=ruleACTION();

            state._fsp--;

             current =iv_ruleACTION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACTION"


    // $ANTLR start "ruleACTION"
    // InternalMkDsl.g:1022:1: ruleACTION returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_STRING ) ) otherlv_4= 'event' ( (lv_event_5_0= RULE_INT ) ) ) ;
    public final EObject ruleACTION() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_ID_3_0=null;
        Token otherlv_4=null;
        Token lv_event_5_0=null;


        	enterRule();

        try {
            // InternalMkDsl.g:1028:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_STRING ) ) otherlv_4= 'event' ( (lv_event_5_0= RULE_INT ) ) ) )
            // InternalMkDsl.g:1029:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_STRING ) ) otherlv_4= 'event' ( (lv_event_5_0= RULE_INT ) ) )
            {
            // InternalMkDsl.g:1029:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_STRING ) ) otherlv_4= 'event' ( (lv_event_5_0= RULE_INT ) ) )
            // InternalMkDsl.g:1030:3: otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ID' ( (lv_ID_3_0= RULE_STRING ) ) otherlv_4= 'event' ( (lv_event_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getACTIONAccess().getActionKeyword_0());
            		
            // InternalMkDsl.g:1034:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMkDsl.g:1035:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMkDsl.g:1035:4: (lv_name_1_0= RULE_ID )
            // InternalMkDsl.g:1036:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getACTIONAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getACTIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getACTIONAccess().getIDKeyword_2());
            		
            // InternalMkDsl.g:1056:3: ( (lv_ID_3_0= RULE_STRING ) )
            // InternalMkDsl.g:1057:4: (lv_ID_3_0= RULE_STRING )
            {
            // InternalMkDsl.g:1057:4: (lv_ID_3_0= RULE_STRING )
            // InternalMkDsl.g:1058:5: lv_ID_3_0= RULE_STRING
            {
            lv_ID_3_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_ID_3_0, grammarAccess.getACTIONAccess().getIDSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getACTIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ID",
            						lv_ID_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getACTIONAccess().getEventKeyword_4());
            		
            // InternalMkDsl.g:1078:3: ( (lv_event_5_0= RULE_INT ) )
            // InternalMkDsl.g:1079:4: (lv_event_5_0= RULE_INT )
            {
            // InternalMkDsl.g:1079:4: (lv_event_5_0= RULE_INT )
            // InternalMkDsl.g:1080:5: lv_event_5_0= RULE_INT
            {
            lv_event_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_event_5_0, grammarAccess.getACTIONAccess().getEventINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getACTIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"event",
            						lv_event_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACTION"


    // $ANTLR start "entryRuleEVALUABLE"
    // InternalMkDsl.g:1100:1: entryRuleEVALUABLE returns [EObject current=null] : iv_ruleEVALUABLE= ruleEVALUABLE EOF ;
    public final EObject entryRuleEVALUABLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVALUABLE = null;


        try {
            // InternalMkDsl.g:1100:50: (iv_ruleEVALUABLE= ruleEVALUABLE EOF )
            // InternalMkDsl.g:1101:2: iv_ruleEVALUABLE= ruleEVALUABLE EOF
            {
             newCompositeNode(grammarAccess.getEVALUABLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVALUABLE=ruleEVALUABLE();

            state._fsp--;

             current =iv_ruleEVALUABLE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEVALUABLE"


    // $ANTLR start "ruleEVALUABLE"
    // InternalMkDsl.g:1107:1: ruleEVALUABLE returns [EObject current=null] : (this_EXPRESSION_0= ruleEXPRESSION | this_CONNECTIVE_1= ruleCONNECTIVE ) ;
    public final EObject ruleEVALUABLE() throws RecognitionException {
        EObject current = null;

        EObject this_EXPRESSION_0 = null;

        EObject this_CONNECTIVE_1 = null;



        	enterRule();

        try {
            // InternalMkDsl.g:1113:2: ( (this_EXPRESSION_0= ruleEXPRESSION | this_CONNECTIVE_1= ruleCONNECTIVE ) )
            // InternalMkDsl.g:1114:2: (this_EXPRESSION_0= ruleEXPRESSION | this_CONNECTIVE_1= ruleCONNECTIVE )
            {
            // InternalMkDsl.g:1114:2: (this_EXPRESSION_0= ruleEXPRESSION | this_CONNECTIVE_1= ruleCONNECTIVE )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=30 && LA16_0<=31)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMkDsl.g:1115:3: this_EXPRESSION_0= ruleEXPRESSION
                    {

                    			newCompositeNode(grammarAccess.getEVALUABLEAccess().getEXPRESSIONParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EXPRESSION_0=ruleEXPRESSION();

                    state._fsp--;


                    			current = this_EXPRESSION_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:1124:3: this_CONNECTIVE_1= ruleCONNECTIVE
                    {

                    			newCompositeNode(grammarAccess.getEVALUABLEAccess().getCONNECTIVEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CONNECTIVE_1=ruleCONNECTIVE();

                    state._fsp--;


                    			current = this_CONNECTIVE_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEVALUABLE"


    // $ANTLR start "entryRuleEXPRESSION"
    // InternalMkDsl.g:1136:1: entryRuleEXPRESSION returns [EObject current=null] : iv_ruleEXPRESSION= ruleEXPRESSION EOF ;
    public final EObject entryRuleEXPRESSION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXPRESSION = null;


        try {
            // InternalMkDsl.g:1136:51: (iv_ruleEXPRESSION= ruleEXPRESSION EOF )
            // InternalMkDsl.g:1137:2: iv_ruleEXPRESSION= ruleEXPRESSION EOF
            {
             newCompositeNode(grammarAccess.getEXPRESSIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEXPRESSION=ruleEXPRESSION();

            state._fsp--;

             current =iv_ruleEXPRESSION; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXPRESSION"


    // $ANTLR start "ruleEXPRESSION"
    // InternalMkDsl.g:1143:1: ruleEXPRESSION returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleLITERAL ) ) ( (lv_operand_2_0= ruleOPERAND ) )? ( (lv_right_3_0= ruleLITERAL ) )? otherlv_4= ')' ) ;
    public final EObject ruleEXPRESSION() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_left_1_0 = null;

        EObject lv_operand_2_0 = null;

        AntlrDatatypeRuleToken lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMkDsl.g:1149:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleLITERAL ) ) ( (lv_operand_2_0= ruleOPERAND ) )? ( (lv_right_3_0= ruleLITERAL ) )? otherlv_4= ')' ) )
            // InternalMkDsl.g:1150:2: (otherlv_0= '(' ( (lv_left_1_0= ruleLITERAL ) ) ( (lv_operand_2_0= ruleOPERAND ) )? ( (lv_right_3_0= ruleLITERAL ) )? otherlv_4= ')' )
            {
            // InternalMkDsl.g:1150:2: (otherlv_0= '(' ( (lv_left_1_0= ruleLITERAL ) ) ( (lv_operand_2_0= ruleOPERAND ) )? ( (lv_right_3_0= ruleLITERAL ) )? otherlv_4= ')' )
            // InternalMkDsl.g:1151:3: otherlv_0= '(' ( (lv_left_1_0= ruleLITERAL ) ) ( (lv_operand_2_0= ruleOPERAND ) )? ( (lv_right_3_0= ruleLITERAL ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getEXPRESSIONAccess().getLeftParenthesSKeyword_0());
            		
            // InternalMkDsl.g:1155:3: ( (lv_left_1_0= ruleLITERAL ) )
            // InternalMkDsl.g:1156:4: (lv_left_1_0= ruleLITERAL )
            {
            // InternalMkDsl.g:1156:4: (lv_left_1_0= ruleLITERAL )
            // InternalMkDsl.g:1157:5: lv_left_1_0= ruleLITERAL
            {

            					newCompositeNode(grammarAccess.getEXPRESSIONAccess().getLeftLITERALParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_left_1_0=ruleLITERAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEXPRESSIONRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"com.mert.recherche.MkDsl.LITERAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMkDsl.g:1174:3: ( (lv_operand_2_0= ruleOPERAND ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=33 && LA17_0<=37)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMkDsl.g:1175:4: (lv_operand_2_0= ruleOPERAND )
                    {
                    // InternalMkDsl.g:1175:4: (lv_operand_2_0= ruleOPERAND )
                    // InternalMkDsl.g:1176:5: lv_operand_2_0= ruleOPERAND
                    {

                    					newCompositeNode(grammarAccess.getEXPRESSIONAccess().getOperandOPERANDParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_operand_2_0=ruleOPERAND();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEXPRESSIONRule());
                    					}
                    					set(
                    						current,
                    						"operand",
                    						lv_operand_2_0,
                    						"com.mert.recherche.MkDsl.OPERAND");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMkDsl.g:1193:3: ( (lv_right_3_0= ruleLITERAL ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_INT)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMkDsl.g:1194:4: (lv_right_3_0= ruleLITERAL )
                    {
                    // InternalMkDsl.g:1194:4: (lv_right_3_0= ruleLITERAL )
                    // InternalMkDsl.g:1195:5: lv_right_3_0= ruleLITERAL
                    {

                    					newCompositeNode(grammarAccess.getEXPRESSIONAccess().getRightLITERALParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_right_3_0=ruleLITERAL();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEXPRESSIONRule());
                    					}
                    					set(
                    						current,
                    						"right",
                    						lv_right_3_0,
                    						"com.mert.recherche.MkDsl.LITERAL");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEXPRESSIONAccess().getRGhtParenthesSKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXPRESSION"


    // $ANTLR start "entryRuleCONNECTIVE"
    // InternalMkDsl.g:1220:1: entryRuleCONNECTIVE returns [EObject current=null] : iv_ruleCONNECTIVE= ruleCONNECTIVE EOF ;
    public final EObject entryRuleCONNECTIVE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCONNECTIVE = null;


        try {
            // InternalMkDsl.g:1220:51: (iv_ruleCONNECTIVE= ruleCONNECTIVE EOF )
            // InternalMkDsl.g:1221:2: iv_ruleCONNECTIVE= ruleCONNECTIVE EOF
            {
             newCompositeNode(grammarAccess.getCONNECTIVERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCONNECTIVE=ruleCONNECTIVE();

            state._fsp--;

             current =iv_ruleCONNECTIVE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCONNECTIVE"


    // $ANTLR start "ruleCONNECTIVE"
    // InternalMkDsl.g:1227:1: ruleCONNECTIVE returns [EObject current=null] : ( ( (lv_connective_0_1= 'AND' | lv_connective_0_2= 'OR' ) ) ) ;
    public final EObject ruleCONNECTIVE() throws RecognitionException {
        EObject current = null;

        Token lv_connective_0_1=null;
        Token lv_connective_0_2=null;


        	enterRule();

        try {
            // InternalMkDsl.g:1233:2: ( ( ( (lv_connective_0_1= 'AND' | lv_connective_0_2= 'OR' ) ) ) )
            // InternalMkDsl.g:1234:2: ( ( (lv_connective_0_1= 'AND' | lv_connective_0_2= 'OR' ) ) )
            {
            // InternalMkDsl.g:1234:2: ( ( (lv_connective_0_1= 'AND' | lv_connective_0_2= 'OR' ) ) )
            // InternalMkDsl.g:1235:3: ( (lv_connective_0_1= 'AND' | lv_connective_0_2= 'OR' ) )
            {
            // InternalMkDsl.g:1235:3: ( (lv_connective_0_1= 'AND' | lv_connective_0_2= 'OR' ) )
            // InternalMkDsl.g:1236:4: (lv_connective_0_1= 'AND' | lv_connective_0_2= 'OR' )
            {
            // InternalMkDsl.g:1236:4: (lv_connective_0_1= 'AND' | lv_connective_0_2= 'OR' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMkDsl.g:1237:5: lv_connective_0_1= 'AND'
                    {
                    lv_connective_0_1=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_connective_0_1, grammarAccess.getCONNECTIVEAccess().getConnectiveANDKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCONNECTIVERule());
                    					}
                    					setWithLastConsumed(current, "connective", lv_connective_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:1248:5: lv_connective_0_2= 'OR'
                    {
                    lv_connective_0_2=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_connective_0_2, grammarAccess.getCONNECTIVEAccess().getConnectiveORKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCONNECTIVERule());
                    					}
                    					setWithLastConsumed(current, "connective", lv_connective_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCONNECTIVE"


    // $ANTLR start "entryRuleVARIABLE"
    // InternalMkDsl.g:1264:1: entryRuleVARIABLE returns [EObject current=null] : iv_ruleVARIABLE= ruleVARIABLE EOF ;
    public final EObject entryRuleVARIABLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVARIABLE = null;


        try {
            // InternalMkDsl.g:1264:49: (iv_ruleVARIABLE= ruleVARIABLE EOF )
            // InternalMkDsl.g:1265:2: iv_ruleVARIABLE= ruleVARIABLE EOF
            {
             newCompositeNode(grammarAccess.getVARIABLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVARIABLE=ruleVARIABLE();

            state._fsp--;

             current =iv_ruleVARIABLE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVARIABLE"


    // $ANTLR start "ruleVARIABLE"
    // InternalMkDsl.g:1271:1: ruleVARIABLE returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'value' ( (lv_value_3_0= ruleLITERAL ) ) ) ;
    public final EObject ruleVARIABLE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMkDsl.g:1277:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'value' ( (lv_value_3_0= ruleLITERAL ) ) ) )
            // InternalMkDsl.g:1278:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'value' ( (lv_value_3_0= ruleLITERAL ) ) )
            {
            // InternalMkDsl.g:1278:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'value' ( (lv_value_3_0= ruleLITERAL ) ) )
            // InternalMkDsl.g:1279:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'value' ( (lv_value_3_0= ruleLITERAL ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVARIABLEAccess().getVarKeyword_0());
            		
            // InternalMkDsl.g:1283:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMkDsl.g:1284:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMkDsl.g:1284:4: (lv_name_1_0= RULE_STRING )
            // InternalMkDsl.g:1285:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVARIABLEAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVARIABLERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getVARIABLEAccess().getValueKeyword_2());
            		
            // InternalMkDsl.g:1305:3: ( (lv_value_3_0= ruleLITERAL ) )
            // InternalMkDsl.g:1306:4: (lv_value_3_0= ruleLITERAL )
            {
            // InternalMkDsl.g:1306:4: (lv_value_3_0= ruleLITERAL )
            // InternalMkDsl.g:1307:5: lv_value_3_0= ruleLITERAL
            {

            					newCompositeNode(grammarAccess.getVARIABLEAccess().getValueLITERALParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleLITERAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVARIABLERule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"com.mert.recherche.MkDsl.LITERAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVARIABLE"


    // $ANTLR start "entryRuleOPERAND"
    // InternalMkDsl.g:1328:1: entryRuleOPERAND returns [EObject current=null] : iv_ruleOPERAND= ruleOPERAND EOF ;
    public final EObject entryRuleOPERAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOPERAND = null;


        try {
            // InternalMkDsl.g:1328:48: (iv_ruleOPERAND= ruleOPERAND EOF )
            // InternalMkDsl.g:1329:2: iv_ruleOPERAND= ruleOPERAND EOF
            {
             newCompositeNode(grammarAccess.getOPERANDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOPERAND=ruleOPERAND();

            state._fsp--;

             current =iv_ruleOPERAND; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOPERAND"


    // $ANTLR start "ruleOPERAND"
    // InternalMkDsl.g:1335:1: ruleOPERAND returns [EObject current=null] : ( ( (lv_operand_0_1= '<' | lv_operand_0_2= '<=' | lv_operand_0_3= '==' | lv_operand_0_4= '>=' | lv_operand_0_5= '>' ) ) ) ;
    public final EObject ruleOPERAND() throws RecognitionException {
        EObject current = null;

        Token lv_operand_0_1=null;
        Token lv_operand_0_2=null;
        Token lv_operand_0_3=null;
        Token lv_operand_0_4=null;
        Token lv_operand_0_5=null;


        	enterRule();

        try {
            // InternalMkDsl.g:1341:2: ( ( ( (lv_operand_0_1= '<' | lv_operand_0_2= '<=' | lv_operand_0_3= '==' | lv_operand_0_4= '>=' | lv_operand_0_5= '>' ) ) ) )
            // InternalMkDsl.g:1342:2: ( ( (lv_operand_0_1= '<' | lv_operand_0_2= '<=' | lv_operand_0_3= '==' | lv_operand_0_4= '>=' | lv_operand_0_5= '>' ) ) )
            {
            // InternalMkDsl.g:1342:2: ( ( (lv_operand_0_1= '<' | lv_operand_0_2= '<=' | lv_operand_0_3= '==' | lv_operand_0_4= '>=' | lv_operand_0_5= '>' ) ) )
            // InternalMkDsl.g:1343:3: ( (lv_operand_0_1= '<' | lv_operand_0_2= '<=' | lv_operand_0_3= '==' | lv_operand_0_4= '>=' | lv_operand_0_5= '>' ) )
            {
            // InternalMkDsl.g:1343:3: ( (lv_operand_0_1= '<' | lv_operand_0_2= '<=' | lv_operand_0_3= '==' | lv_operand_0_4= '>=' | lv_operand_0_5= '>' ) )
            // InternalMkDsl.g:1344:4: (lv_operand_0_1= '<' | lv_operand_0_2= '<=' | lv_operand_0_3= '==' | lv_operand_0_4= '>=' | lv_operand_0_5= '>' )
            {
            // InternalMkDsl.g:1344:4: (lv_operand_0_1= '<' | lv_operand_0_2= '<=' | lv_operand_0_3= '==' | lv_operand_0_4= '>=' | lv_operand_0_5= '>' )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt20=1;
                }
                break;
            case 34:
                {
                alt20=2;
                }
                break;
            case 35:
                {
                alt20=3;
                }
                break;
            case 36:
                {
                alt20=4;
                }
                break;
            case 37:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMkDsl.g:1345:5: lv_operand_0_1= '<'
                    {
                    lv_operand_0_1=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_operand_0_1, grammarAccess.getOPERANDAccess().getOperandLessThanSGnKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOPERANDRule());
                    					}
                    					setWithLastConsumed(current, "operand", lv_operand_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:1356:5: lv_operand_0_2= '<='
                    {
                    lv_operand_0_2=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_operand_0_2, grammarAccess.getOPERANDAccess().getOperandLessThanSGnEqualsSGnKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOPERANDRule());
                    					}
                    					setWithLastConsumed(current, "operand", lv_operand_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMkDsl.g:1367:5: lv_operand_0_3= '=='
                    {
                    lv_operand_0_3=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_operand_0_3, grammarAccess.getOPERANDAccess().getOperandEqualsSGnEqualsSGnKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOPERANDRule());
                    					}
                    					setWithLastConsumed(current, "operand", lv_operand_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMkDsl.g:1378:5: lv_operand_0_4= '>='
                    {
                    lv_operand_0_4=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_operand_0_4, grammarAccess.getOPERANDAccess().getOperandGreaterThanSGnEqualsSGnKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOPERANDRule());
                    					}
                    					setWithLastConsumed(current, "operand", lv_operand_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMkDsl.g:1389:5: lv_operand_0_5= '>'
                    {
                    lv_operand_0_5=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_operand_0_5, grammarAccess.getOPERANDAccess().getOperandGreaterThanSGnKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOPERANDRule());
                    					}
                    					setWithLastConsumed(current, "operand", lv_operand_0_5, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOPERAND"


    // $ANTLR start "entryRuleLITERAL"
    // InternalMkDsl.g:1405:1: entryRuleLITERAL returns [String current=null] : iv_ruleLITERAL= ruleLITERAL EOF ;
    public final String entryRuleLITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLITERAL = null;


        try {
            // InternalMkDsl.g:1405:47: (iv_ruleLITERAL= ruleLITERAL EOF )
            // InternalMkDsl.g:1406:2: iv_ruleLITERAL= ruleLITERAL EOF
            {
             newCompositeNode(grammarAccess.getLITERALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLITERAL=ruleLITERAL();

            state._fsp--;

             current =iv_ruleLITERAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLITERAL"


    // $ANTLR start "ruleLITERAL"
    // InternalMkDsl.g:1412:1: ruleLITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalMkDsl.g:1418:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalMkDsl.g:1419:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalMkDsl.g:1419:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMkDsl.g:1420:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getLITERALAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:1428:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getLITERALAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLITERAL"


    // $ANTLR start "entryRuleCOLOR"
    // InternalMkDsl.g:1439:1: entryRuleCOLOR returns [EObject current=null] : iv_ruleCOLOR= ruleCOLOR EOF ;
    public final EObject entryRuleCOLOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOLOR = null;


        try {
            // InternalMkDsl.g:1439:46: (iv_ruleCOLOR= ruleCOLOR EOF )
            // InternalMkDsl.g:1440:2: iv_ruleCOLOR= ruleCOLOR EOF
            {
             newCompositeNode(grammarAccess.getCOLORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOLOR=ruleCOLOR();

            state._fsp--;

             current =iv_ruleCOLOR; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOLOR"


    // $ANTLR start "ruleCOLOR"
    // InternalMkDsl.g:1446:1: ruleCOLOR returns [EObject current=null] : ( ( (lv_name_0_1= 'black' | lv_name_0_2= 'red' | lv_name_0_3= 'green' | lv_name_0_4= 'blue' | lv_name_0_5= 'orange' ) ) ) ;
    public final EObject ruleCOLOR() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;


        	enterRule();

        try {
            // InternalMkDsl.g:1452:2: ( ( ( (lv_name_0_1= 'black' | lv_name_0_2= 'red' | lv_name_0_3= 'green' | lv_name_0_4= 'blue' | lv_name_0_5= 'orange' ) ) ) )
            // InternalMkDsl.g:1453:2: ( ( (lv_name_0_1= 'black' | lv_name_0_2= 'red' | lv_name_0_3= 'green' | lv_name_0_4= 'blue' | lv_name_0_5= 'orange' ) ) )
            {
            // InternalMkDsl.g:1453:2: ( ( (lv_name_0_1= 'black' | lv_name_0_2= 'red' | lv_name_0_3= 'green' | lv_name_0_4= 'blue' | lv_name_0_5= 'orange' ) ) )
            // InternalMkDsl.g:1454:3: ( (lv_name_0_1= 'black' | lv_name_0_2= 'red' | lv_name_0_3= 'green' | lv_name_0_4= 'blue' | lv_name_0_5= 'orange' ) )
            {
            // InternalMkDsl.g:1454:3: ( (lv_name_0_1= 'black' | lv_name_0_2= 'red' | lv_name_0_3= 'green' | lv_name_0_4= 'blue' | lv_name_0_5= 'orange' ) )
            // InternalMkDsl.g:1455:4: (lv_name_0_1= 'black' | lv_name_0_2= 'red' | lv_name_0_3= 'green' | lv_name_0_4= 'blue' | lv_name_0_5= 'orange' )
            {
            // InternalMkDsl.g:1455:4: (lv_name_0_1= 'black' | lv_name_0_2= 'red' | lv_name_0_3= 'green' | lv_name_0_4= 'blue' | lv_name_0_5= 'orange' )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt22=1;
                }
                break;
            case 39:
                {
                alt22=2;
                }
                break;
            case 40:
                {
                alt22=3;
                }
                break;
            case 41:
                {
                alt22=4;
                }
                break;
            case 42:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMkDsl.g:1456:5: lv_name_0_1= 'black'
                    {
                    lv_name_0_1=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getCOLORAccess().getNameBlackKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCOLORRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMkDsl.g:1467:5: lv_name_0_2= 'red'
                    {
                    lv_name_0_2=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getCOLORAccess().getNameRedKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCOLORRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMkDsl.g:1478:5: lv_name_0_3= 'green'
                    {
                    lv_name_0_3=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getCOLORAccess().getNameGreenKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCOLORRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMkDsl.g:1489:5: lv_name_0_4= 'blue'
                    {
                    lv_name_0_4=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getCOLORAccess().getNameBlueKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCOLORRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMkDsl.g:1500:5: lv_name_0_5= 'orange'
                    {
                    lv_name_0_5=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_name_0_5, grammarAccess.getCOLORAccess().getNameOrangeKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCOLORRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_5, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOLOR"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000027800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000007C000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000D0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000D0000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003E20000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});

}