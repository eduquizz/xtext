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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'true'", "'false'", "'Questionnaire'", "'{'", "'question'", "'}'", "'nom'", "'resultat'", "'retourAutorise'", "'melange'", "','", "'-'", "'.'", "'Question'", "'reponse'", "'ennonce'", "'difficulte'", "'etiquette'", "'('", "')'", "'Etiquette'", "'Reponse'", "'texte'", "'reponsesMultiples'", "'estVraie'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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


    // $ANTLR start "entryRuleEDouble"
    // InternalEduquizz.g:103:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalEduquizz.g:104:1: ( ruleEDouble EOF )
            // InternalEduquizz.g:105:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalEduquizz.g:112:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:116:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalEduquizz.g:117:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalEduquizz.g:117:2: ( ( rule__EDouble__Group__0 ) )
            // InternalEduquizz.g:118:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalEduquizz.g:119:3: ( rule__EDouble__Group__0 )
            // InternalEduquizz.g:119:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEBoolean"
    // InternalEduquizz.g:128:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalEduquizz.g:129:1: ( ruleEBoolean EOF )
            // InternalEduquizz.g:130:1: ruleEBoolean EOF
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
    // InternalEduquizz.g:137:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:141:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalEduquizz.g:142:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalEduquizz.g:142:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalEduquizz.g:143:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalEduquizz.g:144:3: ( rule__EBoolean__Alternatives )
            // InternalEduquizz.g:144:4: rule__EBoolean__Alternatives
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
    // InternalEduquizz.g:153:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalEduquizz.g:154:1: ( ruleQuestion EOF )
            // InternalEduquizz.g:155:1: ruleQuestion EOF
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
    // InternalEduquizz.g:162:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:166:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalEduquizz.g:167:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalEduquizz.g:167:2: ( ( rule__Question__Group__0 ) )
            // InternalEduquizz.g:168:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalEduquizz.g:169:3: ( rule__Question__Group__0 )
            // InternalEduquizz.g:169:4: rule__Question__Group__0
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
    // InternalEduquizz.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalEduquizz.g:179:1: ( ruleEInt EOF )
            // InternalEduquizz.g:180:1: ruleEInt EOF
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
    // InternalEduquizz.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalEduquizz.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalEduquizz.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalEduquizz.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalEduquizz.g:194:3: ( rule__EInt__Group__0 )
            // InternalEduquizz.g:194:4: rule__EInt__Group__0
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
    // InternalEduquizz.g:203:1: entryRuleEtiquette : ruleEtiquette EOF ;
    public final void entryRuleEtiquette() throws RecognitionException {
        try {
            // InternalEduquizz.g:204:1: ( ruleEtiquette EOF )
            // InternalEduquizz.g:205:1: ruleEtiquette EOF
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
    // InternalEduquizz.g:212:1: ruleEtiquette : ( ( rule__Etiquette__Group__0 ) ) ;
    public final void ruleEtiquette() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:216:2: ( ( ( rule__Etiquette__Group__0 ) ) )
            // InternalEduquizz.g:217:2: ( ( rule__Etiquette__Group__0 ) )
            {
            // InternalEduquizz.g:217:2: ( ( rule__Etiquette__Group__0 ) )
            // InternalEduquizz.g:218:3: ( rule__Etiquette__Group__0 )
            {
             before(grammarAccess.getEtiquetteAccess().getGroup()); 
            // InternalEduquizz.g:219:3: ( rule__Etiquette__Group__0 )
            // InternalEduquizz.g:219:4: rule__Etiquette__Group__0
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
    // InternalEduquizz.g:228:1: entryRuleReponse : ruleReponse EOF ;
    public final void entryRuleReponse() throws RecognitionException {
        try {
            // InternalEduquizz.g:229:1: ( ruleReponse EOF )
            // InternalEduquizz.g:230:1: ruleReponse EOF
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
    // InternalEduquizz.g:237:1: ruleReponse : ( ( rule__Reponse__Group__0 ) ) ;
    public final void ruleReponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:241:2: ( ( ( rule__Reponse__Group__0 ) ) )
            // InternalEduquizz.g:242:2: ( ( rule__Reponse__Group__0 ) )
            {
            // InternalEduquizz.g:242:2: ( ( rule__Reponse__Group__0 ) )
            // InternalEduquizz.g:243:3: ( rule__Reponse__Group__0 )
            {
             before(grammarAccess.getReponseAccess().getGroup()); 
            // InternalEduquizz.g:244:3: ( rule__Reponse__Group__0 )
            // InternalEduquizz.g:244:4: rule__Reponse__Group__0
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
    // InternalEduquizz.g:252:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:256:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalEduquizz.g:257:2: ( RULE_STRING )
                    {
                    // InternalEduquizz.g:257:2: ( RULE_STRING )
                    // InternalEduquizz.g:258:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduquizz.g:263:2: ( RULE_ID )
                    {
                    // InternalEduquizz.g:263:2: ( RULE_ID )
                    // InternalEduquizz.g:264:3: RULE_ID
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


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalEduquizz.g:273:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:277:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalEduquizz.g:278:2: ( 'E' )
                    {
                    // InternalEduquizz.g:278:2: ( 'E' )
                    // InternalEduquizz.g:279:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduquizz.g:284:2: ( 'e' )
                    {
                    // InternalEduquizz.g:284:2: ( 'e' )
                    // InternalEduquizz.g:285:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalEduquizz.g:294:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:298:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEduquizz.g:299:2: ( 'true' )
                    {
                    // InternalEduquizz.g:299:2: ( 'true' )
                    // InternalEduquizz.g:300:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduquizz.g:305:2: ( 'false' )
                    {
                    // InternalEduquizz.g:305:2: ( 'false' )
                    // InternalEduquizz.g:306:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalEduquizz.g:315:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:319:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // InternalEduquizz.g:320:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
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
    // InternalEduquizz.g:327:1: rule__Questionnaire__Group__0__Impl : ( 'Questionnaire' ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:331:1: ( ( 'Questionnaire' ) )
            // InternalEduquizz.g:332:1: ( 'Questionnaire' )
            {
            // InternalEduquizz.g:332:1: ( 'Questionnaire' )
            // InternalEduquizz.g:333:2: 'Questionnaire'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEduquizz.g:342:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:346:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // InternalEduquizz.g:347:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalEduquizz.g:354:1: rule__Questionnaire__Group__1__Impl : ( '{' ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:358:1: ( ( '{' ) )
            // InternalEduquizz.g:359:1: ( '{' )
            {
            // InternalEduquizz.g:359:1: ( '{' )
            // InternalEduquizz.g:360:2: '{'
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalEduquizz.g:369:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:373:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // InternalEduquizz.g:374:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalEduquizz.g:381:1: rule__Questionnaire__Group__2__Impl : ( ( rule__Questionnaire__Group_2__0 )? ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:385:1: ( ( ( rule__Questionnaire__Group_2__0 )? ) )
            // InternalEduquizz.g:386:1: ( ( rule__Questionnaire__Group_2__0 )? )
            {
            // InternalEduquizz.g:386:1: ( ( rule__Questionnaire__Group_2__0 )? )
            // InternalEduquizz.g:387:2: ( rule__Questionnaire__Group_2__0 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_2()); 
            // InternalEduquizz.g:388:2: ( rule__Questionnaire__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEduquizz.g:388:3: rule__Questionnaire__Group_2__0
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
    // InternalEduquizz.g:396:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:400:1: ( rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 )
            // InternalEduquizz.g:401:2: rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalEduquizz.g:408:1: rule__Questionnaire__Group__3__Impl : ( ( rule__Questionnaire__Group_3__0 )? ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:412:1: ( ( ( rule__Questionnaire__Group_3__0 )? ) )
            // InternalEduquizz.g:413:1: ( ( rule__Questionnaire__Group_3__0 )? )
            {
            // InternalEduquizz.g:413:1: ( ( rule__Questionnaire__Group_3__0 )? )
            // InternalEduquizz.g:414:2: ( rule__Questionnaire__Group_3__0 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_3()); 
            // InternalEduquizz.g:415:2: ( rule__Questionnaire__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEduquizz.g:415:3: rule__Questionnaire__Group_3__0
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
    // InternalEduquizz.g:423:1: rule__Questionnaire__Group__4 : rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 ;
    public final void rule__Questionnaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:427:1: ( rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 )
            // InternalEduquizz.g:428:2: rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Questionnaire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__5();

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
    // InternalEduquizz.g:435:1: rule__Questionnaire__Group__4__Impl : ( ( rule__Questionnaire__Group_4__0 )? ) ;
    public final void rule__Questionnaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:439:1: ( ( ( rule__Questionnaire__Group_4__0 )? ) )
            // InternalEduquizz.g:440:1: ( ( rule__Questionnaire__Group_4__0 )? )
            {
            // InternalEduquizz.g:440:1: ( ( rule__Questionnaire__Group_4__0 )? )
            // InternalEduquizz.g:441:2: ( rule__Questionnaire__Group_4__0 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_4()); 
            // InternalEduquizz.g:442:2: ( rule__Questionnaire__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEduquizz.g:442:3: rule__Questionnaire__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Questionnaire__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionnaireAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Questionnaire__Group__5"
    // InternalEduquizz.g:450:1: rule__Questionnaire__Group__5 : rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 ;
    public final void rule__Questionnaire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:454:1: ( rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 )
            // InternalEduquizz.g:455:2: rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Questionnaire__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__6();

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
    // $ANTLR end "rule__Questionnaire__Group__5"


    // $ANTLR start "rule__Questionnaire__Group__5__Impl"
    // InternalEduquizz.g:462:1: rule__Questionnaire__Group__5__Impl : ( ( rule__Questionnaire__Group_5__0 )? ) ;
    public final void rule__Questionnaire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:466:1: ( ( ( rule__Questionnaire__Group_5__0 )? ) )
            // InternalEduquizz.g:467:1: ( ( rule__Questionnaire__Group_5__0 )? )
            {
            // InternalEduquizz.g:467:1: ( ( rule__Questionnaire__Group_5__0 )? )
            // InternalEduquizz.g:468:2: ( rule__Questionnaire__Group_5__0 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_5()); 
            // InternalEduquizz.g:469:2: ( rule__Questionnaire__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEduquizz.g:469:3: rule__Questionnaire__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Questionnaire__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionnaireAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Questionnaire__Group__5__Impl"


    // $ANTLR start "rule__Questionnaire__Group__6"
    // InternalEduquizz.g:477:1: rule__Questionnaire__Group__6 : rule__Questionnaire__Group__6__Impl rule__Questionnaire__Group__7 ;
    public final void rule__Questionnaire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:481:1: ( rule__Questionnaire__Group__6__Impl rule__Questionnaire__Group__7 )
            // InternalEduquizz.g:482:2: rule__Questionnaire__Group__6__Impl rule__Questionnaire__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Questionnaire__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__7();

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
    // $ANTLR end "rule__Questionnaire__Group__6"


    // $ANTLR start "rule__Questionnaire__Group__6__Impl"
    // InternalEduquizz.g:489:1: rule__Questionnaire__Group__6__Impl : ( 'question' ) ;
    public final void rule__Questionnaire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:493:1: ( ( 'question' ) )
            // InternalEduquizz.g:494:1: ( 'question' )
            {
            // InternalEduquizz.g:494:1: ( 'question' )
            // InternalEduquizz.g:495:2: 'question'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getQuestionKeyword_6()); 

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
    // $ANTLR end "rule__Questionnaire__Group__6__Impl"


    // $ANTLR start "rule__Questionnaire__Group__7"
    // InternalEduquizz.g:504:1: rule__Questionnaire__Group__7 : rule__Questionnaire__Group__7__Impl rule__Questionnaire__Group__8 ;
    public final void rule__Questionnaire__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:508:1: ( rule__Questionnaire__Group__7__Impl rule__Questionnaire__Group__8 )
            // InternalEduquizz.g:509:2: rule__Questionnaire__Group__7__Impl rule__Questionnaire__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Questionnaire__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__8();

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
    // $ANTLR end "rule__Questionnaire__Group__7"


    // $ANTLR start "rule__Questionnaire__Group__7__Impl"
    // InternalEduquizz.g:516:1: rule__Questionnaire__Group__7__Impl : ( '{' ) ;
    public final void rule__Questionnaire__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:520:1: ( ( '{' ) )
            // InternalEduquizz.g:521:1: ( '{' )
            {
            // InternalEduquizz.g:521:1: ( '{' )
            // InternalEduquizz.g:522:2: '{'
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Questionnaire__Group__7__Impl"


    // $ANTLR start "rule__Questionnaire__Group__8"
    // InternalEduquizz.g:531:1: rule__Questionnaire__Group__8 : rule__Questionnaire__Group__8__Impl rule__Questionnaire__Group__9 ;
    public final void rule__Questionnaire__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:535:1: ( rule__Questionnaire__Group__8__Impl rule__Questionnaire__Group__9 )
            // InternalEduquizz.g:536:2: rule__Questionnaire__Group__8__Impl rule__Questionnaire__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Questionnaire__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__9();

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
    // $ANTLR end "rule__Questionnaire__Group__8"


    // $ANTLR start "rule__Questionnaire__Group__8__Impl"
    // InternalEduquizz.g:543:1: rule__Questionnaire__Group__8__Impl : ( ( rule__Questionnaire__QuestionAssignment_8 ) ) ;
    public final void rule__Questionnaire__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:547:1: ( ( ( rule__Questionnaire__QuestionAssignment_8 ) ) )
            // InternalEduquizz.g:548:1: ( ( rule__Questionnaire__QuestionAssignment_8 ) )
            {
            // InternalEduquizz.g:548:1: ( ( rule__Questionnaire__QuestionAssignment_8 ) )
            // InternalEduquizz.g:549:2: ( rule__Questionnaire__QuestionAssignment_8 )
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_8()); 
            // InternalEduquizz.g:550:2: ( rule__Questionnaire__QuestionAssignment_8 )
            // InternalEduquizz.g:550:3: rule__Questionnaire__QuestionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__QuestionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_8()); 

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
    // $ANTLR end "rule__Questionnaire__Group__8__Impl"


    // $ANTLR start "rule__Questionnaire__Group__9"
    // InternalEduquizz.g:558:1: rule__Questionnaire__Group__9 : rule__Questionnaire__Group__9__Impl rule__Questionnaire__Group__10 ;
    public final void rule__Questionnaire__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:562:1: ( rule__Questionnaire__Group__9__Impl rule__Questionnaire__Group__10 )
            // InternalEduquizz.g:563:2: rule__Questionnaire__Group__9__Impl rule__Questionnaire__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Questionnaire__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__10();

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
    // $ANTLR end "rule__Questionnaire__Group__9"


    // $ANTLR start "rule__Questionnaire__Group__9__Impl"
    // InternalEduquizz.g:570:1: rule__Questionnaire__Group__9__Impl : ( ( rule__Questionnaire__Group_9__0 )* ) ;
    public final void rule__Questionnaire__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:574:1: ( ( ( rule__Questionnaire__Group_9__0 )* ) )
            // InternalEduquizz.g:575:1: ( ( rule__Questionnaire__Group_9__0 )* )
            {
            // InternalEduquizz.g:575:1: ( ( rule__Questionnaire__Group_9__0 )* )
            // InternalEduquizz.g:576:2: ( rule__Questionnaire__Group_9__0 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_9()); 
            // InternalEduquizz.g:577:2: ( rule__Questionnaire__Group_9__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEduquizz.g:577:3: rule__Questionnaire__Group_9__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Questionnaire__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQuestionnaireAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Questionnaire__Group__9__Impl"


    // $ANTLR start "rule__Questionnaire__Group__10"
    // InternalEduquizz.g:585:1: rule__Questionnaire__Group__10 : rule__Questionnaire__Group__10__Impl rule__Questionnaire__Group__11 ;
    public final void rule__Questionnaire__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:589:1: ( rule__Questionnaire__Group__10__Impl rule__Questionnaire__Group__11 )
            // InternalEduquizz.g:590:2: rule__Questionnaire__Group__10__Impl rule__Questionnaire__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Questionnaire__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__11();

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
    // $ANTLR end "rule__Questionnaire__Group__10"


    // $ANTLR start "rule__Questionnaire__Group__10__Impl"
    // InternalEduquizz.g:597:1: rule__Questionnaire__Group__10__Impl : ( '}' ) ;
    public final void rule__Questionnaire__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:601:1: ( ( '}' ) )
            // InternalEduquizz.g:602:1: ( '}' )
            {
            // InternalEduquizz.g:602:1: ( '}' )
            // InternalEduquizz.g:603:2: '}'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Questionnaire__Group__10__Impl"


    // $ANTLR start "rule__Questionnaire__Group__11"
    // InternalEduquizz.g:612:1: rule__Questionnaire__Group__11 : rule__Questionnaire__Group__11__Impl ;
    public final void rule__Questionnaire__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:616:1: ( rule__Questionnaire__Group__11__Impl )
            // InternalEduquizz.g:617:2: rule__Questionnaire__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__11__Impl();

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
    // $ANTLR end "rule__Questionnaire__Group__11"


    // $ANTLR start "rule__Questionnaire__Group__11__Impl"
    // InternalEduquizz.g:623:1: rule__Questionnaire__Group__11__Impl : ( '}' ) ;
    public final void rule__Questionnaire__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:627:1: ( ( '}' ) )
            // InternalEduquizz.g:628:1: ( '}' )
            {
            // InternalEduquizz.g:628:1: ( '}' )
            // InternalEduquizz.g:629:2: '}'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Questionnaire__Group__11__Impl"


    // $ANTLR start "rule__Questionnaire__Group_2__0"
    // InternalEduquizz.g:639:1: rule__Questionnaire__Group_2__0 : rule__Questionnaire__Group_2__0__Impl rule__Questionnaire__Group_2__1 ;
    public final void rule__Questionnaire__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:643:1: ( rule__Questionnaire__Group_2__0__Impl rule__Questionnaire__Group_2__1 )
            // InternalEduquizz.g:644:2: rule__Questionnaire__Group_2__0__Impl rule__Questionnaire__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalEduquizz.g:651:1: rule__Questionnaire__Group_2__0__Impl : ( 'nom' ) ;
    public final void rule__Questionnaire__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:655:1: ( ( 'nom' ) )
            // InternalEduquizz.g:656:1: ( 'nom' )
            {
            // InternalEduquizz.g:656:1: ( 'nom' )
            // InternalEduquizz.g:657:2: 'nom'
            {
             before(grammarAccess.getQuestionnaireAccess().getNomKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getNomKeyword_2_0()); 

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
    // InternalEduquizz.g:666:1: rule__Questionnaire__Group_2__1 : rule__Questionnaire__Group_2__1__Impl ;
    public final void rule__Questionnaire__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:670:1: ( rule__Questionnaire__Group_2__1__Impl )
            // InternalEduquizz.g:671:2: rule__Questionnaire__Group_2__1__Impl
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
    // InternalEduquizz.g:677:1: rule__Questionnaire__Group_2__1__Impl : ( ( rule__Questionnaire__NomAssignment_2_1 ) ) ;
    public final void rule__Questionnaire__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:681:1: ( ( ( rule__Questionnaire__NomAssignment_2_1 ) ) )
            // InternalEduquizz.g:682:1: ( ( rule__Questionnaire__NomAssignment_2_1 ) )
            {
            // InternalEduquizz.g:682:1: ( ( rule__Questionnaire__NomAssignment_2_1 ) )
            // InternalEduquizz.g:683:2: ( rule__Questionnaire__NomAssignment_2_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getNomAssignment_2_1()); 
            // InternalEduquizz.g:684:2: ( rule__Questionnaire__NomAssignment_2_1 )
            // InternalEduquizz.g:684:3: rule__Questionnaire__NomAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__NomAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getNomAssignment_2_1()); 

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
    // InternalEduquizz.g:693:1: rule__Questionnaire__Group_3__0 : rule__Questionnaire__Group_3__0__Impl rule__Questionnaire__Group_3__1 ;
    public final void rule__Questionnaire__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:697:1: ( rule__Questionnaire__Group_3__0__Impl rule__Questionnaire__Group_3__1 )
            // InternalEduquizz.g:698:2: rule__Questionnaire__Group_3__0__Impl rule__Questionnaire__Group_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalEduquizz.g:705:1: rule__Questionnaire__Group_3__0__Impl : ( 'resultat' ) ;
    public final void rule__Questionnaire__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:709:1: ( ( 'resultat' ) )
            // InternalEduquizz.g:710:1: ( 'resultat' )
            {
            // InternalEduquizz.g:710:1: ( 'resultat' )
            // InternalEduquizz.g:711:2: 'resultat'
            {
             before(grammarAccess.getQuestionnaireAccess().getResultatKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getResultatKeyword_3_0()); 

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
    // InternalEduquizz.g:720:1: rule__Questionnaire__Group_3__1 : rule__Questionnaire__Group_3__1__Impl ;
    public final void rule__Questionnaire__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:724:1: ( rule__Questionnaire__Group_3__1__Impl )
            // InternalEduquizz.g:725:2: rule__Questionnaire__Group_3__1__Impl
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
    // InternalEduquizz.g:731:1: rule__Questionnaire__Group_3__1__Impl : ( ( rule__Questionnaire__ResultatAssignment_3_1 ) ) ;
    public final void rule__Questionnaire__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:735:1: ( ( ( rule__Questionnaire__ResultatAssignment_3_1 ) ) )
            // InternalEduquizz.g:736:1: ( ( rule__Questionnaire__ResultatAssignment_3_1 ) )
            {
            // InternalEduquizz.g:736:1: ( ( rule__Questionnaire__ResultatAssignment_3_1 ) )
            // InternalEduquizz.g:737:2: ( rule__Questionnaire__ResultatAssignment_3_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getResultatAssignment_3_1()); 
            // InternalEduquizz.g:738:2: ( rule__Questionnaire__ResultatAssignment_3_1 )
            // InternalEduquizz.g:738:3: rule__Questionnaire__ResultatAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__ResultatAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getResultatAssignment_3_1()); 

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


    // $ANTLR start "rule__Questionnaire__Group_4__0"
    // InternalEduquizz.g:747:1: rule__Questionnaire__Group_4__0 : rule__Questionnaire__Group_4__0__Impl rule__Questionnaire__Group_4__1 ;
    public final void rule__Questionnaire__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:751:1: ( rule__Questionnaire__Group_4__0__Impl rule__Questionnaire__Group_4__1 )
            // InternalEduquizz.g:752:2: rule__Questionnaire__Group_4__0__Impl rule__Questionnaire__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Questionnaire__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_4__1();

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
    // $ANTLR end "rule__Questionnaire__Group_4__0"


    // $ANTLR start "rule__Questionnaire__Group_4__0__Impl"
    // InternalEduquizz.g:759:1: rule__Questionnaire__Group_4__0__Impl : ( 'retourAutorise' ) ;
    public final void rule__Questionnaire__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:763:1: ( ( 'retourAutorise' ) )
            // InternalEduquizz.g:764:1: ( 'retourAutorise' )
            {
            // InternalEduquizz.g:764:1: ( 'retourAutorise' )
            // InternalEduquizz.g:765:2: 'retourAutorise'
            {
             before(grammarAccess.getQuestionnaireAccess().getRetourAutoriseKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getRetourAutoriseKeyword_4_0()); 

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
    // $ANTLR end "rule__Questionnaire__Group_4__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group_4__1"
    // InternalEduquizz.g:774:1: rule__Questionnaire__Group_4__1 : rule__Questionnaire__Group_4__1__Impl ;
    public final void rule__Questionnaire__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:778:1: ( rule__Questionnaire__Group_4__1__Impl )
            // InternalEduquizz.g:779:2: rule__Questionnaire__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_4__1__Impl();

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
    // $ANTLR end "rule__Questionnaire__Group_4__1"


    // $ANTLR start "rule__Questionnaire__Group_4__1__Impl"
    // InternalEduquizz.g:785:1: rule__Questionnaire__Group_4__1__Impl : ( ( rule__Questionnaire__RetourAutoriseAssignment_4_1 ) ) ;
    public final void rule__Questionnaire__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:789:1: ( ( ( rule__Questionnaire__RetourAutoriseAssignment_4_1 ) ) )
            // InternalEduquizz.g:790:1: ( ( rule__Questionnaire__RetourAutoriseAssignment_4_1 ) )
            {
            // InternalEduquizz.g:790:1: ( ( rule__Questionnaire__RetourAutoriseAssignment_4_1 ) )
            // InternalEduquizz.g:791:2: ( rule__Questionnaire__RetourAutoriseAssignment_4_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getRetourAutoriseAssignment_4_1()); 
            // InternalEduquizz.g:792:2: ( rule__Questionnaire__RetourAutoriseAssignment_4_1 )
            // InternalEduquizz.g:792:3: rule__Questionnaire__RetourAutoriseAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__RetourAutoriseAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getRetourAutoriseAssignment_4_1()); 

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
    // $ANTLR end "rule__Questionnaire__Group_4__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group_5__0"
    // InternalEduquizz.g:801:1: rule__Questionnaire__Group_5__0 : rule__Questionnaire__Group_5__0__Impl rule__Questionnaire__Group_5__1 ;
    public final void rule__Questionnaire__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:805:1: ( rule__Questionnaire__Group_5__0__Impl rule__Questionnaire__Group_5__1 )
            // InternalEduquizz.g:806:2: rule__Questionnaire__Group_5__0__Impl rule__Questionnaire__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Questionnaire__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_5__1();

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
    // $ANTLR end "rule__Questionnaire__Group_5__0"


    // $ANTLR start "rule__Questionnaire__Group_5__0__Impl"
    // InternalEduquizz.g:813:1: rule__Questionnaire__Group_5__0__Impl : ( 'melange' ) ;
    public final void rule__Questionnaire__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:817:1: ( ( 'melange' ) )
            // InternalEduquizz.g:818:1: ( 'melange' )
            {
            // InternalEduquizz.g:818:1: ( 'melange' )
            // InternalEduquizz.g:819:2: 'melange'
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getMelangeKeyword_5_0()); 

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
    // $ANTLR end "rule__Questionnaire__Group_5__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group_5__1"
    // InternalEduquizz.g:828:1: rule__Questionnaire__Group_5__1 : rule__Questionnaire__Group_5__1__Impl ;
    public final void rule__Questionnaire__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:832:1: ( rule__Questionnaire__Group_5__1__Impl )
            // InternalEduquizz.g:833:2: rule__Questionnaire__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_5__1__Impl();

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
    // $ANTLR end "rule__Questionnaire__Group_5__1"


    // $ANTLR start "rule__Questionnaire__Group_5__1__Impl"
    // InternalEduquizz.g:839:1: rule__Questionnaire__Group_5__1__Impl : ( ( rule__Questionnaire__MelangeAssignment_5_1 ) ) ;
    public final void rule__Questionnaire__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:843:1: ( ( ( rule__Questionnaire__MelangeAssignment_5_1 ) ) )
            // InternalEduquizz.g:844:1: ( ( rule__Questionnaire__MelangeAssignment_5_1 ) )
            {
            // InternalEduquizz.g:844:1: ( ( rule__Questionnaire__MelangeAssignment_5_1 ) )
            // InternalEduquizz.g:845:2: ( rule__Questionnaire__MelangeAssignment_5_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeAssignment_5_1()); 
            // InternalEduquizz.g:846:2: ( rule__Questionnaire__MelangeAssignment_5_1 )
            // InternalEduquizz.g:846:3: rule__Questionnaire__MelangeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__MelangeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getMelangeAssignment_5_1()); 

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
    // $ANTLR end "rule__Questionnaire__Group_5__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group_9__0"
    // InternalEduquizz.g:855:1: rule__Questionnaire__Group_9__0 : rule__Questionnaire__Group_9__0__Impl rule__Questionnaire__Group_9__1 ;
    public final void rule__Questionnaire__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:859:1: ( rule__Questionnaire__Group_9__0__Impl rule__Questionnaire__Group_9__1 )
            // InternalEduquizz.g:860:2: rule__Questionnaire__Group_9__0__Impl rule__Questionnaire__Group_9__1
            {
            pushFollow(FOLLOW_5);
            rule__Questionnaire__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_9__1();

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
    // $ANTLR end "rule__Questionnaire__Group_9__0"


    // $ANTLR start "rule__Questionnaire__Group_9__0__Impl"
    // InternalEduquizz.g:867:1: rule__Questionnaire__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Questionnaire__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:871:1: ( ( ',' ) )
            // InternalEduquizz.g:872:1: ( ',' )
            {
            // InternalEduquizz.g:872:1: ( ',' )
            // InternalEduquizz.g:873:2: ','
            {
             before(grammarAccess.getQuestionnaireAccess().getCommaKeyword_9_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__Questionnaire__Group_9__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group_9__1"
    // InternalEduquizz.g:882:1: rule__Questionnaire__Group_9__1 : rule__Questionnaire__Group_9__1__Impl ;
    public final void rule__Questionnaire__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:886:1: ( rule__Questionnaire__Group_9__1__Impl )
            // InternalEduquizz.g:887:2: rule__Questionnaire__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_9__1__Impl();

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
    // $ANTLR end "rule__Questionnaire__Group_9__1"


    // $ANTLR start "rule__Questionnaire__Group_9__1__Impl"
    // InternalEduquizz.g:893:1: rule__Questionnaire__Group_9__1__Impl : ( ( rule__Questionnaire__QuestionAssignment_9_1 ) ) ;
    public final void rule__Questionnaire__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:897:1: ( ( ( rule__Questionnaire__QuestionAssignment_9_1 ) ) )
            // InternalEduquizz.g:898:1: ( ( rule__Questionnaire__QuestionAssignment_9_1 ) )
            {
            // InternalEduquizz.g:898:1: ( ( rule__Questionnaire__QuestionAssignment_9_1 ) )
            // InternalEduquizz.g:899:2: ( rule__Questionnaire__QuestionAssignment_9_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_9_1()); 
            // InternalEduquizz.g:900:2: ( rule__Questionnaire__QuestionAssignment_9_1 )
            // InternalEduquizz.g:900:3: rule__Questionnaire__QuestionAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__QuestionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_9_1()); 

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
    // $ANTLR end "rule__Questionnaire__Group_9__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalEduquizz.g:909:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:913:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalEduquizz.g:914:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalEduquizz.g:921:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:925:1: ( ( ( '-' )? ) )
            // InternalEduquizz.g:926:1: ( ( '-' )? )
            {
            // InternalEduquizz.g:926:1: ( ( '-' )? )
            // InternalEduquizz.g:927:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalEduquizz.g:928:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEduquizz.g:928:3: '-'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalEduquizz.g:936:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:940:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalEduquizz.g:941:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalEduquizz.g:948:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:952:1: ( ( ( RULE_INT )? ) )
            // InternalEduquizz.g:953:1: ( ( RULE_INT )? )
            {
            // InternalEduquizz.g:953:1: ( ( RULE_INT )? )
            // InternalEduquizz.g:954:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalEduquizz.g:955:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEduquizz.g:955:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalEduquizz.g:963:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:967:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalEduquizz.g:968:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalEduquizz.g:975:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:979:1: ( ( '.' ) )
            // InternalEduquizz.g:980:1: ( '.' )
            {
            // InternalEduquizz.g:980:1: ( '.' )
            // InternalEduquizz.g:981:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalEduquizz.g:990:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:994:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalEduquizz.g:995:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalEduquizz.g:1002:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1006:1: ( ( RULE_INT ) )
            // InternalEduquizz.g:1007:1: ( RULE_INT )
            {
            // InternalEduquizz.g:1007:1: ( RULE_INT )
            // InternalEduquizz.g:1008:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalEduquizz.g:1017:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1021:1: ( rule__EDouble__Group__4__Impl )
            // InternalEduquizz.g:1022:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

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
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalEduquizz.g:1028:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1032:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalEduquizz.g:1033:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalEduquizz.g:1033:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalEduquizz.g:1034:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalEduquizz.g:1035:2: ( rule__EDouble__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEduquizz.g:1035:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalEduquizz.g:1044:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1048:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalEduquizz.g:1049:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

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
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalEduquizz.g:1056:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1060:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalEduquizz.g:1061:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalEduquizz.g:1061:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalEduquizz.g:1062:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalEduquizz.g:1063:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalEduquizz.g:1063:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalEduquizz.g:1071:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1075:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalEduquizz.g:1076:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

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
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalEduquizz.g:1083:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1087:1: ( ( ( '-' )? ) )
            // InternalEduquizz.g:1088:1: ( ( '-' )? )
            {
            // InternalEduquizz.g:1088:1: ( ( '-' )? )
            // InternalEduquizz.g:1089:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalEduquizz.g:1090:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEduquizz.g:1090:3: '-'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalEduquizz.g:1098:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1102:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalEduquizz.g:1103:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalEduquizz.g:1109:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1113:1: ( ( RULE_INT ) )
            // InternalEduquizz.g:1114:1: ( RULE_INT )
            {
            // InternalEduquizz.g:1114:1: ( RULE_INT )
            // InternalEduquizz.g:1115:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalEduquizz.g:1125:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1129:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalEduquizz.g:1130:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalEduquizz.g:1137:1: rule__Question__Group__0__Impl : ( ( rule__Question__ReponsesMultiplesAssignment_0 )? ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1141:1: ( ( ( rule__Question__ReponsesMultiplesAssignment_0 )? ) )
            // InternalEduquizz.g:1142:1: ( ( rule__Question__ReponsesMultiplesAssignment_0 )? )
            {
            // InternalEduquizz.g:1142:1: ( ( rule__Question__ReponsesMultiplesAssignment_0 )? )
            // InternalEduquizz.g:1143:2: ( rule__Question__ReponsesMultiplesAssignment_0 )?
            {
             before(grammarAccess.getQuestionAccess().getReponsesMultiplesAssignment_0()); 
            // InternalEduquizz.g:1144:2: ( rule__Question__ReponsesMultiplesAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEduquizz.g:1144:3: rule__Question__ReponsesMultiplesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__ReponsesMultiplesAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getReponsesMultiplesAssignment_0()); 

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
    // InternalEduquizz.g:1152:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1156:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalEduquizz.g:1157:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalEduquizz.g:1164:1: rule__Question__Group__1__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1168:1: ( ( 'Question' ) )
            // InternalEduquizz.g:1169:1: ( 'Question' )
            {
            // InternalEduquizz.g:1169:1: ( 'Question' )
            // InternalEduquizz.g:1170:2: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_1()); 

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
    // InternalEduquizz.g:1179:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1183:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalEduquizz.g:1184:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalEduquizz.g:1191:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1195:1: ( ( '{' ) )
            // InternalEduquizz.g:1196:1: ( '{' )
            {
            // InternalEduquizz.g:1196:1: ( '{' )
            // InternalEduquizz.g:1197:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalEduquizz.g:1206:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1210:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalEduquizz.g:1211:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalEduquizz.g:1218:1: rule__Question__Group__3__Impl : ( ( rule__Question__Group_3__0 )? ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1222:1: ( ( ( rule__Question__Group_3__0 )? ) )
            // InternalEduquizz.g:1223:1: ( ( rule__Question__Group_3__0 )? )
            {
            // InternalEduquizz.g:1223:1: ( ( rule__Question__Group_3__0 )? )
            // InternalEduquizz.g:1224:2: ( rule__Question__Group_3__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_3()); 
            // InternalEduquizz.g:1225:2: ( rule__Question__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEduquizz.g:1225:3: rule__Question__Group_3__0
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
    // InternalEduquizz.g:1233:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1237:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // InternalEduquizz.g:1238:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalEduquizz.g:1245:1: rule__Question__Group__4__Impl : ( ( rule__Question__Group_4__0 )? ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1249:1: ( ( ( rule__Question__Group_4__0 )? ) )
            // InternalEduquizz.g:1250:1: ( ( rule__Question__Group_4__0 )? )
            {
            // InternalEduquizz.g:1250:1: ( ( rule__Question__Group_4__0 )? )
            // InternalEduquizz.g:1251:2: ( rule__Question__Group_4__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_4()); 
            // InternalEduquizz.g:1252:2: ( rule__Question__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEduquizz.g:1252:3: rule__Question__Group_4__0
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
    // InternalEduquizz.g:1260:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1264:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // InternalEduquizz.g:1265:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__6();

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
    // InternalEduquizz.g:1272:1: rule__Question__Group__5__Impl : ( ( rule__Question__Group_5__0 )? ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1276:1: ( ( ( rule__Question__Group_5__0 )? ) )
            // InternalEduquizz.g:1277:1: ( ( rule__Question__Group_5__0 )? )
            {
            // InternalEduquizz.g:1277:1: ( ( rule__Question__Group_5__0 )? )
            // InternalEduquizz.g:1278:2: ( rule__Question__Group_5__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_5()); 
            // InternalEduquizz.g:1279:2: ( rule__Question__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEduquizz.g:1279:3: rule__Question__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_5()); 

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


    // $ANTLR start "rule__Question__Group__6"
    // InternalEduquizz.g:1287:1: rule__Question__Group__6 : rule__Question__Group__6__Impl rule__Question__Group__7 ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1291:1: ( rule__Question__Group__6__Impl rule__Question__Group__7 )
            // InternalEduquizz.g:1292:2: rule__Question__Group__6__Impl rule__Question__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Question__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__7();

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
    // $ANTLR end "rule__Question__Group__6"


    // $ANTLR start "rule__Question__Group__6__Impl"
    // InternalEduquizz.g:1299:1: rule__Question__Group__6__Impl : ( 'reponse' ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1303:1: ( ( 'reponse' ) )
            // InternalEduquizz.g:1304:1: ( 'reponse' )
            {
            // InternalEduquizz.g:1304:1: ( 'reponse' )
            // InternalEduquizz.g:1305:2: 'reponse'
            {
             before(grammarAccess.getQuestionAccess().getReponseKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getReponseKeyword_6()); 

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
    // $ANTLR end "rule__Question__Group__6__Impl"


    // $ANTLR start "rule__Question__Group__7"
    // InternalEduquizz.g:1314:1: rule__Question__Group__7 : rule__Question__Group__7__Impl rule__Question__Group__8 ;
    public final void rule__Question__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1318:1: ( rule__Question__Group__7__Impl rule__Question__Group__8 )
            // InternalEduquizz.g:1319:2: rule__Question__Group__7__Impl rule__Question__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Question__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__8();

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
    // $ANTLR end "rule__Question__Group__7"


    // $ANTLR start "rule__Question__Group__7__Impl"
    // InternalEduquizz.g:1326:1: rule__Question__Group__7__Impl : ( '{' ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1330:1: ( ( '{' ) )
            // InternalEduquizz.g:1331:1: ( '{' )
            {
            // InternalEduquizz.g:1331:1: ( '{' )
            // InternalEduquizz.g:1332:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Question__Group__7__Impl"


    // $ANTLR start "rule__Question__Group__8"
    // InternalEduquizz.g:1341:1: rule__Question__Group__8 : rule__Question__Group__8__Impl rule__Question__Group__9 ;
    public final void rule__Question__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1345:1: ( rule__Question__Group__8__Impl rule__Question__Group__9 )
            // InternalEduquizz.g:1346:2: rule__Question__Group__8__Impl rule__Question__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__9();

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
    // $ANTLR end "rule__Question__Group__8"


    // $ANTLR start "rule__Question__Group__8__Impl"
    // InternalEduquizz.g:1353:1: rule__Question__Group__8__Impl : ( ( rule__Question__ReponseAssignment_8 ) ) ;
    public final void rule__Question__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1357:1: ( ( ( rule__Question__ReponseAssignment_8 ) ) )
            // InternalEduquizz.g:1358:1: ( ( rule__Question__ReponseAssignment_8 ) )
            {
            // InternalEduquizz.g:1358:1: ( ( rule__Question__ReponseAssignment_8 ) )
            // InternalEduquizz.g:1359:2: ( rule__Question__ReponseAssignment_8 )
            {
             before(grammarAccess.getQuestionAccess().getReponseAssignment_8()); 
            // InternalEduquizz.g:1360:2: ( rule__Question__ReponseAssignment_8 )
            // InternalEduquizz.g:1360:3: rule__Question__ReponseAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Question__ReponseAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getReponseAssignment_8()); 

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
    // $ANTLR end "rule__Question__Group__8__Impl"


    // $ANTLR start "rule__Question__Group__9"
    // InternalEduquizz.g:1368:1: rule__Question__Group__9 : rule__Question__Group__9__Impl rule__Question__Group__10 ;
    public final void rule__Question__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1372:1: ( rule__Question__Group__9__Impl rule__Question__Group__10 )
            // InternalEduquizz.g:1373:2: rule__Question__Group__9__Impl rule__Question__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__10();

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
    // $ANTLR end "rule__Question__Group__9"


    // $ANTLR start "rule__Question__Group__9__Impl"
    // InternalEduquizz.g:1380:1: rule__Question__Group__9__Impl : ( ( rule__Question__Group_9__0 )* ) ;
    public final void rule__Question__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1384:1: ( ( ( rule__Question__Group_9__0 )* ) )
            // InternalEduquizz.g:1385:1: ( ( rule__Question__Group_9__0 )* )
            {
            // InternalEduquizz.g:1385:1: ( ( rule__Question__Group_9__0 )* )
            // InternalEduquizz.g:1386:2: ( rule__Question__Group_9__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_9()); 
            // InternalEduquizz.g:1387:2: ( rule__Question__Group_9__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEduquizz.g:1387:3: rule__Question__Group_9__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Question__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Question__Group__9__Impl"


    // $ANTLR start "rule__Question__Group__10"
    // InternalEduquizz.g:1395:1: rule__Question__Group__10 : rule__Question__Group__10__Impl rule__Question__Group__11 ;
    public final void rule__Question__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1399:1: ( rule__Question__Group__10__Impl rule__Question__Group__11 )
            // InternalEduquizz.g:1400:2: rule__Question__Group__10__Impl rule__Question__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Question__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__11();

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
    // $ANTLR end "rule__Question__Group__10"


    // $ANTLR start "rule__Question__Group__10__Impl"
    // InternalEduquizz.g:1407:1: rule__Question__Group__10__Impl : ( '}' ) ;
    public final void rule__Question__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1411:1: ( ( '}' ) )
            // InternalEduquizz.g:1412:1: ( '}' )
            {
            // InternalEduquizz.g:1412:1: ( '}' )
            // InternalEduquizz.g:1413:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Question__Group__10__Impl"


    // $ANTLR start "rule__Question__Group__11"
    // InternalEduquizz.g:1422:1: rule__Question__Group__11 : rule__Question__Group__11__Impl ;
    public final void rule__Question__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1426:1: ( rule__Question__Group__11__Impl )
            // InternalEduquizz.g:1427:2: rule__Question__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__11__Impl();

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
    // $ANTLR end "rule__Question__Group__11"


    // $ANTLR start "rule__Question__Group__11__Impl"
    // InternalEduquizz.g:1433:1: rule__Question__Group__11__Impl : ( '}' ) ;
    public final void rule__Question__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1437:1: ( ( '}' ) )
            // InternalEduquizz.g:1438:1: ( '}' )
            {
            // InternalEduquizz.g:1438:1: ( '}' )
            // InternalEduquizz.g:1439:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Question__Group__11__Impl"


    // $ANTLR start "rule__Question__Group_3__0"
    // InternalEduquizz.g:1449:1: rule__Question__Group_3__0 : rule__Question__Group_3__0__Impl rule__Question__Group_3__1 ;
    public final void rule__Question__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1453:1: ( rule__Question__Group_3__0__Impl rule__Question__Group_3__1 )
            // InternalEduquizz.g:1454:2: rule__Question__Group_3__0__Impl rule__Question__Group_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalEduquizz.g:1461:1: rule__Question__Group_3__0__Impl : ( 'ennonce' ) ;
    public final void rule__Question__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1465:1: ( ( 'ennonce' ) )
            // InternalEduquizz.g:1466:1: ( 'ennonce' )
            {
            // InternalEduquizz.g:1466:1: ( 'ennonce' )
            // InternalEduquizz.g:1467:2: 'ennonce'
            {
             before(grammarAccess.getQuestionAccess().getEnnonceKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getEnnonceKeyword_3_0()); 

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
    // InternalEduquizz.g:1476:1: rule__Question__Group_3__1 : rule__Question__Group_3__1__Impl ;
    public final void rule__Question__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1480:1: ( rule__Question__Group_3__1__Impl )
            // InternalEduquizz.g:1481:2: rule__Question__Group_3__1__Impl
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
    // InternalEduquizz.g:1487:1: rule__Question__Group_3__1__Impl : ( ( rule__Question__EnnonceAssignment_3_1 ) ) ;
    public final void rule__Question__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1491:1: ( ( ( rule__Question__EnnonceAssignment_3_1 ) ) )
            // InternalEduquizz.g:1492:1: ( ( rule__Question__EnnonceAssignment_3_1 ) )
            {
            // InternalEduquizz.g:1492:1: ( ( rule__Question__EnnonceAssignment_3_1 ) )
            // InternalEduquizz.g:1493:2: ( rule__Question__EnnonceAssignment_3_1 )
            {
             before(grammarAccess.getQuestionAccess().getEnnonceAssignment_3_1()); 
            // InternalEduquizz.g:1494:2: ( rule__Question__EnnonceAssignment_3_1 )
            // InternalEduquizz.g:1494:3: rule__Question__EnnonceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__EnnonceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getEnnonceAssignment_3_1()); 

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
    // InternalEduquizz.g:1503:1: rule__Question__Group_4__0 : rule__Question__Group_4__0__Impl rule__Question__Group_4__1 ;
    public final void rule__Question__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1507:1: ( rule__Question__Group_4__0__Impl rule__Question__Group_4__1 )
            // InternalEduquizz.g:1508:2: rule__Question__Group_4__0__Impl rule__Question__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalEduquizz.g:1515:1: rule__Question__Group_4__0__Impl : ( 'difficulte' ) ;
    public final void rule__Question__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1519:1: ( ( 'difficulte' ) )
            // InternalEduquizz.g:1520:1: ( 'difficulte' )
            {
            // InternalEduquizz.g:1520:1: ( 'difficulte' )
            // InternalEduquizz.g:1521:2: 'difficulte'
            {
             before(grammarAccess.getQuestionAccess().getDifficulteKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getDifficulteKeyword_4_0()); 

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
    // InternalEduquizz.g:1530:1: rule__Question__Group_4__1 : rule__Question__Group_4__1__Impl ;
    public final void rule__Question__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1534:1: ( rule__Question__Group_4__1__Impl )
            // InternalEduquizz.g:1535:2: rule__Question__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_4__1__Impl();

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
    // InternalEduquizz.g:1541:1: rule__Question__Group_4__1__Impl : ( ( rule__Question__DifficulteAssignment_4_1 ) ) ;
    public final void rule__Question__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1545:1: ( ( ( rule__Question__DifficulteAssignment_4_1 ) ) )
            // InternalEduquizz.g:1546:1: ( ( rule__Question__DifficulteAssignment_4_1 ) )
            {
            // InternalEduquizz.g:1546:1: ( ( rule__Question__DifficulteAssignment_4_1 ) )
            // InternalEduquizz.g:1547:2: ( rule__Question__DifficulteAssignment_4_1 )
            {
             before(grammarAccess.getQuestionAccess().getDifficulteAssignment_4_1()); 
            // InternalEduquizz.g:1548:2: ( rule__Question__DifficulteAssignment_4_1 )
            // InternalEduquizz.g:1548:3: rule__Question__DifficulteAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__DifficulteAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getDifficulteAssignment_4_1()); 

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


    // $ANTLR start "rule__Question__Group_5__0"
    // InternalEduquizz.g:1557:1: rule__Question__Group_5__0 : rule__Question__Group_5__0__Impl rule__Question__Group_5__1 ;
    public final void rule__Question__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1561:1: ( rule__Question__Group_5__0__Impl rule__Question__Group_5__1 )
            // InternalEduquizz.g:1562:2: rule__Question__Group_5__0__Impl rule__Question__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Question__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_5__1();

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
    // $ANTLR end "rule__Question__Group_5__0"


    // $ANTLR start "rule__Question__Group_5__0__Impl"
    // InternalEduquizz.g:1569:1: rule__Question__Group_5__0__Impl : ( 'etiquette' ) ;
    public final void rule__Question__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1573:1: ( ( 'etiquette' ) )
            // InternalEduquizz.g:1574:1: ( 'etiquette' )
            {
            // InternalEduquizz.g:1574:1: ( 'etiquette' )
            // InternalEduquizz.g:1575:2: 'etiquette'
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getEtiquetteKeyword_5_0()); 

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
    // $ANTLR end "rule__Question__Group_5__0__Impl"


    // $ANTLR start "rule__Question__Group_5__1"
    // InternalEduquizz.g:1584:1: rule__Question__Group_5__1 : rule__Question__Group_5__1__Impl rule__Question__Group_5__2 ;
    public final void rule__Question__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1588:1: ( rule__Question__Group_5__1__Impl rule__Question__Group_5__2 )
            // InternalEduquizz.g:1589:2: rule__Question__Group_5__1__Impl rule__Question__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__Question__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_5__2();

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
    // $ANTLR end "rule__Question__Group_5__1"


    // $ANTLR start "rule__Question__Group_5__1__Impl"
    // InternalEduquizz.g:1596:1: rule__Question__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Question__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1600:1: ( ( '(' ) )
            // InternalEduquizz.g:1601:1: ( '(' )
            {
            // InternalEduquizz.g:1601:1: ( '(' )
            // InternalEduquizz.g:1602:2: '('
            {
             before(grammarAccess.getQuestionAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__Question__Group_5__1__Impl"


    // $ANTLR start "rule__Question__Group_5__2"
    // InternalEduquizz.g:1611:1: rule__Question__Group_5__2 : rule__Question__Group_5__2__Impl rule__Question__Group_5__3 ;
    public final void rule__Question__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1615:1: ( rule__Question__Group_5__2__Impl rule__Question__Group_5__3 )
            // InternalEduquizz.g:1616:2: rule__Question__Group_5__2__Impl rule__Question__Group_5__3
            {
            pushFollow(FOLLOW_19);
            rule__Question__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_5__3();

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
    // $ANTLR end "rule__Question__Group_5__2"


    // $ANTLR start "rule__Question__Group_5__2__Impl"
    // InternalEduquizz.g:1623:1: rule__Question__Group_5__2__Impl : ( ( rule__Question__EtiquetteAssignment_5_2 ) ) ;
    public final void rule__Question__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1627:1: ( ( ( rule__Question__EtiquetteAssignment_5_2 ) ) )
            // InternalEduquizz.g:1628:1: ( ( rule__Question__EtiquetteAssignment_5_2 ) )
            {
            // InternalEduquizz.g:1628:1: ( ( rule__Question__EtiquetteAssignment_5_2 ) )
            // InternalEduquizz.g:1629:2: ( rule__Question__EtiquetteAssignment_5_2 )
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteAssignment_5_2()); 
            // InternalEduquizz.g:1630:2: ( rule__Question__EtiquetteAssignment_5_2 )
            // InternalEduquizz.g:1630:3: rule__Question__EtiquetteAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Question__EtiquetteAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getEtiquetteAssignment_5_2()); 

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
    // $ANTLR end "rule__Question__Group_5__2__Impl"


    // $ANTLR start "rule__Question__Group_5__3"
    // InternalEduquizz.g:1638:1: rule__Question__Group_5__3 : rule__Question__Group_5__3__Impl rule__Question__Group_5__4 ;
    public final void rule__Question__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1642:1: ( rule__Question__Group_5__3__Impl rule__Question__Group_5__4 )
            // InternalEduquizz.g:1643:2: rule__Question__Group_5__3__Impl rule__Question__Group_5__4
            {
            pushFollow(FOLLOW_19);
            rule__Question__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_5__4();

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
    // $ANTLR end "rule__Question__Group_5__3"


    // $ANTLR start "rule__Question__Group_5__3__Impl"
    // InternalEduquizz.g:1650:1: rule__Question__Group_5__3__Impl : ( ( rule__Question__Group_5_3__0 )* ) ;
    public final void rule__Question__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1654:1: ( ( ( rule__Question__Group_5_3__0 )* ) )
            // InternalEduquizz.g:1655:1: ( ( rule__Question__Group_5_3__0 )* )
            {
            // InternalEduquizz.g:1655:1: ( ( rule__Question__Group_5_3__0 )* )
            // InternalEduquizz.g:1656:2: ( rule__Question__Group_5_3__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_5_3()); 
            // InternalEduquizz.g:1657:2: ( rule__Question__Group_5_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEduquizz.g:1657:3: rule__Question__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Question__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Question__Group_5__3__Impl"


    // $ANTLR start "rule__Question__Group_5__4"
    // InternalEduquizz.g:1665:1: rule__Question__Group_5__4 : rule__Question__Group_5__4__Impl ;
    public final void rule__Question__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1669:1: ( rule__Question__Group_5__4__Impl )
            // InternalEduquizz.g:1670:2: rule__Question__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_5__4__Impl();

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
    // $ANTLR end "rule__Question__Group_5__4"


    // $ANTLR start "rule__Question__Group_5__4__Impl"
    // InternalEduquizz.g:1676:1: rule__Question__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Question__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1680:1: ( ( ')' ) )
            // InternalEduquizz.g:1681:1: ( ')' )
            {
            // InternalEduquizz.g:1681:1: ( ')' )
            // InternalEduquizz.g:1682:2: ')'
            {
             before(grammarAccess.getQuestionAccess().getRightParenthesisKeyword_5_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__Question__Group_5__4__Impl"


    // $ANTLR start "rule__Question__Group_5_3__0"
    // InternalEduquizz.g:1692:1: rule__Question__Group_5_3__0 : rule__Question__Group_5_3__0__Impl rule__Question__Group_5_3__1 ;
    public final void rule__Question__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1696:1: ( rule__Question__Group_5_3__0__Impl rule__Question__Group_5_3__1 )
            // InternalEduquizz.g:1697:2: rule__Question__Group_5_3__0__Impl rule__Question__Group_5_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Question__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_5_3__1();

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
    // $ANTLR end "rule__Question__Group_5_3__0"


    // $ANTLR start "rule__Question__Group_5_3__0__Impl"
    // InternalEduquizz.g:1704:1: rule__Question__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Question__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1708:1: ( ( ',' ) )
            // InternalEduquizz.g:1709:1: ( ',' )
            {
            // InternalEduquizz.g:1709:1: ( ',' )
            // InternalEduquizz.g:1710:2: ','
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_5_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Question__Group_5_3__0__Impl"


    // $ANTLR start "rule__Question__Group_5_3__1"
    // InternalEduquizz.g:1719:1: rule__Question__Group_5_3__1 : rule__Question__Group_5_3__1__Impl ;
    public final void rule__Question__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1723:1: ( rule__Question__Group_5_3__1__Impl )
            // InternalEduquizz.g:1724:2: rule__Question__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Question__Group_5_3__1"


    // $ANTLR start "rule__Question__Group_5_3__1__Impl"
    // InternalEduquizz.g:1730:1: rule__Question__Group_5_3__1__Impl : ( ( rule__Question__EtiquetteAssignment_5_3_1 ) ) ;
    public final void rule__Question__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1734:1: ( ( ( rule__Question__EtiquetteAssignment_5_3_1 ) ) )
            // InternalEduquizz.g:1735:1: ( ( rule__Question__EtiquetteAssignment_5_3_1 ) )
            {
            // InternalEduquizz.g:1735:1: ( ( rule__Question__EtiquetteAssignment_5_3_1 ) )
            // InternalEduquizz.g:1736:2: ( rule__Question__EtiquetteAssignment_5_3_1 )
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteAssignment_5_3_1()); 
            // InternalEduquizz.g:1737:2: ( rule__Question__EtiquetteAssignment_5_3_1 )
            // InternalEduquizz.g:1737:3: rule__Question__EtiquetteAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__EtiquetteAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getEtiquetteAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Question__Group_5_3__1__Impl"


    // $ANTLR start "rule__Question__Group_9__0"
    // InternalEduquizz.g:1746:1: rule__Question__Group_9__0 : rule__Question__Group_9__0__Impl rule__Question__Group_9__1 ;
    public final void rule__Question__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1750:1: ( rule__Question__Group_9__0__Impl rule__Question__Group_9__1 )
            // InternalEduquizz.g:1751:2: rule__Question__Group_9__0__Impl rule__Question__Group_9__1
            {
            pushFollow(FOLLOW_16);
            rule__Question__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_9__1();

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
    // $ANTLR end "rule__Question__Group_9__0"


    // $ANTLR start "rule__Question__Group_9__0__Impl"
    // InternalEduquizz.g:1758:1: rule__Question__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Question__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1762:1: ( ( ',' ) )
            // InternalEduquizz.g:1763:1: ( ',' )
            {
            // InternalEduquizz.g:1763:1: ( ',' )
            // InternalEduquizz.g:1764:2: ','
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_9_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__Question__Group_9__0__Impl"


    // $ANTLR start "rule__Question__Group_9__1"
    // InternalEduquizz.g:1773:1: rule__Question__Group_9__1 : rule__Question__Group_9__1__Impl ;
    public final void rule__Question__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1777:1: ( rule__Question__Group_9__1__Impl )
            // InternalEduquizz.g:1778:2: rule__Question__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_9__1__Impl();

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
    // $ANTLR end "rule__Question__Group_9__1"


    // $ANTLR start "rule__Question__Group_9__1__Impl"
    // InternalEduquizz.g:1784:1: rule__Question__Group_9__1__Impl : ( ( rule__Question__ReponseAssignment_9_1 ) ) ;
    public final void rule__Question__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1788:1: ( ( ( rule__Question__ReponseAssignment_9_1 ) ) )
            // InternalEduquizz.g:1789:1: ( ( rule__Question__ReponseAssignment_9_1 ) )
            {
            // InternalEduquizz.g:1789:1: ( ( rule__Question__ReponseAssignment_9_1 ) )
            // InternalEduquizz.g:1790:2: ( rule__Question__ReponseAssignment_9_1 )
            {
             before(grammarAccess.getQuestionAccess().getReponseAssignment_9_1()); 
            // InternalEduquizz.g:1791:2: ( rule__Question__ReponseAssignment_9_1 )
            // InternalEduquizz.g:1791:3: rule__Question__ReponseAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__ReponseAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getReponseAssignment_9_1()); 

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
    // $ANTLR end "rule__Question__Group_9__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalEduquizz.g:1800:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1804:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalEduquizz.g:1805:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalEduquizz.g:1812:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1816:1: ( ( ( '-' )? ) )
            // InternalEduquizz.g:1817:1: ( ( '-' )? )
            {
            // InternalEduquizz.g:1817:1: ( ( '-' )? )
            // InternalEduquizz.g:1818:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalEduquizz.g:1819:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEduquizz.g:1819:3: '-'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalEduquizz.g:1827:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1831:1: ( rule__EInt__Group__1__Impl )
            // InternalEduquizz.g:1832:2: rule__EInt__Group__1__Impl
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
    // InternalEduquizz.g:1838:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1842:1: ( ( RULE_INT ) )
            // InternalEduquizz.g:1843:1: ( RULE_INT )
            {
            // InternalEduquizz.g:1843:1: ( RULE_INT )
            // InternalEduquizz.g:1844:2: RULE_INT
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
    // InternalEduquizz.g:1854:1: rule__Etiquette__Group__0 : rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1 ;
    public final void rule__Etiquette__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1858:1: ( rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1 )
            // InternalEduquizz.g:1859:2: rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalEduquizz.g:1866:1: rule__Etiquette__Group__0__Impl : ( () ) ;
    public final void rule__Etiquette__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1870:1: ( ( () ) )
            // InternalEduquizz.g:1871:1: ( () )
            {
            // InternalEduquizz.g:1871:1: ( () )
            // InternalEduquizz.g:1872:2: ()
            {
             before(grammarAccess.getEtiquetteAccess().getEtiquetteAction_0()); 
            // InternalEduquizz.g:1873:2: ()
            // InternalEduquizz.g:1873:3: 
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
    // InternalEduquizz.g:1881:1: rule__Etiquette__Group__1 : rule__Etiquette__Group__1__Impl rule__Etiquette__Group__2 ;
    public final void rule__Etiquette__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1885:1: ( rule__Etiquette__Group__1__Impl rule__Etiquette__Group__2 )
            // InternalEduquizz.g:1886:2: rule__Etiquette__Group__1__Impl rule__Etiquette__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Etiquette__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__2();

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
    // InternalEduquizz.g:1893:1: rule__Etiquette__Group__1__Impl : ( 'Etiquette' ) ;
    public final void rule__Etiquette__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1897:1: ( ( 'Etiquette' ) )
            // InternalEduquizz.g:1898:1: ( 'Etiquette' )
            {
            // InternalEduquizz.g:1898:1: ( 'Etiquette' )
            // InternalEduquizz.g:1899:2: 'Etiquette'
            {
             before(grammarAccess.getEtiquetteAccess().getEtiquetteKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEtiquetteAccess().getEtiquetteKeyword_1()); 

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


    // $ANTLR start "rule__Etiquette__Group__2"
    // InternalEduquizz.g:1908:1: rule__Etiquette__Group__2 : rule__Etiquette__Group__2__Impl rule__Etiquette__Group__3 ;
    public final void rule__Etiquette__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1912:1: ( rule__Etiquette__Group__2__Impl rule__Etiquette__Group__3 )
            // InternalEduquizz.g:1913:2: rule__Etiquette__Group__2__Impl rule__Etiquette__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Etiquette__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__3();

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
    // $ANTLR end "rule__Etiquette__Group__2"


    // $ANTLR start "rule__Etiquette__Group__2__Impl"
    // InternalEduquizz.g:1920:1: rule__Etiquette__Group__2__Impl : ( '{' ) ;
    public final void rule__Etiquette__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1924:1: ( ( '{' ) )
            // InternalEduquizz.g:1925:1: ( '{' )
            {
            // InternalEduquizz.g:1925:1: ( '{' )
            // InternalEduquizz.g:1926:2: '{'
            {
             before(grammarAccess.getEtiquetteAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEtiquetteAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Etiquette__Group__2__Impl"


    // $ANTLR start "rule__Etiquette__Group__3"
    // InternalEduquizz.g:1935:1: rule__Etiquette__Group__3 : rule__Etiquette__Group__3__Impl rule__Etiquette__Group__4 ;
    public final void rule__Etiquette__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1939:1: ( rule__Etiquette__Group__3__Impl rule__Etiquette__Group__4 )
            // InternalEduquizz.g:1940:2: rule__Etiquette__Group__3__Impl rule__Etiquette__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Etiquette__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__4();

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
    // $ANTLR end "rule__Etiquette__Group__3"


    // $ANTLR start "rule__Etiquette__Group__3__Impl"
    // InternalEduquizz.g:1947:1: rule__Etiquette__Group__3__Impl : ( ( rule__Etiquette__Group_3__0 )? ) ;
    public final void rule__Etiquette__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1951:1: ( ( ( rule__Etiquette__Group_3__0 )? ) )
            // InternalEduquizz.g:1952:1: ( ( rule__Etiquette__Group_3__0 )? )
            {
            // InternalEduquizz.g:1952:1: ( ( rule__Etiquette__Group_3__0 )? )
            // InternalEduquizz.g:1953:2: ( rule__Etiquette__Group_3__0 )?
            {
             before(grammarAccess.getEtiquetteAccess().getGroup_3()); 
            // InternalEduquizz.g:1954:2: ( rule__Etiquette__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEduquizz.g:1954:3: rule__Etiquette__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Etiquette__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEtiquetteAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Etiquette__Group__3__Impl"


    // $ANTLR start "rule__Etiquette__Group__4"
    // InternalEduquizz.g:1962:1: rule__Etiquette__Group__4 : rule__Etiquette__Group__4__Impl ;
    public final void rule__Etiquette__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1966:1: ( rule__Etiquette__Group__4__Impl )
            // InternalEduquizz.g:1967:2: rule__Etiquette__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__4__Impl();

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
    // $ANTLR end "rule__Etiquette__Group__4"


    // $ANTLR start "rule__Etiquette__Group__4__Impl"
    // InternalEduquizz.g:1973:1: rule__Etiquette__Group__4__Impl : ( '}' ) ;
    public final void rule__Etiquette__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1977:1: ( ( '}' ) )
            // InternalEduquizz.g:1978:1: ( '}' )
            {
            // InternalEduquizz.g:1978:1: ( '}' )
            // InternalEduquizz.g:1979:2: '}'
            {
             before(grammarAccess.getEtiquetteAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEtiquetteAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Etiquette__Group__4__Impl"


    // $ANTLR start "rule__Etiquette__Group_3__0"
    // InternalEduquizz.g:1989:1: rule__Etiquette__Group_3__0 : rule__Etiquette__Group_3__0__Impl rule__Etiquette__Group_3__1 ;
    public final void rule__Etiquette__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:1993:1: ( rule__Etiquette__Group_3__0__Impl rule__Etiquette__Group_3__1 )
            // InternalEduquizz.g:1994:2: rule__Etiquette__Group_3__0__Impl rule__Etiquette__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Etiquette__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Etiquette__Group_3__1();

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
    // $ANTLR end "rule__Etiquette__Group_3__0"


    // $ANTLR start "rule__Etiquette__Group_3__0__Impl"
    // InternalEduquizz.g:2001:1: rule__Etiquette__Group_3__0__Impl : ( 'nom' ) ;
    public final void rule__Etiquette__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2005:1: ( ( 'nom' ) )
            // InternalEduquizz.g:2006:1: ( 'nom' )
            {
            // InternalEduquizz.g:2006:1: ( 'nom' )
            // InternalEduquizz.g:2007:2: 'nom'
            {
             before(grammarAccess.getEtiquetteAccess().getNomKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEtiquetteAccess().getNomKeyword_3_0()); 

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
    // $ANTLR end "rule__Etiquette__Group_3__0__Impl"


    // $ANTLR start "rule__Etiquette__Group_3__1"
    // InternalEduquizz.g:2016:1: rule__Etiquette__Group_3__1 : rule__Etiquette__Group_3__1__Impl ;
    public final void rule__Etiquette__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2020:1: ( rule__Etiquette__Group_3__1__Impl )
            // InternalEduquizz.g:2021:2: rule__Etiquette__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Etiquette__Group_3__1__Impl();

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
    // $ANTLR end "rule__Etiquette__Group_3__1"


    // $ANTLR start "rule__Etiquette__Group_3__1__Impl"
    // InternalEduquizz.g:2027:1: rule__Etiquette__Group_3__1__Impl : ( ( rule__Etiquette__NomAssignment_3_1 ) ) ;
    public final void rule__Etiquette__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2031:1: ( ( ( rule__Etiquette__NomAssignment_3_1 ) ) )
            // InternalEduquizz.g:2032:1: ( ( rule__Etiquette__NomAssignment_3_1 ) )
            {
            // InternalEduquizz.g:2032:1: ( ( rule__Etiquette__NomAssignment_3_1 ) )
            // InternalEduquizz.g:2033:2: ( rule__Etiquette__NomAssignment_3_1 )
            {
             before(grammarAccess.getEtiquetteAccess().getNomAssignment_3_1()); 
            // InternalEduquizz.g:2034:2: ( rule__Etiquette__NomAssignment_3_1 )
            // InternalEduquizz.g:2034:3: rule__Etiquette__NomAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Etiquette__NomAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEtiquetteAccess().getNomAssignment_3_1()); 

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
    // $ANTLR end "rule__Etiquette__Group_3__1__Impl"


    // $ANTLR start "rule__Reponse__Group__0"
    // InternalEduquizz.g:2043:1: rule__Reponse__Group__0 : rule__Reponse__Group__0__Impl rule__Reponse__Group__1 ;
    public final void rule__Reponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2047:1: ( rule__Reponse__Group__0__Impl rule__Reponse__Group__1 )
            // InternalEduquizz.g:2048:2: rule__Reponse__Group__0__Impl rule__Reponse__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalEduquizz.g:2055:1: rule__Reponse__Group__0__Impl : ( () ) ;
    public final void rule__Reponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2059:1: ( ( () ) )
            // InternalEduquizz.g:2060:1: ( () )
            {
            // InternalEduquizz.g:2060:1: ( () )
            // InternalEduquizz.g:2061:2: ()
            {
             before(grammarAccess.getReponseAccess().getReponseAction_0()); 
            // InternalEduquizz.g:2062:2: ()
            // InternalEduquizz.g:2062:3: 
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
    // InternalEduquizz.g:2070:1: rule__Reponse__Group__1 : rule__Reponse__Group__1__Impl rule__Reponse__Group__2 ;
    public final void rule__Reponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2074:1: ( rule__Reponse__Group__1__Impl rule__Reponse__Group__2 )
            // InternalEduquizz.g:2075:2: rule__Reponse__Group__1__Impl rule__Reponse__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalEduquizz.g:2082:1: rule__Reponse__Group__1__Impl : ( ( rule__Reponse__EstVraieAssignment_1 )? ) ;
    public final void rule__Reponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2086:1: ( ( ( rule__Reponse__EstVraieAssignment_1 )? ) )
            // InternalEduquizz.g:2087:1: ( ( rule__Reponse__EstVraieAssignment_1 )? )
            {
            // InternalEduquizz.g:2087:1: ( ( rule__Reponse__EstVraieAssignment_1 )? )
            // InternalEduquizz.g:2088:2: ( rule__Reponse__EstVraieAssignment_1 )?
            {
             before(grammarAccess.getReponseAccess().getEstVraieAssignment_1()); 
            // InternalEduquizz.g:2089:2: ( rule__Reponse__EstVraieAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEduquizz.g:2089:3: rule__Reponse__EstVraieAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reponse__EstVraieAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReponseAccess().getEstVraieAssignment_1()); 

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
    // InternalEduquizz.g:2097:1: rule__Reponse__Group__2 : rule__Reponse__Group__2__Impl rule__Reponse__Group__3 ;
    public final void rule__Reponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2101:1: ( rule__Reponse__Group__2__Impl rule__Reponse__Group__3 )
            // InternalEduquizz.g:2102:2: rule__Reponse__Group__2__Impl rule__Reponse__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalEduquizz.g:2109:1: rule__Reponse__Group__2__Impl : ( 'Reponse' ) ;
    public final void rule__Reponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2113:1: ( ( 'Reponse' ) )
            // InternalEduquizz.g:2114:1: ( 'Reponse' )
            {
            // InternalEduquizz.g:2114:1: ( 'Reponse' )
            // InternalEduquizz.g:2115:2: 'Reponse'
            {
             before(grammarAccess.getReponseAccess().getReponseKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getReponseKeyword_2()); 

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
    // InternalEduquizz.g:2124:1: rule__Reponse__Group__3 : rule__Reponse__Group__3__Impl rule__Reponse__Group__4 ;
    public final void rule__Reponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2128:1: ( rule__Reponse__Group__3__Impl rule__Reponse__Group__4 )
            // InternalEduquizz.g:2129:2: rule__Reponse__Group__3__Impl rule__Reponse__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalEduquizz.g:2136:1: rule__Reponse__Group__3__Impl : ( '{' ) ;
    public final void rule__Reponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2140:1: ( ( '{' ) )
            // InternalEduquizz.g:2141:1: ( '{' )
            {
            // InternalEduquizz.g:2141:1: ( '{' )
            // InternalEduquizz.g:2142:2: '{'
            {
             before(grammarAccess.getReponseAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalEduquizz.g:2151:1: rule__Reponse__Group__4 : rule__Reponse__Group__4__Impl rule__Reponse__Group__5 ;
    public final void rule__Reponse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2155:1: ( rule__Reponse__Group__4__Impl rule__Reponse__Group__5 )
            // InternalEduquizz.g:2156:2: rule__Reponse__Group__4__Impl rule__Reponse__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Reponse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__5();

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
    // InternalEduquizz.g:2163:1: rule__Reponse__Group__4__Impl : ( ( rule__Reponse__Group_4__0 )? ) ;
    public final void rule__Reponse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2167:1: ( ( ( rule__Reponse__Group_4__0 )? ) )
            // InternalEduquizz.g:2168:1: ( ( rule__Reponse__Group_4__0 )? )
            {
            // InternalEduquizz.g:2168:1: ( ( rule__Reponse__Group_4__0 )? )
            // InternalEduquizz.g:2169:2: ( rule__Reponse__Group_4__0 )?
            {
             before(grammarAccess.getReponseAccess().getGroup_4()); 
            // InternalEduquizz.g:2170:2: ( rule__Reponse__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEduquizz.g:2170:3: rule__Reponse__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reponse__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReponseAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Reponse__Group__5"
    // InternalEduquizz.g:2178:1: rule__Reponse__Group__5 : rule__Reponse__Group__5__Impl ;
    public final void rule__Reponse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2182:1: ( rule__Reponse__Group__5__Impl )
            // InternalEduquizz.g:2183:2: rule__Reponse__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group__5__Impl();

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
    // $ANTLR end "rule__Reponse__Group__5"


    // $ANTLR start "rule__Reponse__Group__5__Impl"
    // InternalEduquizz.g:2189:1: rule__Reponse__Group__5__Impl : ( '}' ) ;
    public final void rule__Reponse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2193:1: ( ( '}' ) )
            // InternalEduquizz.g:2194:1: ( '}' )
            {
            // InternalEduquizz.g:2194:1: ( '}' )
            // InternalEduquizz.g:2195:2: '}'
            {
             before(grammarAccess.getReponseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Reponse__Group__5__Impl"


    // $ANTLR start "rule__Reponse__Group_4__0"
    // InternalEduquizz.g:2205:1: rule__Reponse__Group_4__0 : rule__Reponse__Group_4__0__Impl rule__Reponse__Group_4__1 ;
    public final void rule__Reponse__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2209:1: ( rule__Reponse__Group_4__0__Impl rule__Reponse__Group_4__1 )
            // InternalEduquizz.g:2210:2: rule__Reponse__Group_4__0__Impl rule__Reponse__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Reponse__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group_4__1();

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
    // $ANTLR end "rule__Reponse__Group_4__0"


    // $ANTLR start "rule__Reponse__Group_4__0__Impl"
    // InternalEduquizz.g:2217:1: rule__Reponse__Group_4__0__Impl : ( 'texte' ) ;
    public final void rule__Reponse__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2221:1: ( ( 'texte' ) )
            // InternalEduquizz.g:2222:1: ( 'texte' )
            {
            // InternalEduquizz.g:2222:1: ( 'texte' )
            // InternalEduquizz.g:2223:2: 'texte'
            {
             before(grammarAccess.getReponseAccess().getTexteKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getTexteKeyword_4_0()); 

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
    // $ANTLR end "rule__Reponse__Group_4__0__Impl"


    // $ANTLR start "rule__Reponse__Group_4__1"
    // InternalEduquizz.g:2232:1: rule__Reponse__Group_4__1 : rule__Reponse__Group_4__1__Impl ;
    public final void rule__Reponse__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2236:1: ( rule__Reponse__Group_4__1__Impl )
            // InternalEduquizz.g:2237:2: rule__Reponse__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group_4__1__Impl();

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
    // $ANTLR end "rule__Reponse__Group_4__1"


    // $ANTLR start "rule__Reponse__Group_4__1__Impl"
    // InternalEduquizz.g:2243:1: rule__Reponse__Group_4__1__Impl : ( ( rule__Reponse__TexteAssignment_4_1 ) ) ;
    public final void rule__Reponse__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2247:1: ( ( ( rule__Reponse__TexteAssignment_4_1 ) ) )
            // InternalEduquizz.g:2248:1: ( ( rule__Reponse__TexteAssignment_4_1 ) )
            {
            // InternalEduquizz.g:2248:1: ( ( rule__Reponse__TexteAssignment_4_1 ) )
            // InternalEduquizz.g:2249:2: ( rule__Reponse__TexteAssignment_4_1 )
            {
             before(grammarAccess.getReponseAccess().getTexteAssignment_4_1()); 
            // InternalEduquizz.g:2250:2: ( rule__Reponse__TexteAssignment_4_1 )
            // InternalEduquizz.g:2250:3: rule__Reponse__TexteAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__TexteAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getTexteAssignment_4_1()); 

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
    // $ANTLR end "rule__Reponse__Group_4__1__Impl"


    // $ANTLR start "rule__Questionnaire__NomAssignment_2_1"
    // InternalEduquizz.g:2259:1: rule__Questionnaire__NomAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Questionnaire__NomAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2263:1: ( ( ruleEString ) )
            // InternalEduquizz.g:2264:2: ( ruleEString )
            {
            // InternalEduquizz.g:2264:2: ( ruleEString )
            // InternalEduquizz.g:2265:3: ruleEString
            {
             before(grammarAccess.getQuestionnaireAccess().getNomEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getNomEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Questionnaire__NomAssignment_2_1"


    // $ANTLR start "rule__Questionnaire__ResultatAssignment_3_1"
    // InternalEduquizz.g:2274:1: rule__Questionnaire__ResultatAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Questionnaire__ResultatAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2278:1: ( ( ruleEDouble ) )
            // InternalEduquizz.g:2279:2: ( ruleEDouble )
            {
            // InternalEduquizz.g:2279:2: ( ruleEDouble )
            // InternalEduquizz.g:2280:3: ruleEDouble
            {
             before(grammarAccess.getQuestionnaireAccess().getResultatEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getResultatEDoubleParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Questionnaire__ResultatAssignment_3_1"


    // $ANTLR start "rule__Questionnaire__RetourAutoriseAssignment_4_1"
    // InternalEduquizz.g:2289:1: rule__Questionnaire__RetourAutoriseAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__Questionnaire__RetourAutoriseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2293:1: ( ( ruleEBoolean ) )
            // InternalEduquizz.g:2294:2: ( ruleEBoolean )
            {
            // InternalEduquizz.g:2294:2: ( ruleEBoolean )
            // InternalEduquizz.g:2295:3: ruleEBoolean
            {
             before(grammarAccess.getQuestionnaireAccess().getRetourAutoriseEBooleanParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getRetourAutoriseEBooleanParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Questionnaire__RetourAutoriseAssignment_4_1"


    // $ANTLR start "rule__Questionnaire__MelangeAssignment_5_1"
    // InternalEduquizz.g:2304:1: rule__Questionnaire__MelangeAssignment_5_1 : ( ruleEBoolean ) ;
    public final void rule__Questionnaire__MelangeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2308:1: ( ( ruleEBoolean ) )
            // InternalEduquizz.g:2309:2: ( ruleEBoolean )
            {
            // InternalEduquizz.g:2309:2: ( ruleEBoolean )
            // InternalEduquizz.g:2310:3: ruleEBoolean
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeEBooleanParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getMelangeEBooleanParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Questionnaire__MelangeAssignment_5_1"


    // $ANTLR start "rule__Questionnaire__QuestionAssignment_8"
    // InternalEduquizz.g:2319:1: rule__Questionnaire__QuestionAssignment_8 : ( ruleQuestion ) ;
    public final void rule__Questionnaire__QuestionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2323:1: ( ( ruleQuestion ) )
            // InternalEduquizz.g:2324:2: ( ruleQuestion )
            {
            // InternalEduquizz.g:2324:2: ( ruleQuestion )
            // InternalEduquizz.g:2325:3: ruleQuestion
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Questionnaire__QuestionAssignment_8"


    // $ANTLR start "rule__Questionnaire__QuestionAssignment_9_1"
    // InternalEduquizz.g:2334:1: rule__Questionnaire__QuestionAssignment_9_1 : ( ruleQuestion ) ;
    public final void rule__Questionnaire__QuestionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2338:1: ( ( ruleQuestion ) )
            // InternalEduquizz.g:2339:2: ( ruleQuestion )
            {
            // InternalEduquizz.g:2339:2: ( ruleQuestion )
            // InternalEduquizz.g:2340:3: ruleQuestion
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Questionnaire__QuestionAssignment_9_1"


    // $ANTLR start "rule__Question__ReponsesMultiplesAssignment_0"
    // InternalEduquizz.g:2349:1: rule__Question__ReponsesMultiplesAssignment_0 : ( ( 'reponsesMultiples' ) ) ;
    public final void rule__Question__ReponsesMultiplesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2353:1: ( ( ( 'reponsesMultiples' ) ) )
            // InternalEduquizz.g:2354:2: ( ( 'reponsesMultiples' ) )
            {
            // InternalEduquizz.g:2354:2: ( ( 'reponsesMultiples' ) )
            // InternalEduquizz.g:2355:3: ( 'reponsesMultiples' )
            {
             before(grammarAccess.getQuestionAccess().getReponsesMultiplesReponsesMultiplesKeyword_0_0()); 
            // InternalEduquizz.g:2356:3: ( 'reponsesMultiples' )
            // InternalEduquizz.g:2357:4: 'reponsesMultiples'
            {
             before(grammarAccess.getQuestionAccess().getReponsesMultiplesReponsesMultiplesKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getReponsesMultiplesReponsesMultiplesKeyword_0_0()); 

            }

             after(grammarAccess.getQuestionAccess().getReponsesMultiplesReponsesMultiplesKeyword_0_0()); 

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
    // $ANTLR end "rule__Question__ReponsesMultiplesAssignment_0"


    // $ANTLR start "rule__Question__EnnonceAssignment_3_1"
    // InternalEduquizz.g:2368:1: rule__Question__EnnonceAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Question__EnnonceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2372:1: ( ( ruleEString ) )
            // InternalEduquizz.g:2373:2: ( ruleEString )
            {
            // InternalEduquizz.g:2373:2: ( ruleEString )
            // InternalEduquizz.g:2374:3: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getEnnonceEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getEnnonceEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Question__EnnonceAssignment_3_1"


    // $ANTLR start "rule__Question__DifficulteAssignment_4_1"
    // InternalEduquizz.g:2383:1: rule__Question__DifficulteAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Question__DifficulteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2387:1: ( ( ruleEInt ) )
            // InternalEduquizz.g:2388:2: ( ruleEInt )
            {
            // InternalEduquizz.g:2388:2: ( ruleEInt )
            // InternalEduquizz.g:2389:3: ruleEInt
            {
             before(grammarAccess.getQuestionAccess().getDifficulteEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getDifficulteEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Question__DifficulteAssignment_4_1"


    // $ANTLR start "rule__Question__EtiquetteAssignment_5_2"
    // InternalEduquizz.g:2398:1: rule__Question__EtiquetteAssignment_5_2 : ( ruleEtiquette ) ;
    public final void rule__Question__EtiquetteAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2402:1: ( ( ruleEtiquette ) )
            // InternalEduquizz.g:2403:2: ( ruleEtiquette )
            {
            // InternalEduquizz.g:2403:2: ( ruleEtiquette )
            // InternalEduquizz.g:2404:3: ruleEtiquette
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEtiquette();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Question__EtiquetteAssignment_5_2"


    // $ANTLR start "rule__Question__EtiquetteAssignment_5_3_1"
    // InternalEduquizz.g:2413:1: rule__Question__EtiquetteAssignment_5_3_1 : ( ruleEtiquette ) ;
    public final void rule__Question__EtiquetteAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2417:1: ( ( ruleEtiquette ) )
            // InternalEduquizz.g:2418:2: ( ruleEtiquette )
            {
            // InternalEduquizz.g:2418:2: ( ruleEtiquette )
            // InternalEduquizz.g:2419:3: ruleEtiquette
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEtiquette();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Question__EtiquetteAssignment_5_3_1"


    // $ANTLR start "rule__Question__ReponseAssignment_8"
    // InternalEduquizz.g:2428:1: rule__Question__ReponseAssignment_8 : ( ruleReponse ) ;
    public final void rule__Question__ReponseAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2432:1: ( ( ruleReponse ) )
            // InternalEduquizz.g:2433:2: ( ruleReponse )
            {
            // InternalEduquizz.g:2433:2: ( ruleReponse )
            // InternalEduquizz.g:2434:3: ruleReponse
            {
             before(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Question__ReponseAssignment_8"


    // $ANTLR start "rule__Question__ReponseAssignment_9_1"
    // InternalEduquizz.g:2443:1: rule__Question__ReponseAssignment_9_1 : ( ruleReponse ) ;
    public final void rule__Question__ReponseAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2447:1: ( ( ruleReponse ) )
            // InternalEduquizz.g:2448:2: ( ruleReponse )
            {
            // InternalEduquizz.g:2448:2: ( ruleReponse )
            // InternalEduquizz.g:2449:3: ruleReponse
            {
             before(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Question__ReponseAssignment_9_1"


    // $ANTLR start "rule__Etiquette__NomAssignment_3_1"
    // InternalEduquizz.g:2458:1: rule__Etiquette__NomAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Etiquette__NomAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2462:1: ( ( ruleEString ) )
            // InternalEduquizz.g:2463:2: ( ruleEString )
            {
            // InternalEduquizz.g:2463:2: ( ruleEString )
            // InternalEduquizz.g:2464:3: ruleEString
            {
             before(grammarAccess.getEtiquetteAccess().getNomEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEtiquetteAccess().getNomEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Etiquette__NomAssignment_3_1"


    // $ANTLR start "rule__Reponse__EstVraieAssignment_1"
    // InternalEduquizz.g:2473:1: rule__Reponse__EstVraieAssignment_1 : ( ( 'estVraie' ) ) ;
    public final void rule__Reponse__EstVraieAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2477:1: ( ( ( 'estVraie' ) ) )
            // InternalEduquizz.g:2478:2: ( ( 'estVraie' ) )
            {
            // InternalEduquizz.g:2478:2: ( ( 'estVraie' ) )
            // InternalEduquizz.g:2479:3: ( 'estVraie' )
            {
             before(grammarAccess.getReponseAccess().getEstVraieEstVraieKeyword_1_0()); 
            // InternalEduquizz.g:2480:3: ( 'estVraie' )
            // InternalEduquizz.g:2481:4: 'estVraie'
            {
             before(grammarAccess.getReponseAccess().getEstVraieEstVraieKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getEstVraieEstVraieKeyword_1_0()); 

            }

             after(grammarAccess.getReponseAccess().getEstVraieEstVraieKeyword_1_0()); 

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
    // $ANTLR end "rule__Reponse__EstVraieAssignment_1"


    // $ANTLR start "rule__Reponse__TexteAssignment_4_1"
    // InternalEduquizz.g:2492:1: rule__Reponse__TexteAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Reponse__TexteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduquizz.g:2496:1: ( ( ruleEString ) )
            // InternalEduquizz.g:2497:2: ( ruleEString )
            {
            // InternalEduquizz.g:2497:2: ( ruleEString )
            // InternalEduquizz.g:2498:3: ruleEString
            {
             before(grammarAccess.getReponseAccess().getTexteEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReponseAccess().getTexteEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Reponse__TexteAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000007A0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800040000L});

}