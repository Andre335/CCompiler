package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'int'", "'string'", "'='", "'[]'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
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
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

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


    // $ANTLR start "entryRuleprimary_expression"
    // InternalMyDsl.g:78:1: entryRuleprimary_expression : ruleprimary_expression EOF ;
    public final void entryRuleprimary_expression() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleprimary_expression EOF )
            // InternalMyDsl.g:80:1: ruleprimary_expression EOF
            {
             before(grammarAccess.getPrimary_expressionRule()); 
            pushFollow(FOLLOW_1);
            ruleprimary_expression();

            state._fsp--;

             after(grammarAccess.getPrimary_expressionRule()); 
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
    // $ANTLR end "entryRuleprimary_expression"


    // $ANTLR start "ruleprimary_expression"
    // InternalMyDsl.g:87:1: ruleprimary_expression : ( ( rule__Primary_expression__Alternatives ) ) ;
    public final void ruleprimary_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Primary_expression__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Primary_expression__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Primary_expression__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Primary_expression__Alternatives )
            {
             before(grammarAccess.getPrimary_expressionAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Primary_expression__Alternatives )
            // InternalMyDsl.g:94:4: rule__Primary_expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary_expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimary_expressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleprimary_expression"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalMyDsl.g:103:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleIntLiteral EOF )
            // InternalMyDsl.g:105:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalMyDsl.g:112:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__IntLiteral__ValueAssignment ) )
            // InternalMyDsl.g:118:3: ( rule__IntLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            // InternalMyDsl.g:119:3: ( rule__IntLiteral__ValueAssignment )
            // InternalMyDsl.g:119:4: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMyDsl.g:128:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleStringLiteral EOF )
            // InternalMyDsl.g:130:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMyDsl.g:137:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalMyDsl.g:143:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalMyDsl.g:144:3: ( rule__StringLiteral__ValueAssignment )
            // InternalMyDsl.g:144:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleLITERAL"
    // InternalMyDsl.g:153:1: entryRuleLITERAL : ruleLITERAL EOF ;
    public final void entryRuleLITERAL() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleLITERAL EOF )
            // InternalMyDsl.g:155:1: ruleLITERAL EOF
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
    // InternalMyDsl.g:162:1: ruleLITERAL : ( ( rule__LITERAL__Alternatives ) ) ;
    public final void ruleLITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__LITERAL__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__LITERAL__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__LITERAL__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__LITERAL__Alternatives )
            {
             before(grammarAccess.getLITERALAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__LITERAL__Alternatives )
            // InternalMyDsl.g:169:4: rule__LITERAL__Alternatives
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


    // $ANTLR start "entryRuleValAssignment"
    // InternalMyDsl.g:178:1: entryRuleValAssignment : ruleValAssignment EOF ;
    public final void entryRuleValAssignment() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleValAssignment EOF )
            // InternalMyDsl.g:180:1: ruleValAssignment EOF
            {
             before(grammarAccess.getValAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleValAssignment();

            state._fsp--;

             after(grammarAccess.getValAssignmentRule()); 
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
    // $ANTLR end "entryRuleValAssignment"


    // $ANTLR start "ruleValAssignment"
    // InternalMyDsl.g:187:1: ruleValAssignment : ( ( rule__ValAssignment__Group__0 ) ) ;
    public final void ruleValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__ValAssignment__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__ValAssignment__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__ValAssignment__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__ValAssignment__Group__0 )
            {
             before(grammarAccess.getValAssignmentAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__ValAssignment__Group__0 )
            // InternalMyDsl.g:194:4: rule__ValAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleValAssignment"


    // $ANTLR start "entryRuleexpression"
    // InternalMyDsl.g:203:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleexpression EOF )
            // InternalMyDsl.g:205:1: ruleexpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalMyDsl.g:212:1: ruleexpression : ( ruleLiteralExpression ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ruleLiteralExpression ) )
            // InternalMyDsl.g:217:2: ( ruleLiteralExpression )
            {
            // InternalMyDsl.g:217:2: ( ruleLiteralExpression )
            // InternalMyDsl.g:218:3: ruleLiteralExpression
            {
             before(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall()); 

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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalMyDsl.g:228:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleLiteralExpression EOF )
            // InternalMyDsl.g:230:1: ruleLiteralExpression EOF
            {
             before(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionRule()); 
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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalMyDsl.g:237:1: ruleLiteralExpression : ( ruleIntLiteralExpression ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ruleIntLiteralExpression ) )
            // InternalMyDsl.g:242:2: ( ruleIntLiteralExpression )
            {
            // InternalMyDsl.g:242:2: ( ruleIntLiteralExpression )
            // InternalMyDsl.g:243:3: ruleIntLiteralExpression
            {
             before(grammarAccess.getLiteralExpressionAccess().getIntLiteralExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleIntLiteralExpression();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionAccess().getIntLiteralExpressionParserRuleCall()); 

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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleIntLiteralExpression"
    // InternalMyDsl.g:253:1: entryRuleIntLiteralExpression : ruleIntLiteralExpression EOF ;
    public final void entryRuleIntLiteralExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleIntLiteralExpression EOF )
            // InternalMyDsl.g:255:1: ruleIntLiteralExpression EOF
            {
             before(grammarAccess.getIntLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteralExpression();

            state._fsp--;

             after(grammarAccess.getIntLiteralExpressionRule()); 
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
    // $ANTLR end "entryRuleIntLiteralExpression"


    // $ANTLR start "ruleIntLiteralExpression"
    // InternalMyDsl.g:262:1: ruleIntLiteralExpression : ( ( rule__IntLiteralExpression__Group__0 ) ) ;
    public final void ruleIntLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__IntLiteralExpression__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__IntLiteralExpression__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__IntLiteralExpression__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__IntLiteralExpression__Group__0 )
            {
             before(grammarAccess.getIntLiteralExpressionAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__IntLiteralExpression__Group__0 )
            // InternalMyDsl.g:269:4: rule__IntLiteralExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteralExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleIntLiteralExpression"


    // $ANTLR start "entryRuleOP_ARITMETICO"
    // InternalMyDsl.g:278:1: entryRuleOP_ARITMETICO : ruleOP_ARITMETICO EOF ;
    public final void entryRuleOP_ARITMETICO() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleOP_ARITMETICO EOF )
            // InternalMyDsl.g:280:1: ruleOP_ARITMETICO EOF
            {
             before(grammarAccess.getOP_ARITMETICORule()); 
            pushFollow(FOLLOW_1);
            ruleOP_ARITMETICO();

            state._fsp--;

             after(grammarAccess.getOP_ARITMETICORule()); 
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
    // $ANTLR end "entryRuleOP_ARITMETICO"


    // $ANTLR start "ruleOP_ARITMETICO"
    // InternalMyDsl.g:287:1: ruleOP_ARITMETICO : ( ( rule__OP_ARITMETICO__Alternatives ) ) ;
    public final void ruleOP_ARITMETICO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__OP_ARITMETICO__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__OP_ARITMETICO__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__OP_ARITMETICO__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__OP_ARITMETICO__Alternatives )
            {
             before(grammarAccess.getOP_ARITMETICOAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__OP_ARITMETICO__Alternatives )
            // InternalMyDsl.g:294:4: rule__OP_ARITMETICO__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OP_ARITMETICO__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOP_ARITMETICOAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOP_ARITMETICO"


    // $ANTLR start "entryRuleDECLARATION"
    // InternalMyDsl.g:303:1: entryRuleDECLARATION : ruleDECLARATION EOF ;
    public final void entryRuleDECLARATION() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleDECLARATION EOF )
            // InternalMyDsl.g:305:1: ruleDECLARATION EOF
            {
             before(grammarAccess.getDECLARATIONRule()); 
            pushFollow(FOLLOW_1);
            ruleDECLARATION();

            state._fsp--;

             after(grammarAccess.getDECLARATIONRule()); 
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
    // $ANTLR end "entryRuleDECLARATION"


    // $ANTLR start "ruleDECLARATION"
    // InternalMyDsl.g:312:1: ruleDECLARATION : ( ( rule__DECLARATION__Group__0 ) ) ;
    public final void ruleDECLARATION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__DECLARATION__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__DECLARATION__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__DECLARATION__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__DECLARATION__Group__0 )
            {
             before(grammarAccess.getDECLARATIONAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__DECLARATION__Group__0 )
            // InternalMyDsl.g:319:4: rule__DECLARATION__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DECLARATION__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDECLARATIONAccess().getGroup()); 

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
    // $ANTLR end "ruleDECLARATION"


    // $ANTLR start "entryRuleTYPE"
    // InternalMyDsl.g:328:1: entryRuleTYPE : ruleTYPE EOF ;
    public final void entryRuleTYPE() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleTYPE EOF )
            // InternalMyDsl.g:330:1: ruleTYPE EOF
            {
             before(grammarAccess.getTYPERule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE();

            state._fsp--;

             after(grammarAccess.getTYPERule()); 
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
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // InternalMyDsl.g:337:1: ruleTYPE : ( ( rule__TYPE__Alternatives ) ) ;
    public final void ruleTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__TYPE__Alternatives ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__TYPE__Alternatives ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__TYPE__Alternatives ) )
            // InternalMyDsl.g:343:3: ( rule__TYPE__Alternatives )
            {
             before(grammarAccess.getTYPEAccess().getAlternatives()); 
            // InternalMyDsl.g:344:3: ( rule__TYPE__Alternatives )
            // InternalMyDsl.g:344:4: rule__TYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "rule__Primary_expression__Alternatives"
    // InternalMyDsl.g:352:1: rule__Primary_expression__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleDECLARATION ) | ( ruleValAssignment ) | ( ruleexpression ) );
    public final void rule__Primary_expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:356:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleDECLARATION ) | ( ruleValAssignment ) | ( ruleexpression ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==17) ) {
                    alt2=4;
                }
                else if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_INT)||(LA2_1>=15 && LA2_1<=16)) ) {
                    alt2=1;
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
            case 15:
            case 16:
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
                    // InternalMyDsl.g:357:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:357:2: ( RULE_ID )
                    // InternalMyDsl.g:358:3: RULE_ID
                    {
                     before(grammarAccess.getPrimary_expressionAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getPrimary_expressionAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:363:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:363:2: ( RULE_STRING )
                    // InternalMyDsl.g:364:3: RULE_STRING
                    {
                     before(grammarAccess.getPrimary_expressionAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getPrimary_expressionAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:369:2: ( ruleDECLARATION )
                    {
                    // InternalMyDsl.g:369:2: ( ruleDECLARATION )
                    // InternalMyDsl.g:370:3: ruleDECLARATION
                    {
                     before(grammarAccess.getPrimary_expressionAccess().getDECLARATIONParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDECLARATION();

                    state._fsp--;

                     after(grammarAccess.getPrimary_expressionAccess().getDECLARATIONParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:375:2: ( ruleValAssignment )
                    {
                    // InternalMyDsl.g:375:2: ( ruleValAssignment )
                    // InternalMyDsl.g:376:3: ruleValAssignment
                    {
                     before(grammarAccess.getPrimary_expressionAccess().getValAssignmentParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleValAssignment();

                    state._fsp--;

                     after(grammarAccess.getPrimary_expressionAccess().getValAssignmentParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:381:2: ( ruleexpression )
                    {
                    // InternalMyDsl.g:381:2: ( ruleexpression )
                    // InternalMyDsl.g:382:3: ruleexpression
                    {
                     before(grammarAccess.getPrimary_expressionAccess().getExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleexpression();

                    state._fsp--;

                     after(grammarAccess.getPrimary_expressionAccess().getExpressionParserRuleCall_4()); 

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
    // $ANTLR end "rule__Primary_expression__Alternatives"


    // $ANTLR start "rule__LITERAL__Alternatives"
    // InternalMyDsl.g:391:1: rule__LITERAL__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) );
    public final void rule__LITERAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) )
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
                    // InternalMyDsl.g:396:2: ( ruleStringLiteral )
                    {
                    // InternalMyDsl.g:396:2: ( ruleStringLiteral )
                    // InternalMyDsl.g:397:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLITERALAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLITERALAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:402:2: ( ruleIntLiteral )
                    {
                    // InternalMyDsl.g:402:2: ( ruleIntLiteral )
                    // InternalMyDsl.g:403:3: ruleIntLiteral
                    {
                     before(grammarAccess.getLITERALAccess().getIntLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getLITERALAccess().getIntLiteralParserRuleCall_1()); 

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


    // $ANTLR start "rule__OP_ARITMETICO__Alternatives"
    // InternalMyDsl.g:412:1: rule__OP_ARITMETICO__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) );
    public final void rule__OP_ARITMETICO__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:417:2: ( '+' )
                    {
                    // InternalMyDsl.g:417:2: ( '+' )
                    // InternalMyDsl.g:418:3: '+'
                    {
                     before(grammarAccess.getOP_ARITMETICOAccess().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOP_ARITMETICOAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:423:2: ( '-' )
                    {
                    // InternalMyDsl.g:423:2: ( '-' )
                    // InternalMyDsl.g:424:3: '-'
                    {
                     before(grammarAccess.getOP_ARITMETICOAccess().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOP_ARITMETICOAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:429:2: ( '*' )
                    {
                    // InternalMyDsl.g:429:2: ( '*' )
                    // InternalMyDsl.g:430:3: '*'
                    {
                     before(grammarAccess.getOP_ARITMETICOAccess().getAsteriskKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOP_ARITMETICOAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:435:2: ( '/' )
                    {
                    // InternalMyDsl.g:435:2: ( '/' )
                    // InternalMyDsl.g:436:3: '/'
                    {
                     before(grammarAccess.getOP_ARITMETICOAccess().getSolidusKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOP_ARITMETICOAccess().getSolidusKeyword_3()); 

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
    // $ANTLR end "rule__OP_ARITMETICO__Alternatives"


    // $ANTLR start "rule__TYPE__Alternatives"
    // InternalMyDsl.g:445:1: rule__TYPE__Alternatives : ( ( 'int' ) | ( 'string' ) );
    public final void rule__TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( ( 'int' ) | ( 'string' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:450:2: ( 'int' )
                    {
                    // InternalMyDsl.g:450:2: ( 'int' )
                    // InternalMyDsl.g:451:3: 'int'
                    {
                     before(grammarAccess.getTYPEAccess().getIntKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTYPEAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:456:2: ( 'string' )
                    {
                    // InternalMyDsl.g:456:2: ( 'string' )
                    // InternalMyDsl.g:457:3: 'string'
                    {
                     before(grammarAccess.getTYPEAccess().getStringKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTYPEAccess().getStringKeyword_1()); 

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
    // $ANTLR end "rule__TYPE__Alternatives"


    // $ANTLR start "rule__ValAssignment__Group__0"
    // InternalMyDsl.g:466:1: rule__ValAssignment__Group__0 : rule__ValAssignment__Group__0__Impl rule__ValAssignment__Group__1 ;
    public final void rule__ValAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( rule__ValAssignment__Group__0__Impl rule__ValAssignment__Group__1 )
            // InternalMyDsl.g:471:2: rule__ValAssignment__Group__0__Impl rule__ValAssignment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ValAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValAssignment__Group__1();

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
    // $ANTLR end "rule__ValAssignment__Group__0"


    // $ANTLR start "rule__ValAssignment__Group__0__Impl"
    // InternalMyDsl.g:478:1: rule__ValAssignment__Group__0__Impl : ( ( rule__ValAssignment__DeclarationAssignment_0 ) ) ;
    public final void rule__ValAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:482:1: ( ( ( rule__ValAssignment__DeclarationAssignment_0 ) ) )
            // InternalMyDsl.g:483:1: ( ( rule__ValAssignment__DeclarationAssignment_0 ) )
            {
            // InternalMyDsl.g:483:1: ( ( rule__ValAssignment__DeclarationAssignment_0 ) )
            // InternalMyDsl.g:484:2: ( rule__ValAssignment__DeclarationAssignment_0 )
            {
             before(grammarAccess.getValAssignmentAccess().getDeclarationAssignment_0()); 
            // InternalMyDsl.g:485:2: ( rule__ValAssignment__DeclarationAssignment_0 )
            // InternalMyDsl.g:485:3: rule__ValAssignment__DeclarationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ValAssignment__DeclarationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValAssignmentAccess().getDeclarationAssignment_0()); 

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
    // $ANTLR end "rule__ValAssignment__Group__0__Impl"


    // $ANTLR start "rule__ValAssignment__Group__1"
    // InternalMyDsl.g:493:1: rule__ValAssignment__Group__1 : rule__ValAssignment__Group__1__Impl rule__ValAssignment__Group__2 ;
    public final void rule__ValAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:497:1: ( rule__ValAssignment__Group__1__Impl rule__ValAssignment__Group__2 )
            // InternalMyDsl.g:498:2: rule__ValAssignment__Group__1__Impl rule__ValAssignment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ValAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValAssignment__Group__2();

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
    // $ANTLR end "rule__ValAssignment__Group__1"


    // $ANTLR start "rule__ValAssignment__Group__1__Impl"
    // InternalMyDsl.g:505:1: rule__ValAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__ValAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:509:1: ( ( '=' ) )
            // InternalMyDsl.g:510:1: ( '=' )
            {
            // InternalMyDsl.g:510:1: ( '=' )
            // InternalMyDsl.g:511:2: '='
            {
             before(grammarAccess.getValAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getValAssignmentAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__ValAssignment__Group__1__Impl"


    // $ANTLR start "rule__ValAssignment__Group__2"
    // InternalMyDsl.g:520:1: rule__ValAssignment__Group__2 : rule__ValAssignment__Group__2__Impl ;
    public final void rule__ValAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( rule__ValAssignment__Group__2__Impl )
            // InternalMyDsl.g:525:2: rule__ValAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValAssignment__Group__2__Impl();

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
    // $ANTLR end "rule__ValAssignment__Group__2"


    // $ANTLR start "rule__ValAssignment__Group__2__Impl"
    // InternalMyDsl.g:531:1: rule__ValAssignment__Group__2__Impl : ( ( rule__ValAssignment__ValueAssignment_2 ) ) ;
    public final void rule__ValAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:535:1: ( ( ( rule__ValAssignment__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:536:1: ( ( rule__ValAssignment__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:536:1: ( ( rule__ValAssignment__ValueAssignment_2 ) )
            // InternalMyDsl.g:537:2: ( rule__ValAssignment__ValueAssignment_2 )
            {
             before(grammarAccess.getValAssignmentAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:538:2: ( rule__ValAssignment__ValueAssignment_2 )
            // InternalMyDsl.g:538:3: rule__ValAssignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ValAssignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValAssignmentAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__ValAssignment__Group__2__Impl"


    // $ANTLR start "rule__IntLiteralExpression__Group__0"
    // InternalMyDsl.g:547:1: rule__IntLiteralExpression__Group__0 : rule__IntLiteralExpression__Group__0__Impl rule__IntLiteralExpression__Group__1 ;
    public final void rule__IntLiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:551:1: ( rule__IntLiteralExpression__Group__0__Impl rule__IntLiteralExpression__Group__1 )
            // InternalMyDsl.g:552:2: rule__IntLiteralExpression__Group__0__Impl rule__IntLiteralExpression__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__IntLiteralExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntLiteralExpression__Group__1();

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
    // $ANTLR end "rule__IntLiteralExpression__Group__0"


    // $ANTLR start "rule__IntLiteralExpression__Group__0__Impl"
    // InternalMyDsl.g:559:1: rule__IntLiteralExpression__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__IntLiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:563:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:564:1: ( RULE_INT )
            {
            // InternalMyDsl.g:564:1: ( RULE_INT )
            // InternalMyDsl.g:565:2: RULE_INT
            {
             before(grammarAccess.getIntLiteralExpressionAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralExpressionAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntLiteralExpression__Group__0__Impl"


    // $ANTLR start "rule__IntLiteralExpression__Group__1"
    // InternalMyDsl.g:574:1: rule__IntLiteralExpression__Group__1 : rule__IntLiteralExpression__Group__1__Impl ;
    public final void rule__IntLiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( rule__IntLiteralExpression__Group__1__Impl )
            // InternalMyDsl.g:579:2: rule__IntLiteralExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteralExpression__Group__1__Impl();

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
    // $ANTLR end "rule__IntLiteralExpression__Group__1"


    // $ANTLR start "rule__IntLiteralExpression__Group__1__Impl"
    // InternalMyDsl.g:585:1: rule__IntLiteralExpression__Group__1__Impl : ( ( rule__IntLiteralExpression__Group_1__0 )* ) ;
    public final void rule__IntLiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( ( rule__IntLiteralExpression__Group_1__0 )* ) )
            // InternalMyDsl.g:590:1: ( ( rule__IntLiteralExpression__Group_1__0 )* )
            {
            // InternalMyDsl.g:590:1: ( ( rule__IntLiteralExpression__Group_1__0 )* )
            // InternalMyDsl.g:591:2: ( rule__IntLiteralExpression__Group_1__0 )*
            {
             before(grammarAccess.getIntLiteralExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:592:2: ( rule__IntLiteralExpression__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=14)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:592:3: rule__IntLiteralExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__IntLiteralExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getIntLiteralExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__IntLiteralExpression__Group__1__Impl"


    // $ANTLR start "rule__IntLiteralExpression__Group_1__0"
    // InternalMyDsl.g:601:1: rule__IntLiteralExpression__Group_1__0 : rule__IntLiteralExpression__Group_1__0__Impl rule__IntLiteralExpression__Group_1__1 ;
    public final void rule__IntLiteralExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( rule__IntLiteralExpression__Group_1__0__Impl rule__IntLiteralExpression__Group_1__1 )
            // InternalMyDsl.g:606:2: rule__IntLiteralExpression__Group_1__0__Impl rule__IntLiteralExpression__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__IntLiteralExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntLiteralExpression__Group_1__1();

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
    // $ANTLR end "rule__IntLiteralExpression__Group_1__0"


    // $ANTLR start "rule__IntLiteralExpression__Group_1__0__Impl"
    // InternalMyDsl.g:613:1: rule__IntLiteralExpression__Group_1__0__Impl : ( ruleOP_ARITMETICO ) ;
    public final void rule__IntLiteralExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:617:1: ( ( ruleOP_ARITMETICO ) )
            // InternalMyDsl.g:618:1: ( ruleOP_ARITMETICO )
            {
            // InternalMyDsl.g:618:1: ( ruleOP_ARITMETICO )
            // InternalMyDsl.g:619:2: ruleOP_ARITMETICO
            {
             before(grammarAccess.getIntLiteralExpressionAccess().getOP_ARITMETICOParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOP_ARITMETICO();

            state._fsp--;

             after(grammarAccess.getIntLiteralExpressionAccess().getOP_ARITMETICOParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__IntLiteralExpression__Group_1__0__Impl"


    // $ANTLR start "rule__IntLiteralExpression__Group_1__1"
    // InternalMyDsl.g:628:1: rule__IntLiteralExpression__Group_1__1 : rule__IntLiteralExpression__Group_1__1__Impl ;
    public final void rule__IntLiteralExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( rule__IntLiteralExpression__Group_1__1__Impl )
            // InternalMyDsl.g:633:2: rule__IntLiteralExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteralExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__IntLiteralExpression__Group_1__1"


    // $ANTLR start "rule__IntLiteralExpression__Group_1__1__Impl"
    // InternalMyDsl.g:639:1: rule__IntLiteralExpression__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__IntLiteralExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:643:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:644:1: ( RULE_INT )
            {
            // InternalMyDsl.g:644:1: ( RULE_INT )
            // InternalMyDsl.g:645:2: RULE_INT
            {
             before(grammarAccess.getIntLiteralExpressionAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralExpressionAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__IntLiteralExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DECLARATION__Group__0"
    // InternalMyDsl.g:655:1: rule__DECLARATION__Group__0 : rule__DECLARATION__Group__0__Impl rule__DECLARATION__Group__1 ;
    public final void rule__DECLARATION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( rule__DECLARATION__Group__0__Impl rule__DECLARATION__Group__1 )
            // InternalMyDsl.g:660:2: rule__DECLARATION__Group__0__Impl rule__DECLARATION__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DECLARATION__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECLARATION__Group__1();

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
    // $ANTLR end "rule__DECLARATION__Group__0"


    // $ANTLR start "rule__DECLARATION__Group__0__Impl"
    // InternalMyDsl.g:667:1: rule__DECLARATION__Group__0__Impl : ( ( rule__DECLARATION__TypeAssignment_0 ) ) ;
    public final void rule__DECLARATION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( ( ( rule__DECLARATION__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:672:1: ( ( rule__DECLARATION__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:672:1: ( ( rule__DECLARATION__TypeAssignment_0 ) )
            // InternalMyDsl.g:673:2: ( rule__DECLARATION__TypeAssignment_0 )
            {
             before(grammarAccess.getDECLARATIONAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:674:2: ( rule__DECLARATION__TypeAssignment_0 )
            // InternalMyDsl.g:674:3: rule__DECLARATION__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DECLARATION__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDECLARATIONAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__DECLARATION__Group__0__Impl"


    // $ANTLR start "rule__DECLARATION__Group__1"
    // InternalMyDsl.g:682:1: rule__DECLARATION__Group__1 : rule__DECLARATION__Group__1__Impl rule__DECLARATION__Group__2 ;
    public final void rule__DECLARATION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( rule__DECLARATION__Group__1__Impl rule__DECLARATION__Group__2 )
            // InternalMyDsl.g:687:2: rule__DECLARATION__Group__1__Impl rule__DECLARATION__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__DECLARATION__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECLARATION__Group__2();

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
    // $ANTLR end "rule__DECLARATION__Group__1"


    // $ANTLR start "rule__DECLARATION__Group__1__Impl"
    // InternalMyDsl.g:694:1: rule__DECLARATION__Group__1__Impl : ( ( rule__DECLARATION__IsArrayAssignment_1 )? ) ;
    public final void rule__DECLARATION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( ( ( rule__DECLARATION__IsArrayAssignment_1 )? ) )
            // InternalMyDsl.g:699:1: ( ( rule__DECLARATION__IsArrayAssignment_1 )? )
            {
            // InternalMyDsl.g:699:1: ( ( rule__DECLARATION__IsArrayAssignment_1 )? )
            // InternalMyDsl.g:700:2: ( rule__DECLARATION__IsArrayAssignment_1 )?
            {
             before(grammarAccess.getDECLARATIONAccess().getIsArrayAssignment_1()); 
            // InternalMyDsl.g:701:2: ( rule__DECLARATION__IsArrayAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:701:3: rule__DECLARATION__IsArrayAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DECLARATION__IsArrayAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDECLARATIONAccess().getIsArrayAssignment_1()); 

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
    // $ANTLR end "rule__DECLARATION__Group__1__Impl"


    // $ANTLR start "rule__DECLARATION__Group__2"
    // InternalMyDsl.g:709:1: rule__DECLARATION__Group__2 : rule__DECLARATION__Group__2__Impl ;
    public final void rule__DECLARATION__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( rule__DECLARATION__Group__2__Impl )
            // InternalMyDsl.g:714:2: rule__DECLARATION__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECLARATION__Group__2__Impl();

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
    // $ANTLR end "rule__DECLARATION__Group__2"


    // $ANTLR start "rule__DECLARATION__Group__2__Impl"
    // InternalMyDsl.g:720:1: rule__DECLARATION__Group__2__Impl : ( ( rule__DECLARATION__NameAssignment_2 ) ) ;
    public final void rule__DECLARATION__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:724:1: ( ( ( rule__DECLARATION__NameAssignment_2 ) ) )
            // InternalMyDsl.g:725:1: ( ( rule__DECLARATION__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:725:1: ( ( rule__DECLARATION__NameAssignment_2 ) )
            // InternalMyDsl.g:726:2: ( rule__DECLARATION__NameAssignment_2 )
            {
             before(grammarAccess.getDECLARATIONAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:727:2: ( rule__DECLARATION__NameAssignment_2 )
            // InternalMyDsl.g:727:3: rule__DECLARATION__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DECLARATION__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDECLARATIONAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DECLARATION__Group__2__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalMyDsl.g:736:1: rule__Model__GreetingsAssignment : ( ruleprimary_expression ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( ( ruleprimary_expression ) )
            // InternalMyDsl.g:741:2: ( ruleprimary_expression )
            {
            // InternalMyDsl.g:741:2: ( ruleprimary_expression )
            // InternalMyDsl.g:742:3: ruleprimary_expression
            {
             before(grammarAccess.getModelAccess().getGreetingsPrimary_expressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleprimary_expression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsPrimary_expressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // InternalMyDsl.g:751:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:756:2: ( RULE_INT )
            {
            // InternalMyDsl.g:756:2: ( RULE_INT )
            // InternalMyDsl.g:757:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalMyDsl.g:766:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:771:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:771:2: ( RULE_STRING )
            // InternalMyDsl.g:772:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__ValAssignment__DeclarationAssignment_0"
    // InternalMyDsl.g:781:1: rule__ValAssignment__DeclarationAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ValAssignment__DeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:786:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:786:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:787:3: ( RULE_ID )
            {
             before(grammarAccess.getValAssignmentAccess().getDeclarationDECLARATIONCrossReference_0_0()); 
            // InternalMyDsl.g:788:3: ( RULE_ID )
            // InternalMyDsl.g:789:4: RULE_ID
            {
             before(grammarAccess.getValAssignmentAccess().getDeclarationDECLARATIONIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValAssignmentAccess().getDeclarationDECLARATIONIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getValAssignmentAccess().getDeclarationDECLARATIONCrossReference_0_0()); 

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
    // $ANTLR end "rule__ValAssignment__DeclarationAssignment_0"


    // $ANTLR start "rule__ValAssignment__ValueAssignment_2"
    // InternalMyDsl.g:800:1: rule__ValAssignment__ValueAssignment_2 : ( ruleLITERAL ) ;
    public final void rule__ValAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:804:1: ( ( ruleLITERAL ) )
            // InternalMyDsl.g:805:2: ( ruleLITERAL )
            {
            // InternalMyDsl.g:805:2: ( ruleLITERAL )
            // InternalMyDsl.g:806:3: ruleLITERAL
            {
             before(grammarAccess.getValAssignmentAccess().getValueLITERALParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLITERAL();

            state._fsp--;

             after(grammarAccess.getValAssignmentAccess().getValueLITERALParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ValAssignment__ValueAssignment_2"


    // $ANTLR start "rule__DECLARATION__TypeAssignment_0"
    // InternalMyDsl.g:815:1: rule__DECLARATION__TypeAssignment_0 : ( ruleTYPE ) ;
    public final void rule__DECLARATION__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:819:1: ( ( ruleTYPE ) )
            // InternalMyDsl.g:820:2: ( ruleTYPE )
            {
            // InternalMyDsl.g:820:2: ( ruleTYPE )
            // InternalMyDsl.g:821:3: ruleTYPE
            {
             before(grammarAccess.getDECLARATIONAccess().getTypeTYPEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE();

            state._fsp--;

             after(grammarAccess.getDECLARATIONAccess().getTypeTYPEParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DECLARATION__TypeAssignment_0"


    // $ANTLR start "rule__DECLARATION__IsArrayAssignment_1"
    // InternalMyDsl.g:830:1: rule__DECLARATION__IsArrayAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__DECLARATION__IsArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:834:1: ( ( ( '[]' ) ) )
            // InternalMyDsl.g:835:2: ( ( '[]' ) )
            {
            // InternalMyDsl.g:835:2: ( ( '[]' ) )
            // InternalMyDsl.g:836:3: ( '[]' )
            {
             before(grammarAccess.getDECLARATIONAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // InternalMyDsl.g:837:3: ( '[]' )
            // InternalMyDsl.g:838:4: '[]'
            {
             before(grammarAccess.getDECLARATIONAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDECLARATIONAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getDECLARATIONAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__DECLARATION__IsArrayAssignment_1"


    // $ANTLR start "rule__DECLARATION__NameAssignment_2"
    // InternalMyDsl.g:849:1: rule__DECLARATION__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DECLARATION__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:854:2: ( RULE_ID )
            {
            // InternalMyDsl.g:854:2: ( RULE_ID )
            // InternalMyDsl.g:855:3: RULE_ID
            {
             before(grammarAccess.getDECLARATIONAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDECLARATIONAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DECLARATION__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000018072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040010L});

}