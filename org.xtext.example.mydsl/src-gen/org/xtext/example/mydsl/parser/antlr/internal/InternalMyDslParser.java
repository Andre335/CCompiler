package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'+'", "'-'", "'*'", "'/'", "'[]'", "'int'", "'string'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleprimary_expression ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_greetings_0_0= ruleprimary_expression ) )* )
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleprimary_expression ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleprimary_expression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleprimary_expression )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleprimary_expression )
            	    // InternalMyDsl.g:80:4: lv_greetings_0_0= ruleprimary_expression
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getGreetingsPrimary_expressionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleprimary_expression();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"greetings",
            	    					lv_greetings_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.primary_expression");
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


    // $ANTLR start "entryRuleprimary_expression"
    // InternalMyDsl.g:100:1: entryRuleprimary_expression returns [EObject current=null] : iv_ruleprimary_expression= ruleprimary_expression EOF ;
    public final EObject entryRuleprimary_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimary_expression = null;


        try {
            // InternalMyDsl.g:100:59: (iv_ruleprimary_expression= ruleprimary_expression EOF )
            // InternalMyDsl.g:101:2: iv_ruleprimary_expression= ruleprimary_expression EOF
            {
             newCompositeNode(grammarAccess.getPrimary_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprimary_expression=ruleprimary_expression();

            state._fsp--;

             current =iv_ruleprimary_expression; 
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
    // $ANTLR end "entryRuleprimary_expression"


    // $ANTLR start "ruleprimary_expression"
    // InternalMyDsl.g:107:1: ruleprimary_expression returns [EObject current=null] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_DECLARATION_2= ruleDECLARATION | this_ValAssignment_3= ruleValAssignment | ruleexpression ) ;
    public final EObject ruleprimary_expression() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token this_STRING_1=null;
        EObject this_DECLARATION_2 = null;

        EObject this_ValAssignment_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_DECLARATION_2= ruleDECLARATION | this_ValAssignment_3= ruleValAssignment | ruleexpression ) )
            // InternalMyDsl.g:114:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_DECLARATION_2= ruleDECLARATION | this_ValAssignment_3= ruleValAssignment | ruleexpression )
            {
            // InternalMyDsl.g:114:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_DECLARATION_2= ruleDECLARATION | this_ValAssignment_3= ruleValAssignment | ruleexpression )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_INT)||(LA2_1>=17 && LA2_1<=18)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==11) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt2=2;
                }
                break;
            case 17:
            case 18:
                {
                alt2=3;
                }
                break;
            case RULE_INT:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(this_ID_0, grammarAccess.getPrimary_expressionAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:120:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_1, grammarAccess.getPrimary_expressionAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:125:3: this_DECLARATION_2= ruleDECLARATION
                    {

                    			newCompositeNode(grammarAccess.getPrimary_expressionAccess().getDECLARATIONParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DECLARATION_2=ruleDECLARATION();

                    state._fsp--;


                    			current = this_DECLARATION_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:134:3: this_ValAssignment_3= ruleValAssignment
                    {

                    			newCompositeNode(grammarAccess.getPrimary_expressionAccess().getValAssignmentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValAssignment_3=ruleValAssignment();

                    state._fsp--;


                    			current = this_ValAssignment_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:143:3: ruleexpression
                    {

                    			newCompositeNode(grammarAccess.getPrimary_expressionAccess().getExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    ruleexpression();

                    state._fsp--;


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
    // $ANTLR end "ruleprimary_expression"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalMyDsl.g:154:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalMyDsl.g:154:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalMyDsl.g:155:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalMyDsl.g:161:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:167:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:168:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:168:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyDsl.g:169:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMyDsl.g:169:3: (lv_value_0_0= RULE_INT )
            // InternalMyDsl.g:170:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl.MyDsl.INT");
            			

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMyDsl.g:189:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMyDsl.g:189:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMyDsl.g:190:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMyDsl.g:196:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:202:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:203:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:203:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:204:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:204:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:205:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl.MyDsl.STRING");
            			

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleLITERAL"
    // InternalMyDsl.g:224:1: entryRuleLITERAL returns [EObject current=null] : iv_ruleLITERAL= ruleLITERAL EOF ;
    public final EObject entryRuleLITERAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLITERAL = null;


        try {
            // InternalMyDsl.g:224:48: (iv_ruleLITERAL= ruleLITERAL EOF )
            // InternalMyDsl.g:225:2: iv_ruleLITERAL= ruleLITERAL EOF
            {
             newCompositeNode(grammarAccess.getLITERALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLITERAL=ruleLITERAL();

            state._fsp--;

             current =iv_ruleLITERAL; 
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
    // InternalMyDsl.g:231:1: ruleLITERAL returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral ) ;
    public final EObject ruleLITERAL() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:237:2: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral ) )
            // InternalMyDsl.g:238:2: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral )
            {
            // InternalMyDsl.g:238:2: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:239:3: this_StringLiteral_0= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLITERALAccess().getStringLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:248:3: this_IntLiteral_1= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getLITERALAccess().getIntLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_1;
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
    // $ANTLR end "ruleLITERAL"


    // $ANTLR start "entryRuleValAssignment"
    // InternalMyDsl.g:260:1: entryRuleValAssignment returns [EObject current=null] : iv_ruleValAssignment= ruleValAssignment EOF ;
    public final EObject entryRuleValAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValAssignment = null;


        try {
            // InternalMyDsl.g:260:54: (iv_ruleValAssignment= ruleValAssignment EOF )
            // InternalMyDsl.g:261:2: iv_ruleValAssignment= ruleValAssignment EOF
            {
             newCompositeNode(grammarAccess.getValAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValAssignment=ruleValAssignment();

            state._fsp--;

             current =iv_ruleValAssignment; 
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
    // $ANTLR end "entryRuleValAssignment"


    // $ANTLR start "ruleValAssignment"
    // InternalMyDsl.g:267:1: ruleValAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLITERAL ) ) ) ;
    public final EObject ruleValAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:273:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLITERAL ) ) ) )
            // InternalMyDsl.g:274:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLITERAL ) ) )
            {
            // InternalMyDsl.g:274:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLITERAL ) ) )
            // InternalMyDsl.g:275:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLITERAL ) )
            {
            // InternalMyDsl.g:275:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:276:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:276:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:277:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getValAssignmentAccess().getDeclarationDECLARATIONCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getValAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:292:3: ( (lv_value_2_0= ruleLITERAL ) )
            // InternalMyDsl.g:293:4: (lv_value_2_0= ruleLITERAL )
            {
            // InternalMyDsl.g:293:4: (lv_value_2_0= ruleLITERAL )
            // InternalMyDsl.g:294:5: lv_value_2_0= ruleLITERAL
            {

            					newCompositeNode(grammarAccess.getValAssignmentAccess().getValueLITERALParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleLITERAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.mydsl.MyDsl.LITERAL");
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
    // $ANTLR end "ruleValAssignment"


    // $ANTLR start "entryRuleexpression"
    // InternalMyDsl.g:315:1: entryRuleexpression returns [String current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final String entryRuleexpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression = null;


        try {
            // InternalMyDsl.g:315:50: (iv_ruleexpression= ruleexpression EOF )
            // InternalMyDsl.g:316:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression.getText(); 
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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalMyDsl.g:322:1: ruleexpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_LiteralExpression_0= ruleLiteralExpression ;
    public final AntlrDatatypeRuleToken ruleexpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:328:2: (this_LiteralExpression_0= ruleLiteralExpression )
            // InternalMyDsl.g:329:2: this_LiteralExpression_0= ruleLiteralExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_LiteralExpression_0=ruleLiteralExpression();

            state._fsp--;


            		current.merge(this_LiteralExpression_0);
            	

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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalMyDsl.g:342:1: entryRuleLiteralExpression returns [String current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final String entryRuleLiteralExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralExpression = null;


        try {
            // InternalMyDsl.g:342:57: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalMyDsl.g:343:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression.getText(); 
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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalMyDsl.g:349:1: ruleLiteralExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IntLiteralExpression_0= ruleIntLiteralExpression ;
    public final AntlrDatatypeRuleToken ruleLiteralExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:355:2: (this_IntLiteralExpression_0= ruleIntLiteralExpression )
            // InternalMyDsl.g:356:2: this_IntLiteralExpression_0= ruleIntLiteralExpression
            {

            		newCompositeNode(grammarAccess.getLiteralExpressionAccess().getIntLiteralExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_IntLiteralExpression_0=ruleIntLiteralExpression();

            state._fsp--;


            		current.merge(this_IntLiteralExpression_0);
            	

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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleIntLiteralExpression"
    // InternalMyDsl.g:369:1: entryRuleIntLiteralExpression returns [String current=null] : iv_ruleIntLiteralExpression= ruleIntLiteralExpression EOF ;
    public final String entryRuleIntLiteralExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntLiteralExpression = null;


        try {
            // InternalMyDsl.g:369:60: (iv_ruleIntLiteralExpression= ruleIntLiteralExpression EOF )
            // InternalMyDsl.g:370:2: iv_ruleIntLiteralExpression= ruleIntLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteralExpression=ruleIntLiteralExpression();

            state._fsp--;

             current =iv_ruleIntLiteralExpression.getText(); 
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
    // $ANTLR end "entryRuleIntLiteralExpression"


    // $ANTLR start "ruleIntLiteralExpression"
    // InternalMyDsl.g:376:1: ruleIntLiteralExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (this_OP_ARITMETICO_1= ruleOP_ARITMETICO this_INT_2= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleIntLiteralExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_OP_ARITMETICO_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:382:2: ( (this_INT_0= RULE_INT (this_OP_ARITMETICO_1= ruleOP_ARITMETICO this_INT_2= RULE_INT )* ) )
            // InternalMyDsl.g:383:2: (this_INT_0= RULE_INT (this_OP_ARITMETICO_1= ruleOP_ARITMETICO this_INT_2= RULE_INT )* )
            {
            // InternalMyDsl.g:383:2: (this_INT_0= RULE_INT (this_OP_ARITMETICO_1= ruleOP_ARITMETICO this_INT_2= RULE_INT )* )
            // InternalMyDsl.g:384:3: this_INT_0= RULE_INT (this_OP_ARITMETICO_1= ruleOP_ARITMETICO this_INT_2= RULE_INT )*
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getIntLiteralExpressionAccess().getINTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:391:3: (this_OP_ARITMETICO_1= ruleOP_ARITMETICO this_INT_2= RULE_INT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:392:4: this_OP_ARITMETICO_1= ruleOP_ARITMETICO this_INT_2= RULE_INT
            	    {

            	    				newCompositeNode(grammarAccess.getIntLiteralExpressionAccess().getOP_ARITMETICOParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_7);
            	    this_OP_ARITMETICO_1=ruleOP_ARITMETICO();

            	    state._fsp--;


            	    				current.merge(this_OP_ARITMETICO_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_6); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getIntLiteralExpressionAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleIntLiteralExpression"


    // $ANTLR start "entryRuleOP_ARITMETICO"
    // InternalMyDsl.g:414:1: entryRuleOP_ARITMETICO returns [String current=null] : iv_ruleOP_ARITMETICO= ruleOP_ARITMETICO EOF ;
    public final String entryRuleOP_ARITMETICO() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOP_ARITMETICO = null;


        try {
            // InternalMyDsl.g:414:53: (iv_ruleOP_ARITMETICO= ruleOP_ARITMETICO EOF )
            // InternalMyDsl.g:415:2: iv_ruleOP_ARITMETICO= ruleOP_ARITMETICO EOF
            {
             newCompositeNode(grammarAccess.getOP_ARITMETICORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOP_ARITMETICO=ruleOP_ARITMETICO();

            state._fsp--;

             current =iv_ruleOP_ARITMETICO.getText(); 
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
    // $ANTLR end "entryRuleOP_ARITMETICO"


    // $ANTLR start "ruleOP_ARITMETICO"
    // InternalMyDsl.g:421:1: ruleOP_ARITMETICO returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOP_ARITMETICO() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:427:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalMyDsl.g:428:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalMyDsl.g:428:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:429:3: kw= '+'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_ARITMETICOAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:435:3: kw= '-'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_ARITMETICOAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:441:3: kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_ARITMETICOAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:447:3: kw= '/'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_ARITMETICOAccess().getSolidusKeyword_3());
                    		

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
    // $ANTLR end "ruleOP_ARITMETICO"


    // $ANTLR start "entryRuleDECLARATION"
    // InternalMyDsl.g:456:1: entryRuleDECLARATION returns [EObject current=null] : iv_ruleDECLARATION= ruleDECLARATION EOF ;
    public final EObject entryRuleDECLARATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDECLARATION = null;


        try {
            // InternalMyDsl.g:456:52: (iv_ruleDECLARATION= ruleDECLARATION EOF )
            // InternalMyDsl.g:457:2: iv_ruleDECLARATION= ruleDECLARATION EOF
            {
             newCompositeNode(grammarAccess.getDECLARATIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECLARATION=ruleDECLARATION();

            state._fsp--;

             current =iv_ruleDECLARATION; 
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
    // $ANTLR end "entryRuleDECLARATION"


    // $ANTLR start "ruleDECLARATION"
    // InternalMyDsl.g:463:1: ruleDECLARATION returns [EObject current=null] : ( ( (lv_type_0_0= ruleTYPE ) ) ( (lv_isArray_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDECLARATION() throws RecognitionException {
        EObject current = null;

        Token lv_isArray_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:469:2: ( ( ( (lv_type_0_0= ruleTYPE ) ) ( (lv_isArray_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:470:2: ( ( (lv_type_0_0= ruleTYPE ) ) ( (lv_isArray_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:470:2: ( ( (lv_type_0_0= ruleTYPE ) ) ( (lv_isArray_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:471:3: ( (lv_type_0_0= ruleTYPE ) ) ( (lv_isArray_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalMyDsl.g:471:3: ( (lv_type_0_0= ruleTYPE ) )
            // InternalMyDsl.g:472:4: (lv_type_0_0= ruleTYPE )
            {
            // InternalMyDsl.g:472:4: (lv_type_0_0= ruleTYPE )
            // InternalMyDsl.g:473:5: lv_type_0_0= ruleTYPE
            {

            					newCompositeNode(grammarAccess.getDECLARATIONAccess().getTypeTYPEParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_0_0=ruleTYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDECLARATIONRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.mydsl.MyDsl.TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:490:3: ( (lv_isArray_1_0= '[]' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:491:4: (lv_isArray_1_0= '[]' )
                    {
                    // InternalMyDsl.g:491:4: (lv_isArray_1_0= '[]' )
                    // InternalMyDsl.g:492:5: lv_isArray_1_0= '[]'
                    {
                    lv_isArray_1_0=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(lv_isArray_1_0, grammarAccess.getDECLARATIONAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDECLARATIONRule());
                    					}
                    					setWithLastConsumed(current, "isArray", true, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:504:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:505:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:505:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:506:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDECLARATIONAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDECLARATIONRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.ID");
            				

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
    // $ANTLR end "ruleDECLARATION"


    // $ANTLR start "entryRuleTYPE"
    // InternalMyDsl.g:526:1: entryRuleTYPE returns [String current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final String entryRuleTYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE = null;


        try {
            // InternalMyDsl.g:526:44: (iv_ruleTYPE= ruleTYPE EOF )
            // InternalMyDsl.g:527:2: iv_ruleTYPE= ruleTYPE EOF
            {
             newCompositeNode(grammarAccess.getTYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE=ruleTYPE();

            state._fsp--;

             current =iv_ruleTYPE.getText(); 
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
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // InternalMyDsl.g:533:1: ruleTYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleTYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:539:2: ( (kw= 'int' | kw= 'string' ) )
            // InternalMyDsl.g:540:2: (kw= 'int' | kw= 'string' )
            {
            // InternalMyDsl.g:540:2: (kw= 'int' | kw= 'string' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:541:3: kw= 'int'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTYPEAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:547:3: kw= 'string'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTYPEAccess().getStringKeyword_1());
                    		

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
    // $ANTLR end "ruleTYPE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000060072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});

}