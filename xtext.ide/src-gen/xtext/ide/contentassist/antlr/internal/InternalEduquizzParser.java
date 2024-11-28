package xtext.ide.contentassist.antlr.internal;

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
import xtext.services.EduquizzGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEduquizzParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Questionnaire'", "'RetourAutoris\\u00E9'", "'M\\u00E9langer'", "'Question'", "'Difficult\\u00E9'", "'Etiquettes'", "','", "'-'", "'['", "']'", "'R\\u00E9ponsesMultiples'", "'x'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEduquizzParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEduquizzParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEduquizzParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEduquizz.g"; }


    	private EduquizzGrammarAccess grammarAccess;

    	public void setGrammarAccess(EduquizzGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleQuestionnaire"
    // InternalEduquizz.g:53:1: entryRuleQuestionnaire : ruleQuestionnaire EOF ;
    public final void entryRuleQuestionnaire() throws RecognitionException {
        try {
            // InternalEduquizz.g:54:1: ( ruleQuestionnaire EOF )
            // InternalEduquizz.g:55:1: ruleQuestionnaire EOF
            {
             before(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionnaire();

            state._fsp--;

             after(grammarAccess.getQuestionnaireRule()); 
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
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // InternalEduquizz.g:62:1: ruleQuestionnaire : ( ( rule__Questionnaire__Group__0 ) ) ;
    public final void ruleQuestionnaire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:66:2: ( ( ( rule__Questionnaire__Group__0 ) ) )
            // InternalEduquizz.g:67:2: ( ( rule__Questionnaire__Group__0 ) )
            {
            // InternalEduquizz.g:67:2: ( ( rule__Questionnaire__Group__0 ) )
            // InternalEduquizz.g:68:3: ( rule__Questionnaire__Group__0 )
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup()); 
            // InternalEduquizz.g:69:3: ( rule__Questionnaire__Group__0 )
            // InternalEduquizz.g:69:4: rule__Questionnaire__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleEString"
    // InternalEduquizz.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEduquizz.g:79:1: ( ruleEString EOF )
            // InternalEduquizz.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEduquizz.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalEduquizz.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalEduquizz.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalEduquizz.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalEduquizz.g:94:3: ( rule__EString__Alternatives )
            // InternalEduquizz.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalEduquizz.g:103:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalEduquizz.g:104:1: ( ruleEBoolean EOF )
            // InternalEduquizz.g:105:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalEduquizz.g:112:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:116:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalEduquizz.g:117:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalEduquizz.g:117:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalEduquizz.g:118:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalEduquizz.g:119:3: ( rule__EBoolean__Alternatives )
            // InternalEduquizz.g:119:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleQuestion"
    // InternalEduquizz.g:128:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalEduquizz.g:129:1: ( ruleQuestion EOF )
            // InternalEduquizz.g:130:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalEduquizz.g:137:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:141:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalEduquizz.g:142:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalEduquizz.g:142:2: ( ( rule__Question__Group__0 ) )
            // InternalEduquizz.g:143:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalEduquizz.g:144:3: ( rule__Question__Group__0 )
            // InternalEduquizz.g:144:4: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleEInt"
    // InternalEduquizz.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalEduquizz.g:154:1: ( ruleEInt EOF )
            // InternalEduquizz.g:155:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalEduquizz.g:162:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:166:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalEduquizz.g:167:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalEduquizz.g:167:2: ( ( rule__EInt__Group__0 ) )
            // InternalEduquizz.g:168:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalEduquizz.g:169:3: ( rule__EInt__Group__0 )
            // InternalEduquizz.g:169:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEtiquette"
    // InternalEduquizz.g:178:1: entryRuleEtiquette : ruleEtiquette EOF ;
    public final void entryRuleEtiquette() throws RecognitionException {
        try {
            // InternalEduquizz.g:179:1: ( ruleEtiquette EOF )
            // InternalEduquizz.g:180:1: ruleEtiquette EOF
            {
             before(grammarAccess.getEtiquetteRule()); 
            pushFollow(FOLLOW_1);
            ruleEtiquette();

            state._fsp--;

             after(grammarAccess.getEtiquetteRule()); 
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
    // $ANTLR end "entryRuleEtiquette"


    // $ANTLR start "ruleEtiquette"
    // InternalEduquizz.g:187:1: ruleEtiquette : ( ( rule__Etiquette__Group__0 ) ) ;
    public final void ruleEtiquette() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:191:2: ( ( ( rule__Etiquette__Group__0 ) ) )
            // InternalEduquizz.g:192:2: ( ( rule__Etiquette__Group__0 ) )
            {
            // InternalEduquizz.g:192:2: ( ( rule__Etiquette__Group__0 ) )
            // InternalEduquizz.g:193:3: ( rule__Etiquette__Group__0 )
            {
             before(grammarAccess.getEtiquetteAccess().getGroup()); 
            // InternalEduquizz.g:194:3: ( rule__Etiquette__Group__0 )
            // InternalEduquizz.g:194:4: rule__Etiquette__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEtiquetteAccess().getGroup()); 

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
    // $ANTLR end "ruleEtiquette"


    // $ANTLR start "entryRuleReponse"
    // InternalEduquizz.g:203:1: entryRuleReponse : ruleReponse EOF ;
    public final void entryRuleReponse() throws RecognitionException {
        try {
            // InternalEduquizz.g:204:1: ( ruleReponse EOF )
            // InternalEduquizz.g:205:1: ruleReponse EOF
            {
             before(grammarAccess.getReponseRule()); 
            pushFollow(FOLLOW_1);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getReponseRule()); 
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
    // $ANTLR end "entryRuleReponse"


    // $ANTLR start "ruleReponse"
    // InternalEduquizz.g:212:1: ruleReponse : ( ( rule__Reponse__Group__0 ) ) ;
    public final void ruleReponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:216:2: ( ( ( rule__Reponse__Group__0 ) ) )
            // InternalEduquizz.g:217:2: ( ( rule__Reponse__Group__0 ) )
            {
            // InternalEduquizz.g:217:2: ( ( rule__Reponse__Group__0 ) )
            // InternalEduquizz.g:218:3: ( rule__Reponse__Group__0 )
            {
             before(grammarAccess.getReponseAccess().getGroup()); 
            // InternalEduquizz.g:219:3: ( rule__Reponse__Group__0 )
            // InternalEduquizz.g:219:4: rule__Reponse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getGroup()); 

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
    // $ANTLR end "ruleReponse"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalEduquizz.g:227:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:231:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEduquizz.g:232:2: ( RULE_STRING )
                    {
                    // InternalEduquizz.g:232:2: ( RULE_STRING )
                    // InternalEduquizz.g:233:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduquizz.g:238:2: ( RULE_ID )
                    {
                    // InternalEduquizz.g:238:2: ( RULE_ID )
                    // InternalEduquizz.g:239:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalEduquizz.g:248:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:252:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEduquizz.g:253:2: ( 'true' )
                    {
                    // InternalEduquizz.g:253:2: ( 'true' )
                    // InternalEduquizz.g:254:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduquizz.g:259:2: ( 'false' )
                    {
                    // InternalEduquizz.g:259:2: ( 'false' )
                    // InternalEduquizz.g:260:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Questionnaire__Group__0"
    // InternalEduquizz.g:269:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:273:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // InternalEduquizz.g:274:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Questionnaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__1();

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
    // $ANTLR end "rule__Questionnaire__Group__0"


    // $ANTLR start "rule__Questionnaire__Group__0__Impl"
    // InternalEduquizz.g:281:1: rule__Questionnaire__Group__0__Impl : ( 'Questionnaire' ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:285:1: ( ( 'Questionnaire' ) )
            // InternalEduquizz.g:286:1: ( 'Questionnaire' )
            {
            // InternalEduquizz.g:286:1: ( 'Questionnaire' )
            // InternalEduquizz.g:287:2: 'Questionnaire'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 

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
    // $ANTLR end "rule__Questionnaire__Group__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group__1"
    // InternalEduquizz.g:296:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:300:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // InternalEduquizz.g:301:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Questionnaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__2();

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
    // $ANTLR end "rule__Questionnaire__Group__1"


    // $ANTLR start "rule__Questionnaire__Group__1__Impl"
    // InternalEduquizz.g:308:1: rule__Questionnaire__Group__1__Impl : ( ( rule__Questionnaire__NomAssignment_1 )? ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:312:1: ( ( ( rule__Questionnaire__NomAssignment_1 )? ) )
            // InternalEduquizz.g:313:1: ( ( rule__Questionnaire__NomAssignment_1 )? )
            {
            // InternalEduquizz.g:313:1: ( ( rule__Questionnaire__NomAssignment_1 )? )
            // InternalEduquizz.g:314:2: ( rule__Questionnaire__NomAssignment_1 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getNomAssignment_1()); 
            // InternalEduquizz.g:315:2: ( rule__Questionnaire__NomAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEduquizz.g:315:3: rule__Questionnaire__NomAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Questionnaire__NomAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionnaireAccess().getNomAssignment_1()); 

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
    // $ANTLR end "rule__Questionnaire__Group__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group__2"
    // InternalEduquizz.g:323:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:327:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // InternalEduquizz.g:328:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Questionnaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__3();

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
    // $ANTLR end "rule__Questionnaire__Group__2"


    // $ANTLR start "rule__Questionnaire__Group__2__Impl"
    // InternalEduquizz.g:335:1: rule__Questionnaire__Group__2__Impl : ( ( rule__Questionnaire__Group_2__0 )? ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:339:1: ( ( ( rule__Questionnaire__Group_2__0 )? ) )
            // InternalEduquizz.g:340:1: ( ( rule__Questionnaire__Group_2__0 )? )
            {
            // InternalEduquizz.g:340:1: ( ( rule__Questionnaire__Group_2__0 )? )
            // InternalEduquizz.g:341:2: ( rule__Questionnaire__Group_2__0 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_2()); 
            // InternalEduquizz.g:342:2: ( rule__Questionnaire__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEduquizz.g:342:3: rule__Questionnaire__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Questionnaire__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionnaireAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Questionnaire__Group__2__Impl"


    // $ANTLR start "rule__Questionnaire__Group__3"
    // InternalEduquizz.g:350:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:354:1: ( rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 )
            // InternalEduquizz.g:355:2: rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Questionnaire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__4();

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
    // $ANTLR end "rule__Questionnaire__Group__3"


    // $ANTLR start "rule__Questionnaire__Group__3__Impl"
    // InternalEduquizz.g:362:1: rule__Questionnaire__Group__3__Impl : ( ( rule__Questionnaire__Group_3__0 )? ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:366:1: ( ( ( rule__Questionnaire__Group_3__0 )? ) )
            // InternalEduquizz.g:367:1: ( ( rule__Questionnaire__Group_3__0 )? )
            {
            // InternalEduquizz.g:367:1: ( ( rule__Questionnaire__Group_3__0 )? )
            // InternalEduquizz.g:368:2: ( rule__Questionnaire__Group_3__0 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_3()); 
            // InternalEduquizz.g:369:2: ( rule__Questionnaire__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEduquizz.g:369:3: rule__Questionnaire__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Questionnaire__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionnaireAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Questionnaire__Group__3__Impl"


    // $ANTLR start "rule__Questionnaire__Group__4"
    // InternalEduquizz.g:377:1: rule__Questionnaire__Group__4 : rule__Questionnaire__Group__4__Impl ;
    public final void rule__Questionnaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:381:1: ( rule__Questionnaire__Group__4__Impl )
            // InternalEduquizz.g:382:2: rule__Questionnaire__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__4__Impl();

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
    // $ANTLR end "rule__Questionnaire__Group__4"


    // $ANTLR start "rule__Questionnaire__Group__4__Impl"
    // InternalEduquizz.g:388:1: rule__Questionnaire__Group__4__Impl : ( ( ( rule__Questionnaire__QuestionAssignment_4 ) ) ( ( rule__Questionnaire__QuestionAssignment_4 )* ) ) ;
    public final void rule__Questionnaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:392:1: ( ( ( ( rule__Questionnaire__QuestionAssignment_4 ) ) ( ( rule__Questionnaire__QuestionAssignment_4 )* ) ) )
            // InternalEduquizz.g:393:1: ( ( ( rule__Questionnaire__QuestionAssignment_4 ) ) ( ( rule__Questionnaire__QuestionAssignment_4 )* ) )
            {
            // InternalEduquizz.g:393:1: ( ( ( rule__Questionnaire__QuestionAssignment_4 ) ) ( ( rule__Questionnaire__QuestionAssignment_4 )* ) )
            // InternalEduquizz.g:394:2: ( ( rule__Questionnaire__QuestionAssignment_4 ) ) ( ( rule__Questionnaire__QuestionAssignment_4 )* )
            {
            // InternalEduquizz.g:394:2: ( ( rule__Questionnaire__QuestionAssignment_4 ) )
            // InternalEduquizz.g:395:3: ( rule__Questionnaire__QuestionAssignment_4 )
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_4()); 
            // InternalEduquizz.g:396:3: ( rule__Questionnaire__QuestionAssignment_4 )
            // InternalEduquizz.g:396:4: rule__Questionnaire__QuestionAssignment_4
            {
            pushFollow(FOLLOW_4);
            rule__Questionnaire__QuestionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_4()); 

            }

            // InternalEduquizz.g:399:2: ( ( rule__Questionnaire__QuestionAssignment_4 )* )
            // InternalEduquizz.g:400:3: ( rule__Questionnaire__QuestionAssignment_4 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_4()); 
            // InternalEduquizz.g:401:3: ( rule__Questionnaire__QuestionAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEduquizz.g:401:4: rule__Questionnaire__QuestionAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Questionnaire__QuestionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_4()); 

            }


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
    // $ANTLR end "rule__Questionnaire__Group__4__Impl"


    // $ANTLR start "rule__Questionnaire__Group_2__0"
    // InternalEduquizz.g:411:1: rule__Questionnaire__Group_2__0 : rule__Questionnaire__Group_2__0__Impl rule__Questionnaire__Group_2__1 ;
    public final void rule__Questionnaire__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:415:1: ( rule__Questionnaire__Group_2__0__Impl rule__Questionnaire__Group_2__1 )
            // InternalEduquizz.g:416:2: rule__Questionnaire__Group_2__0__Impl rule__Questionnaire__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Questionnaire__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_2__1();

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
    // $ANTLR end "rule__Questionnaire__Group_2__0"


    // $ANTLR start "rule__Questionnaire__Group_2__0__Impl"
    // InternalEduquizz.g:423:1: rule__Questionnaire__Group_2__0__Impl : ( 'RetourAutoris\\u00E9' ) ;
    public final void rule__Questionnaire__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:427:1: ( ( 'RetourAutoris\\u00E9' ) )
            // InternalEduquizz.g:428:1: ( 'RetourAutoris\\u00E9' )
            {
            // InternalEduquizz.g:428:1: ( 'RetourAutoris\\u00E9' )
            // InternalEduquizz.g:429:2: 'RetourAutoris\\u00E9'
            {
             before(grammarAccess.getQuestionnaireAccess().getRetourAutorisKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getRetourAutorisKeyword_2_0()); 

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
    // $ANTLR end "rule__Questionnaire__Group_2__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group_2__1"
    // InternalEduquizz.g:438:1: rule__Questionnaire__Group_2__1 : rule__Questionnaire__Group_2__1__Impl ;
    public final void rule__Questionnaire__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:442:1: ( rule__Questionnaire__Group_2__1__Impl )
            // InternalEduquizz.g:443:2: rule__Questionnaire__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_2__1__Impl();

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
    // $ANTLR end "rule__Questionnaire__Group_2__1"


    // $ANTLR start "rule__Questionnaire__Group_2__1__Impl"
    // InternalEduquizz.g:449:1: rule__Questionnaire__Group_2__1__Impl : ( ( rule__Questionnaire__RetourAutoriseAssignment_2_1 ) ) ;
    public final void rule__Questionnaire__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:453:1: ( ( ( rule__Questionnaire__RetourAutoriseAssignment_2_1 ) ) )
            // InternalEduquizz.g:454:1: ( ( rule__Questionnaire__RetourAutoriseAssignment_2_1 ) )
            {
            // InternalEduquizz.g:454:1: ( ( rule__Questionnaire__RetourAutoriseAssignment_2_1 ) )
            // InternalEduquizz.g:455:2: ( rule__Questionnaire__RetourAutoriseAssignment_2_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getRetourAutoriseAssignment_2_1()); 
            // InternalEduquizz.g:456:2: ( rule__Questionnaire__RetourAutoriseAssignment_2_1 )
            // InternalEduquizz.g:456:3: rule__Questionnaire__RetourAutoriseAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__RetourAutoriseAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getRetourAutoriseAssignment_2_1()); 

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
    // $ANTLR end "rule__Questionnaire__Group_2__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group_3__0"
    // InternalEduquizz.g:465:1: rule__Questionnaire__Group_3__0 : rule__Questionnaire__Group_3__0__Impl rule__Questionnaire__Group_3__1 ;
    public final void rule__Questionnaire__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:469:1: ( rule__Questionnaire__Group_3__0__Impl rule__Questionnaire__Group_3__1 )
            // InternalEduquizz.g:470:2: rule__Questionnaire__Group_3__0__Impl rule__Questionnaire__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Questionnaire__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_3__1();

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
    // $ANTLR end "rule__Questionnaire__Group_3__0"


    // $ANTLR start "rule__Questionnaire__Group_3__0__Impl"
    // InternalEduquizz.g:477:1: rule__Questionnaire__Group_3__0__Impl : ( 'M\\u00E9langer' ) ;
    public final void rule__Questionnaire__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:481:1: ( ( 'M\\u00E9langer' ) )
            // InternalEduquizz.g:482:1: ( 'M\\u00E9langer' )
            {
            // InternalEduquizz.g:482:1: ( 'M\\u00E9langer' )
            // InternalEduquizz.g:483:2: 'M\\u00E9langer'
            {
             before(grammarAccess.getQuestionnaireAccess().getMLangerKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getMLangerKeyword_3_0()); 

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
    // $ANTLR end "rule__Questionnaire__Group_3__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group_3__1"
    // InternalEduquizz.g:492:1: rule__Questionnaire__Group_3__1 : rule__Questionnaire__Group_3__1__Impl ;
    public final void rule__Questionnaire__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:496:1: ( rule__Questionnaire__Group_3__1__Impl )
            // InternalEduquizz.g:497:2: rule__Questionnaire__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_3__1__Impl();

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
    // $ANTLR end "rule__Questionnaire__Group_3__1"


    // $ANTLR start "rule__Questionnaire__Group_3__1__Impl"
    // InternalEduquizz.g:503:1: rule__Questionnaire__Group_3__1__Impl : ( ( rule__Questionnaire__MelangeAssignment_3_1 ) ) ;
    public final void rule__Questionnaire__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:507:1: ( ( ( rule__Questionnaire__MelangeAssignment_3_1 ) ) )
            // InternalEduquizz.g:508:1: ( ( rule__Questionnaire__MelangeAssignment_3_1 ) )
            {
            // InternalEduquizz.g:508:1: ( ( rule__Questionnaire__MelangeAssignment_3_1 ) )
            // InternalEduquizz.g:509:2: ( rule__Questionnaire__MelangeAssignment_3_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeAssignment_3_1()); 
            // InternalEduquizz.g:510:2: ( rule__Questionnaire__MelangeAssignment_3_1 )
            // InternalEduquizz.g:510:3: rule__Questionnaire__MelangeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__MelangeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getMelangeAssignment_3_1()); 

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
    // $ANTLR end "rule__Questionnaire__Group_3__1__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalEduquizz.g:519:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:523:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalEduquizz.g:524:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

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
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalEduquizz.g:531:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:535:1: ( ( 'Question' ) )
            // InternalEduquizz.g:536:1: ( 'Question' )
            {
            // InternalEduquizz.g:536:1: ( 'Question' )
            // InternalEduquizz.g:537:2: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

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
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalEduquizz.g:546:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:550:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalEduquizz.g:551:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

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
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalEduquizz.g:558:1: rule__Question__Group__1__Impl : ( ( rule__Question__EnnonceAssignment_1 )? ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:562:1: ( ( ( rule__Question__EnnonceAssignment_1 )? ) )
            // InternalEduquizz.g:563:1: ( ( rule__Question__EnnonceAssignment_1 )? )
            {
            // InternalEduquizz.g:563:1: ( ( rule__Question__EnnonceAssignment_1 )? )
            // InternalEduquizz.g:564:2: ( rule__Question__EnnonceAssignment_1 )?
            {
             before(grammarAccess.getQuestionAccess().getEnnonceAssignment_1()); 
            // InternalEduquizz.g:565:2: ( rule__Question__EnnonceAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEduquizz.g:565:3: rule__Question__EnnonceAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__EnnonceAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getEnnonceAssignment_1()); 

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
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalEduquizz.g:573:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:577:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalEduquizz.g:578:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__3();

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
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalEduquizz.g:585:1: rule__Question__Group__2__Impl : ( ( rule__Question__ReponsesMultiplesAssignment_2 )? ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:589:1: ( ( ( rule__Question__ReponsesMultiplesAssignment_2 )? ) )
            // InternalEduquizz.g:590:1: ( ( rule__Question__ReponsesMultiplesAssignment_2 )? )
            {
            // InternalEduquizz.g:590:1: ( ( rule__Question__ReponsesMultiplesAssignment_2 )? )
            // InternalEduquizz.g:591:2: ( rule__Question__ReponsesMultiplesAssignment_2 )?
            {
             before(grammarAccess.getQuestionAccess().getReponsesMultiplesAssignment_2()); 
            // InternalEduquizz.g:592:2: ( rule__Question__ReponsesMultiplesAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEduquizz.g:592:3: rule__Question__ReponsesMultiplesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__ReponsesMultiplesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getReponsesMultiplesAssignment_2()); 

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
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // InternalEduquizz.g:600:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:604:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalEduquizz.g:605:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__4();

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
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // InternalEduquizz.g:612:1: rule__Question__Group__3__Impl : ( ( rule__Question__Group_3__0 )? ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:616:1: ( ( ( rule__Question__Group_3__0 )? ) )
            // InternalEduquizz.g:617:1: ( ( rule__Question__Group_3__0 )? )
            {
            // InternalEduquizz.g:617:1: ( ( rule__Question__Group_3__0 )? )
            // InternalEduquizz.g:618:2: ( rule__Question__Group_3__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_3()); 
            // InternalEduquizz.g:619:2: ( rule__Question__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEduquizz.g:619:3: rule__Question__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // InternalEduquizz.g:627:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:631:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // InternalEduquizz.g:632:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__5();

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
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // InternalEduquizz.g:639:1: rule__Question__Group__4__Impl : ( ( rule__Question__Group_4__0 )? ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:643:1: ( ( ( rule__Question__Group_4__0 )? ) )
            // InternalEduquizz.g:644:1: ( ( rule__Question__Group_4__0 )? )
            {
            // InternalEduquizz.g:644:1: ( ( rule__Question__Group_4__0 )? )
            // InternalEduquizz.g:645:2: ( rule__Question__Group_4__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_4()); 
            // InternalEduquizz.g:646:2: ( rule__Question__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEduquizz.g:646:3: rule__Question__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // InternalEduquizz.g:654:1: rule__Question__Group__5 : rule__Question__Group__5__Impl ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:658:1: ( rule__Question__Group__5__Impl )
            // InternalEduquizz.g:659:2: rule__Question__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__5__Impl();

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
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // InternalEduquizz.g:665:1: rule__Question__Group__5__Impl : ( ( ( rule__Question__ReponseAssignment_5 ) ) ( ( rule__Question__ReponseAssignment_5 )* ) ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:669:1: ( ( ( ( rule__Question__ReponseAssignment_5 ) ) ( ( rule__Question__ReponseAssignment_5 )* ) ) )
            // InternalEduquizz.g:670:1: ( ( ( rule__Question__ReponseAssignment_5 ) ) ( ( rule__Question__ReponseAssignment_5 )* ) )
            {
            // InternalEduquizz.g:670:1: ( ( ( rule__Question__ReponseAssignment_5 ) ) ( ( rule__Question__ReponseAssignment_5 )* ) )
            // InternalEduquizz.g:671:2: ( ( rule__Question__ReponseAssignment_5 ) ) ( ( rule__Question__ReponseAssignment_5 )* )
            {
            // InternalEduquizz.g:671:2: ( ( rule__Question__ReponseAssignment_5 ) )
            // InternalEduquizz.g:672:3: ( rule__Question__ReponseAssignment_5 )
            {
             before(grammarAccess.getQuestionAccess().getReponseAssignment_5()); 
            // InternalEduquizz.g:673:3: ( rule__Question__ReponseAssignment_5 )
            // InternalEduquizz.g:673:4: rule__Question__ReponseAssignment_5
            {
            pushFollow(FOLLOW_7);
            rule__Question__ReponseAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getReponseAssignment_5()); 

            }

            // InternalEduquizz.g:676:2: ( ( rule__Question__ReponseAssignment_5 )* )
            // InternalEduquizz.g:677:3: ( rule__Question__ReponseAssignment_5 )*
            {
             before(grammarAccess.getQuestionAccess().getReponseAssignment_5()); 
            // InternalEduquizz.g:678:3: ( rule__Question__ReponseAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEduquizz.g:678:4: rule__Question__ReponseAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Question__ReponseAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getReponseAssignment_5()); 

            }


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
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Question__Group_3__0"
    // InternalEduquizz.g:688:1: rule__Question__Group_3__0 : rule__Question__Group_3__0__Impl rule__Question__Group_3__1 ;
    public final void rule__Question__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:692:1: ( rule__Question__Group_3__0__Impl rule__Question__Group_3__1 )
            // InternalEduquizz.g:693:2: rule__Question__Group_3__0__Impl rule__Question__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Question__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_3__1();

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
    // $ANTLR end "rule__Question__Group_3__0"


    // $ANTLR start "rule__Question__Group_3__0__Impl"
    // InternalEduquizz.g:700:1: rule__Question__Group_3__0__Impl : ( 'Difficult\\u00E9' ) ;
    public final void rule__Question__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:704:1: ( ( 'Difficult\\u00E9' ) )
            // InternalEduquizz.g:705:1: ( 'Difficult\\u00E9' )
            {
            // InternalEduquizz.g:705:1: ( 'Difficult\\u00E9' )
            // InternalEduquizz.g:706:2: 'Difficult\\u00E9'
            {
             before(grammarAccess.getQuestionAccess().getDifficultKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getDifficultKeyword_3_0()); 

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
    // $ANTLR end "rule__Question__Group_3__0__Impl"


    // $ANTLR start "rule__Question__Group_3__1"
    // InternalEduquizz.g:715:1: rule__Question__Group_3__1 : rule__Question__Group_3__1__Impl ;
    public final void rule__Question__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:719:1: ( rule__Question__Group_3__1__Impl )
            // InternalEduquizz.g:720:2: rule__Question__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_3__1__Impl();

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
    // $ANTLR end "rule__Question__Group_3__1"


    // $ANTLR start "rule__Question__Group_3__1__Impl"
    // InternalEduquizz.g:726:1: rule__Question__Group_3__1__Impl : ( ( rule__Question__DifficulteAssignment_3_1 ) ) ;
    public final void rule__Question__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:730:1: ( ( ( rule__Question__DifficulteAssignment_3_1 ) ) )
            // InternalEduquizz.g:731:1: ( ( rule__Question__DifficulteAssignment_3_1 ) )
            {
            // InternalEduquizz.g:731:1: ( ( rule__Question__DifficulteAssignment_3_1 ) )
            // InternalEduquizz.g:732:2: ( rule__Question__DifficulteAssignment_3_1 )
            {
             before(grammarAccess.getQuestionAccess().getDifficulteAssignment_3_1()); 
            // InternalEduquizz.g:733:2: ( rule__Question__DifficulteAssignment_3_1 )
            // InternalEduquizz.g:733:3: rule__Question__DifficulteAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__DifficulteAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getDifficulteAssignment_3_1()); 

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
    // $ANTLR end "rule__Question__Group_3__1__Impl"


    // $ANTLR start "rule__Question__Group_4__0"
    // InternalEduquizz.g:742:1: rule__Question__Group_4__0 : rule__Question__Group_4__0__Impl rule__Question__Group_4__1 ;
    public final void rule__Question__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:746:1: ( rule__Question__Group_4__0__Impl rule__Question__Group_4__1 )
            // InternalEduquizz.g:747:2: rule__Question__Group_4__0__Impl rule__Question__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Question__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_4__1();

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
    // $ANTLR end "rule__Question__Group_4__0"


    // $ANTLR start "rule__Question__Group_4__0__Impl"
    // InternalEduquizz.g:754:1: rule__Question__Group_4__0__Impl : ( 'Etiquettes' ) ;
    public final void rule__Question__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:758:1: ( ( 'Etiquettes' ) )
            // InternalEduquizz.g:759:1: ( 'Etiquettes' )
            {
            // InternalEduquizz.g:759:1: ( 'Etiquettes' )
            // InternalEduquizz.g:760:2: 'Etiquettes'
            {
             before(grammarAccess.getQuestionAccess().getEtiquettesKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getEtiquettesKeyword_4_0()); 

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
    // $ANTLR end "rule__Question__Group_4__0__Impl"


    // $ANTLR start "rule__Question__Group_4__1"
    // InternalEduquizz.g:769:1: rule__Question__Group_4__1 : rule__Question__Group_4__1__Impl rule__Question__Group_4__2 ;
    public final void rule__Question__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:773:1: ( rule__Question__Group_4__1__Impl rule__Question__Group_4__2 )
            // InternalEduquizz.g:774:2: rule__Question__Group_4__1__Impl rule__Question__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Question__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_4__2();

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
    // $ANTLR end "rule__Question__Group_4__1"


    // $ANTLR start "rule__Question__Group_4__1__Impl"
    // InternalEduquizz.g:781:1: rule__Question__Group_4__1__Impl : ( ( rule__Question__EtiquetteAssignment_4_1 ) ) ;
    public final void rule__Question__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:785:1: ( ( ( rule__Question__EtiquetteAssignment_4_1 ) ) )
            // InternalEduquizz.g:786:1: ( ( rule__Question__EtiquetteAssignment_4_1 ) )
            {
            // InternalEduquizz.g:786:1: ( ( rule__Question__EtiquetteAssignment_4_1 ) )
            // InternalEduquizz.g:787:2: ( rule__Question__EtiquetteAssignment_4_1 )
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteAssignment_4_1()); 
            // InternalEduquizz.g:788:2: ( rule__Question__EtiquetteAssignment_4_1 )
            // InternalEduquizz.g:788:3: rule__Question__EtiquetteAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__EtiquetteAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getEtiquetteAssignment_4_1()); 

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
    // $ANTLR end "rule__Question__Group_4__1__Impl"


    // $ANTLR start "rule__Question__Group_4__2"
    // InternalEduquizz.g:796:1: rule__Question__Group_4__2 : rule__Question__Group_4__2__Impl ;
    public final void rule__Question__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:800:1: ( rule__Question__Group_4__2__Impl )
            // InternalEduquizz.g:801:2: rule__Question__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_4__2__Impl();

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
    // $ANTLR end "rule__Question__Group_4__2"


    // $ANTLR start "rule__Question__Group_4__2__Impl"
    // InternalEduquizz.g:807:1: rule__Question__Group_4__2__Impl : ( ( rule__Question__Group_4_2__0 )* ) ;
    public final void rule__Question__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:811:1: ( ( ( rule__Question__Group_4_2__0 )* ) )
            // InternalEduquizz.g:812:1: ( ( rule__Question__Group_4_2__0 )* )
            {
            // InternalEduquizz.g:812:1: ( ( rule__Question__Group_4_2__0 )* )
            // InternalEduquizz.g:813:2: ( rule__Question__Group_4_2__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_4_2()); 
            // InternalEduquizz.g:814:2: ( rule__Question__Group_4_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEduquizz.g:814:3: rule__Question__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Question__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__Question__Group_4__2__Impl"


    // $ANTLR start "rule__Question__Group_4_2__0"
    // InternalEduquizz.g:823:1: rule__Question__Group_4_2__0 : rule__Question__Group_4_2__0__Impl rule__Question__Group_4_2__1 ;
    public final void rule__Question__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:827:1: ( rule__Question__Group_4_2__0__Impl rule__Question__Group_4_2__1 )
            // InternalEduquizz.g:828:2: rule__Question__Group_4_2__0__Impl rule__Question__Group_4_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Question__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_4_2__1();

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
    // $ANTLR end "rule__Question__Group_4_2__0"


    // $ANTLR start "rule__Question__Group_4_2__0__Impl"
    // InternalEduquizz.g:835:1: rule__Question__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Question__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:839:1: ( ( ',' ) )
            // InternalEduquizz.g:840:1: ( ',' )
            {
            // InternalEduquizz.g:840:1: ( ',' )
            // InternalEduquizz.g:841:2: ','
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_4_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Question__Group_4_2__0__Impl"


    // $ANTLR start "rule__Question__Group_4_2__1"
    // InternalEduquizz.g:850:1: rule__Question__Group_4_2__1 : rule__Question__Group_4_2__1__Impl ;
    public final void rule__Question__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:854:1: ( rule__Question__Group_4_2__1__Impl )
            // InternalEduquizz.g:855:2: rule__Question__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Question__Group_4_2__1"


    // $ANTLR start "rule__Question__Group_4_2__1__Impl"
    // InternalEduquizz.g:861:1: rule__Question__Group_4_2__1__Impl : ( ( rule__Question__EtiquetteAssignment_4_2_1 ) ) ;
    public final void rule__Question__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:865:1: ( ( ( rule__Question__EtiquetteAssignment_4_2_1 ) ) )
            // InternalEduquizz.g:866:1: ( ( rule__Question__EtiquetteAssignment_4_2_1 ) )
            {
            // InternalEduquizz.g:866:1: ( ( rule__Question__EtiquetteAssignment_4_2_1 ) )
            // InternalEduquizz.g:867:2: ( rule__Question__EtiquetteAssignment_4_2_1 )
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteAssignment_4_2_1()); 
            // InternalEduquizz.g:868:2: ( rule__Question__EtiquetteAssignment_4_2_1 )
            // InternalEduquizz.g:868:3: rule__Question__EtiquetteAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__EtiquetteAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getEtiquetteAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Question__Group_4_2__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalEduquizz.g:877:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:881:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalEduquizz.g:882:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalEduquizz.g:889:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:893:1: ( ( ( '-' )? ) )
            // InternalEduquizz.g:894:1: ( ( '-' )? )
            {
            // InternalEduquizz.g:894:1: ( ( '-' )? )
            // InternalEduquizz.g:895:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalEduquizz.g:896:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEduquizz.g:896:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalEduquizz.g:904:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:908:1: ( rule__EInt__Group__1__Impl )
            // InternalEduquizz.g:909:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalEduquizz.g:915:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:919:1: ( ( RULE_INT ) )
            // InternalEduquizz.g:920:1: ( RULE_INT )
            {
            // InternalEduquizz.g:920:1: ( RULE_INT )
            // InternalEduquizz.g:921:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Etiquette__Group__0"
    // InternalEduquizz.g:931:1: rule__Etiquette__Group__0 : rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1 ;
    public final void rule__Etiquette__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:935:1: ( rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1 )
            // InternalEduquizz.g:936:2: rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Etiquette__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__1();

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
    // $ANTLR end "rule__Etiquette__Group__0"


    // $ANTLR start "rule__Etiquette__Group__0__Impl"
    // InternalEduquizz.g:943:1: rule__Etiquette__Group__0__Impl : ( () ) ;
    public final void rule__Etiquette__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:947:1: ( ( () ) )
            // InternalEduquizz.g:948:1: ( () )
            {
            // InternalEduquizz.g:948:1: ( () )
            // InternalEduquizz.g:949:2: ()
            {
             before(grammarAccess.getEtiquetteAccess().getEtiquetteAction_0()); 
            // InternalEduquizz.g:950:2: ()
            // InternalEduquizz.g:950:3: 
            {
            }

             after(grammarAccess.getEtiquetteAccess().getEtiquetteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Etiquette__Group__0__Impl"


    // $ANTLR start "rule__Etiquette__Group__1"
    // InternalEduquizz.g:958:1: rule__Etiquette__Group__1 : rule__Etiquette__Group__1__Impl ;
    public final void rule__Etiquette__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:962:1: ( rule__Etiquette__Group__1__Impl )
            // InternalEduquizz.g:963:2: rule__Etiquette__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__1__Impl();

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
    // $ANTLR end "rule__Etiquette__Group__1"


    // $ANTLR start "rule__Etiquette__Group__1__Impl"
    // InternalEduquizz.g:969:1: rule__Etiquette__Group__1__Impl : ( ( rule__Etiquette__NomAssignment_1 )? ) ;
    public final void rule__Etiquette__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:973:1: ( ( ( rule__Etiquette__NomAssignment_1 )? ) )
            // InternalEduquizz.g:974:1: ( ( rule__Etiquette__NomAssignment_1 )? )
            {
            // InternalEduquizz.g:974:1: ( ( rule__Etiquette__NomAssignment_1 )? )
            // InternalEduquizz.g:975:2: ( rule__Etiquette__NomAssignment_1 )?
            {
             before(grammarAccess.getEtiquetteAccess().getNomAssignment_1()); 
            // InternalEduquizz.g:976:2: ( rule__Etiquette__NomAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEduquizz.g:976:3: rule__Etiquette__NomAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Etiquette__NomAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEtiquetteAccess().getNomAssignment_1()); 

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
    // $ANTLR end "rule__Etiquette__Group__1__Impl"


    // $ANTLR start "rule__Reponse__Group__0"
    // InternalEduquizz.g:985:1: rule__Reponse__Group__0 : rule__Reponse__Group__0__Impl rule__Reponse__Group__1 ;
    public final void rule__Reponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:989:1: ( rule__Reponse__Group__0__Impl rule__Reponse__Group__1 )
            // InternalEduquizz.g:990:2: rule__Reponse__Group__0__Impl rule__Reponse__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Reponse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__1();

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
    // $ANTLR end "rule__Reponse__Group__0"


    // $ANTLR start "rule__Reponse__Group__0__Impl"
    // InternalEduquizz.g:997:1: rule__Reponse__Group__0__Impl : ( () ) ;
    public final void rule__Reponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1001:1: ( ( () ) )
            // InternalEduquizz.g:1002:1: ( () )
            {
            // InternalEduquizz.g:1002:1: ( () )
            // InternalEduquizz.g:1003:2: ()
            {
             before(grammarAccess.getReponseAccess().getReponseAction_0()); 
            // InternalEduquizz.g:1004:2: ()
            // InternalEduquizz.g:1004:3: 
            {
            }

             after(grammarAccess.getReponseAccess().getReponseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reponse__Group__0__Impl"


    // $ANTLR start "rule__Reponse__Group__1"
    // InternalEduquizz.g:1012:1: rule__Reponse__Group__1 : rule__Reponse__Group__1__Impl rule__Reponse__Group__2 ;
    public final void rule__Reponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1016:1: ( rule__Reponse__Group__1__Impl rule__Reponse__Group__2 )
            // InternalEduquizz.g:1017:2: rule__Reponse__Group__1__Impl rule__Reponse__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Reponse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__2();

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
    // $ANTLR end "rule__Reponse__Group__1"


    // $ANTLR start "rule__Reponse__Group__1__Impl"
    // InternalEduquizz.g:1024:1: rule__Reponse__Group__1__Impl : ( '[' ) ;
    public final void rule__Reponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1028:1: ( ( '[' ) )
            // InternalEduquizz.g:1029:1: ( '[' )
            {
            // InternalEduquizz.g:1029:1: ( '[' )
            // InternalEduquizz.g:1030:2: '['
            {
             before(grammarAccess.getReponseAccess().getLeftSquareBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__Reponse__Group__1__Impl"


    // $ANTLR start "rule__Reponse__Group__2"
    // InternalEduquizz.g:1039:1: rule__Reponse__Group__2 : rule__Reponse__Group__2__Impl rule__Reponse__Group__3 ;
    public final void rule__Reponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1043:1: ( rule__Reponse__Group__2__Impl rule__Reponse__Group__3 )
            // InternalEduquizz.g:1044:2: rule__Reponse__Group__2__Impl rule__Reponse__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Reponse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__3();

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
    // $ANTLR end "rule__Reponse__Group__2"


    // $ANTLR start "rule__Reponse__Group__2__Impl"
    // InternalEduquizz.g:1051:1: rule__Reponse__Group__2__Impl : ( ( rule__Reponse__EstVraieAssignment_2 )? ) ;
    public final void rule__Reponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1055:1: ( ( ( rule__Reponse__EstVraieAssignment_2 )? ) )
            // InternalEduquizz.g:1056:1: ( ( rule__Reponse__EstVraieAssignment_2 )? )
            {
            // InternalEduquizz.g:1056:1: ( ( rule__Reponse__EstVraieAssignment_2 )? )
            // InternalEduquizz.g:1057:2: ( rule__Reponse__EstVraieAssignment_2 )?
            {
             before(grammarAccess.getReponseAccess().getEstVraieAssignment_2()); 
            // InternalEduquizz.g:1058:2: ( rule__Reponse__EstVraieAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEduquizz.g:1058:3: rule__Reponse__EstVraieAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reponse__EstVraieAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReponseAccess().getEstVraieAssignment_2()); 

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
    // $ANTLR end "rule__Reponse__Group__2__Impl"


    // $ANTLR start "rule__Reponse__Group__3"
    // InternalEduquizz.g:1066:1: rule__Reponse__Group__3 : rule__Reponse__Group__3__Impl rule__Reponse__Group__4 ;
    public final void rule__Reponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1070:1: ( rule__Reponse__Group__3__Impl rule__Reponse__Group__4 )
            // InternalEduquizz.g:1071:2: rule__Reponse__Group__3__Impl rule__Reponse__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Reponse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__4();

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
    // $ANTLR end "rule__Reponse__Group__3"


    // $ANTLR start "rule__Reponse__Group__3__Impl"
    // InternalEduquizz.g:1078:1: rule__Reponse__Group__3__Impl : ( ']' ) ;
    public final void rule__Reponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1082:1: ( ( ']' ) )
            // InternalEduquizz.g:1083:1: ( ']' )
            {
            // InternalEduquizz.g:1083:1: ( ']' )
            // InternalEduquizz.g:1084:2: ']'
            {
             before(grammarAccess.getReponseAccess().getRightSquareBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Reponse__Group__3__Impl"


    // $ANTLR start "rule__Reponse__Group__4"
    // InternalEduquizz.g:1093:1: rule__Reponse__Group__4 : rule__Reponse__Group__4__Impl ;
    public final void rule__Reponse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1097:1: ( rule__Reponse__Group__4__Impl )
            // InternalEduquizz.g:1098:2: rule__Reponse__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group__4__Impl();

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
    // $ANTLR end "rule__Reponse__Group__4"


    // $ANTLR start "rule__Reponse__Group__4__Impl"
    // InternalEduquizz.g:1104:1: rule__Reponse__Group__4__Impl : ( ( rule__Reponse__TexteAssignment_4 )? ) ;
    public final void rule__Reponse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1108:1: ( ( ( rule__Reponse__TexteAssignment_4 )? ) )
            // InternalEduquizz.g:1109:1: ( ( rule__Reponse__TexteAssignment_4 )? )
            {
            // InternalEduquizz.g:1109:1: ( ( rule__Reponse__TexteAssignment_4 )? )
            // InternalEduquizz.g:1110:2: ( rule__Reponse__TexteAssignment_4 )?
            {
             before(grammarAccess.getReponseAccess().getTexteAssignment_4()); 
            // InternalEduquizz.g:1111:2: ( rule__Reponse__TexteAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEduquizz.g:1111:3: rule__Reponse__TexteAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reponse__TexteAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReponseAccess().getTexteAssignment_4()); 

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
    // $ANTLR end "rule__Reponse__Group__4__Impl"


    // $ANTLR start "rule__Questionnaire__NomAssignment_1"
    // InternalEduquizz.g:1120:1: rule__Questionnaire__NomAssignment_1 : ( ruleEString ) ;
    public final void rule__Questionnaire__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1124:1: ( ( ruleEString ) )
            // InternalEduquizz.g:1125:2: ( ruleEString )
            {
            // InternalEduquizz.g:1125:2: ( ruleEString )
            // InternalEduquizz.g:1126:3: ruleEString
            {
             before(grammarAccess.getQuestionnaireAccess().getNomEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getNomEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Questionnaire__NomAssignment_1"


    // $ANTLR start "rule__Questionnaire__RetourAutoriseAssignment_2_1"
    // InternalEduquizz.g:1135:1: rule__Questionnaire__RetourAutoriseAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__Questionnaire__RetourAutoriseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1139:1: ( ( ruleEBoolean ) )
            // InternalEduquizz.g:1140:2: ( ruleEBoolean )
            {
            // InternalEduquizz.g:1140:2: ( ruleEBoolean )
            // InternalEduquizz.g:1141:3: ruleEBoolean
            {
             before(grammarAccess.getQuestionnaireAccess().getRetourAutoriseEBooleanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getRetourAutoriseEBooleanParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Questionnaire__RetourAutoriseAssignment_2_1"


    // $ANTLR start "rule__Questionnaire__MelangeAssignment_3_1"
    // InternalEduquizz.g:1150:1: rule__Questionnaire__MelangeAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__Questionnaire__MelangeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1154:1: ( ( ruleEBoolean ) )
            // InternalEduquizz.g:1155:2: ( ruleEBoolean )
            {
            // InternalEduquizz.g:1155:2: ( ruleEBoolean )
            // InternalEduquizz.g:1156:3: ruleEBoolean
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getMelangeEBooleanParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Questionnaire__MelangeAssignment_3_1"


    // $ANTLR start "rule__Questionnaire__QuestionAssignment_4"
    // InternalEduquizz.g:1165:1: rule__Questionnaire__QuestionAssignment_4 : ( ruleQuestion ) ;
    public final void rule__Questionnaire__QuestionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1169:1: ( ( ruleQuestion ) )
            // InternalEduquizz.g:1170:2: ( ruleQuestion )
            {
            // InternalEduquizz.g:1170:2: ( ruleQuestion )
            // InternalEduquizz.g:1171:3: ruleQuestion
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Questionnaire__QuestionAssignment_4"


    // $ANTLR start "rule__Question__EnnonceAssignment_1"
    // InternalEduquizz.g:1180:1: rule__Question__EnnonceAssignment_1 : ( ruleEString ) ;
    public final void rule__Question__EnnonceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1184:1: ( ( ruleEString ) )
            // InternalEduquizz.g:1185:2: ( ruleEString )
            {
            // InternalEduquizz.g:1185:2: ( ruleEString )
            // InternalEduquizz.g:1186:3: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getEnnonceEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getEnnonceEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Question__EnnonceAssignment_1"


    // $ANTLR start "rule__Question__ReponsesMultiplesAssignment_2"
    // InternalEduquizz.g:1195:1: rule__Question__ReponsesMultiplesAssignment_2 : ( ( 'R\\u00E9ponsesMultiples' ) ) ;
    public final void rule__Question__ReponsesMultiplesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1199:1: ( ( ( 'R\\u00E9ponsesMultiples' ) ) )
            // InternalEduquizz.g:1200:2: ( ( 'R\\u00E9ponsesMultiples' ) )
            {
            // InternalEduquizz.g:1200:2: ( ( 'R\\u00E9ponsesMultiples' ) )
            // InternalEduquizz.g:1201:3: ( 'R\\u00E9ponsesMultiples' )
            {
             before(grammarAccess.getQuestionAccess().getReponsesMultiplesRPonsesMultiplesKeyword_2_0()); 
            // InternalEduquizz.g:1202:3: ( 'R\\u00E9ponsesMultiples' )
            // InternalEduquizz.g:1203:4: 'R\\u00E9ponsesMultiples'
            {
             before(grammarAccess.getQuestionAccess().getReponsesMultiplesRPonsesMultiplesKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getReponsesMultiplesRPonsesMultiplesKeyword_2_0()); 

            }

             after(grammarAccess.getQuestionAccess().getReponsesMultiplesRPonsesMultiplesKeyword_2_0()); 

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
    // $ANTLR end "rule__Question__ReponsesMultiplesAssignment_2"


    // $ANTLR start "rule__Question__DifficulteAssignment_3_1"
    // InternalEduquizz.g:1214:1: rule__Question__DifficulteAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Question__DifficulteAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1218:1: ( ( ruleEInt ) )
            // InternalEduquizz.g:1219:2: ( ruleEInt )
            {
            // InternalEduquizz.g:1219:2: ( ruleEInt )
            // InternalEduquizz.g:1220:3: ruleEInt
            {
             before(grammarAccess.getQuestionAccess().getDifficulteEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getDifficulteEIntParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Question__DifficulteAssignment_3_1"


    // $ANTLR start "rule__Question__EtiquetteAssignment_4_1"
    // InternalEduquizz.g:1229:1: rule__Question__EtiquetteAssignment_4_1 : ( ruleEtiquette ) ;
    public final void rule__Question__EtiquetteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1233:1: ( ( ruleEtiquette ) )
            // InternalEduquizz.g:1234:2: ( ruleEtiquette )
            {
            // InternalEduquizz.g:1234:2: ( ruleEtiquette )
            // InternalEduquizz.g:1235:3: ruleEtiquette
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEtiquette();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Question__EtiquetteAssignment_4_1"


    // $ANTLR start "rule__Question__EtiquetteAssignment_4_2_1"
    // InternalEduquizz.g:1244:1: rule__Question__EtiquetteAssignment_4_2_1 : ( ruleEtiquette ) ;
    public final void rule__Question__EtiquetteAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1248:1: ( ( ruleEtiquette ) )
            // InternalEduquizz.g:1249:2: ( ruleEtiquette )
            {
            // InternalEduquizz.g:1249:2: ( ruleEtiquette )
            // InternalEduquizz.g:1250:3: ruleEtiquette
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEtiquette();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__Question__EtiquetteAssignment_4_2_1"


    // $ANTLR start "rule__Question__ReponseAssignment_5"
    // InternalEduquizz.g:1259:1: rule__Question__ReponseAssignment_5 : ( ruleReponse ) ;
    public final void rule__Question__ReponseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1263:1: ( ( ruleReponse ) )
            // InternalEduquizz.g:1264:2: ( ruleReponse )
            {
            // InternalEduquizz.g:1264:2: ( ruleReponse )
            // InternalEduquizz.g:1265:3: ruleReponse
            {
             before(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Question__ReponseAssignment_5"


    // $ANTLR start "rule__Etiquette__NomAssignment_1"
    // InternalEduquizz.g:1274:1: rule__Etiquette__NomAssignment_1 : ( ruleEString ) ;
    public final void rule__Etiquette__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1278:1: ( ( ruleEString ) )
            // InternalEduquizz.g:1279:2: ( ruleEString )
            {
            // InternalEduquizz.g:1279:2: ( ruleEString )
            // InternalEduquizz.g:1280:3: ruleEString
            {
             before(grammarAccess.getEtiquetteAccess().getNomEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEtiquetteAccess().getNomEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Etiquette__NomAssignment_1"


    // $ANTLR start "rule__Reponse__EstVraieAssignment_2"
    // InternalEduquizz.g:1289:1: rule__Reponse__EstVraieAssignment_2 : ( ( 'x' ) ) ;
    public final void rule__Reponse__EstVraieAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1293:1: ( ( ( 'x' ) ) )
            // InternalEduquizz.g:1294:2: ( ( 'x' ) )
            {
            // InternalEduquizz.g:1294:2: ( ( 'x' ) )
            // InternalEduquizz.g:1295:3: ( 'x' )
            {
             before(grammarAccess.getReponseAccess().getEstVraieXKeyword_2_0()); 
            // InternalEduquizz.g:1296:3: ( 'x' )
            // InternalEduquizz.g:1297:4: 'x'
            {
             before(grammarAccess.getReponseAccess().getEstVraieXKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getEstVraieXKeyword_2_0()); 

            }

             after(grammarAccess.getReponseAccess().getEstVraieXKeyword_2_0()); 

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
    // $ANTLR end "rule__Reponse__EstVraieAssignment_2"


    // $ANTLR start "rule__Reponse__TexteAssignment_4"
    // InternalEduquizz.g:1308:1: rule__Reponse__TexteAssignment_4 : ( ruleEString ) ;
    public final void rule__Reponse__TexteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1312:1: ( ( ruleEString ) )
            // InternalEduquizz.g:1313:2: ( ruleEString )
            {
            // InternalEduquizz.g:1313:2: ( ruleEString )
            // InternalEduquizz.g:1314:3: ruleEString
            {
             before(grammarAccess.getReponseAccess().getTexteEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReponseAccess().getTexteEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Reponse__TexteAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001C030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001C032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000A60030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000A60032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001400000L});

}