package xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.services.EduquizzGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEduquizzParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Questionnaire'", "'RetourAutoris\\u00E9'", "'M\\u00E9langer'", "'true'", "'false'", "'Question'", "'R\\u00E9ponsesMultiples'", "'Difficult\\u00E9'", "'Etiquettes'", "','", "'-'", "'['", "'x'", "']'"
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

        public InternalEduquizzParser(TokenStream input, EduquizzGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Questionnaire";
       	}

       	@Override
       	protected EduquizzGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQuestionnaire"
    // InternalEduquizz.g:64:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // InternalEduquizz.g:64:54: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // InternalEduquizz.g:65:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
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
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // InternalEduquizz.g:71:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'Questionnaire' ( (lv_nom_1_0= ruleEString ) )? (otherlv_2= 'RetourAutoris\\u00E9' ( (lv_retourAutorise_3_0= ruleEBoolean ) ) )? (otherlv_4= 'M\\u00E9langer' ( (lv_melange_5_0= ruleEBoolean ) ) )? ( (lv_question_6_0= ruleQuestion ) )+ ) ;
    public final EObject ruleQuestionnaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nom_1_0 = null;

        AntlrDatatypeRuleToken lv_retourAutorise_3_0 = null;

        AntlrDatatypeRuleToken lv_melange_5_0 = null;

        EObject lv_question_6_0 = null;



        	enterRule();

        try {
            // InternalEduquizz.g:77:2: ( (otherlv_0= 'Questionnaire' ( (lv_nom_1_0= ruleEString ) )? (otherlv_2= 'RetourAutoris\\u00E9' ( (lv_retourAutorise_3_0= ruleEBoolean ) ) )? (otherlv_4= 'M\\u00E9langer' ( (lv_melange_5_0= ruleEBoolean ) ) )? ( (lv_question_6_0= ruleQuestion ) )+ ) )
            // InternalEduquizz.g:78:2: (otherlv_0= 'Questionnaire' ( (lv_nom_1_0= ruleEString ) )? (otherlv_2= 'RetourAutoris\\u00E9' ( (lv_retourAutorise_3_0= ruleEBoolean ) ) )? (otherlv_4= 'M\\u00E9langer' ( (lv_melange_5_0= ruleEBoolean ) ) )? ( (lv_question_6_0= ruleQuestion ) )+ )
            {
            // InternalEduquizz.g:78:2: (otherlv_0= 'Questionnaire' ( (lv_nom_1_0= ruleEString ) )? (otherlv_2= 'RetourAutoris\\u00E9' ( (lv_retourAutorise_3_0= ruleEBoolean ) ) )? (otherlv_4= 'M\\u00E9langer' ( (lv_melange_5_0= ruleEBoolean ) ) )? ( (lv_question_6_0= ruleQuestion ) )+ )
            // InternalEduquizz.g:79:3: otherlv_0= 'Questionnaire' ( (lv_nom_1_0= ruleEString ) )? (otherlv_2= 'RetourAutoris\\u00E9' ( (lv_retourAutorise_3_0= ruleEBoolean ) ) )? (otherlv_4= 'M\\u00E9langer' ( (lv_melange_5_0= ruleEBoolean ) ) )? ( (lv_question_6_0= ruleQuestion ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
            		
            // InternalEduquizz.g:83:3: ( (lv_nom_1_0= ruleEString ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEduquizz.g:84:4: (lv_nom_1_0= ruleEString )
                    {
                    // InternalEduquizz.g:84:4: (lv_nom_1_0= ruleEString )
                    // InternalEduquizz.g:85:5: lv_nom_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getQuestionnaireAccess().getNomEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_nom_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
                    					}
                    					set(
                    						current,
                    						"nom",
                    						lv_nom_1_0,
                    						"xtext.Eduquizz.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEduquizz.g:102:3: (otherlv_2= 'RetourAutoris\\u00E9' ( (lv_retourAutorise_3_0= ruleEBoolean ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEduquizz.g:103:4: otherlv_2= 'RetourAutoris\\u00E9' ( (lv_retourAutorise_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getRetourAutorisKeyword_2_0());
                    			
                    // InternalEduquizz.g:107:4: ( (lv_retourAutorise_3_0= ruleEBoolean ) )
                    // InternalEduquizz.g:108:5: (lv_retourAutorise_3_0= ruleEBoolean )
                    {
                    // InternalEduquizz.g:108:5: (lv_retourAutorise_3_0= ruleEBoolean )
                    // InternalEduquizz.g:109:6: lv_retourAutorise_3_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getQuestionnaireAccess().getRetourAutoriseEBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_retourAutorise_3_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
                    						}
                    						set(
                    							current,
                    							"retourAutorise",
                    							lv_retourAutorise_3_0,
                    							"xtext.Eduquizz.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEduquizz.g:127:3: (otherlv_4= 'M\\u00E9langer' ( (lv_melange_5_0= ruleEBoolean ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEduquizz.g:128:4: otherlv_4= 'M\\u00E9langer' ( (lv_melange_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getMLangerKeyword_3_0());
                    			
                    // InternalEduquizz.g:132:4: ( (lv_melange_5_0= ruleEBoolean ) )
                    // InternalEduquizz.g:133:5: (lv_melange_5_0= ruleEBoolean )
                    {
                    // InternalEduquizz.g:133:5: (lv_melange_5_0= ruleEBoolean )
                    // InternalEduquizz.g:134:6: lv_melange_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getQuestionnaireAccess().getMelangeEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_melange_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
                    						}
                    						set(
                    							current,
                    							"melange",
                    							lv_melange_5_0,
                    							"xtext.Eduquizz.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEduquizz.g:152:3: ( (lv_question_6_0= ruleQuestion ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEduquizz.g:153:4: (lv_question_6_0= ruleQuestion )
            	    {
            	    // InternalEduquizz.g:153:4: (lv_question_6_0= ruleQuestion )
            	    // InternalEduquizz.g:154:5: lv_question_6_0= ruleQuestion
            	    {

            	    					newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_question_6_0=ruleQuestion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	    					}
            	    					add(
            	    						current,
            	    						"question",
            	    						lv_question_6_0,
            	    						"xtext.Eduquizz.Question");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleEString"
    // InternalEduquizz.g:175:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEduquizz.g:175:47: (iv_ruleEString= ruleEString EOF )
            // InternalEduquizz.g:176:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEduquizz.g:182:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEduquizz.g:188:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEduquizz.g:189:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEduquizz.g:189:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEduquizz.g:190:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEduquizz.g:198:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalEduquizz.g:209:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalEduquizz.g:209:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalEduquizz.g:210:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalEduquizz.g:216:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEduquizz.g:222:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalEduquizz.g:223:2: (kw= 'true' | kw= 'false' )
            {
            // InternalEduquizz.g:223:2: (kw= 'true' | kw= 'false' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEduquizz.g:224:3: kw= 'true'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEduquizz.g:230:3: kw= 'false'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleQuestion"
    // InternalEduquizz.g:239:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalEduquizz.g:239:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalEduquizz.g:240:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalEduquizz.g:246:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_ennonce_1_0= ruleEString ) )? ( (lv_reponsesMultiples_2_0= 'R\\u00E9ponsesMultiples' ) )? (otherlv_3= 'Difficult\\u00E9' ( (lv_difficulte_4_0= ruleEInt ) ) )? (otherlv_5= 'Etiquettes' ( (lv_etiquette_6_0= ruleEtiquette ) ) (otherlv_7= ',' ( (lv_etiquette_8_0= ruleEtiquette ) ) )* )? ( (lv_reponse_9_0= ruleReponse ) )+ ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reponsesMultiples_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_ennonce_1_0 = null;

        AntlrDatatypeRuleToken lv_difficulte_4_0 = null;

        EObject lv_etiquette_6_0 = null;

        EObject lv_etiquette_8_0 = null;

        EObject lv_reponse_9_0 = null;



        	enterRule();

        try {
            // InternalEduquizz.g:252:2: ( (otherlv_0= 'Question' ( (lv_ennonce_1_0= ruleEString ) )? ( (lv_reponsesMultiples_2_0= 'R\\u00E9ponsesMultiples' ) )? (otherlv_3= 'Difficult\\u00E9' ( (lv_difficulte_4_0= ruleEInt ) ) )? (otherlv_5= 'Etiquettes' ( (lv_etiquette_6_0= ruleEtiquette ) ) (otherlv_7= ',' ( (lv_etiquette_8_0= ruleEtiquette ) ) )* )? ( (lv_reponse_9_0= ruleReponse ) )+ ) )
            // InternalEduquizz.g:253:2: (otherlv_0= 'Question' ( (lv_ennonce_1_0= ruleEString ) )? ( (lv_reponsesMultiples_2_0= 'R\\u00E9ponsesMultiples' ) )? (otherlv_3= 'Difficult\\u00E9' ( (lv_difficulte_4_0= ruleEInt ) ) )? (otherlv_5= 'Etiquettes' ( (lv_etiquette_6_0= ruleEtiquette ) ) (otherlv_7= ',' ( (lv_etiquette_8_0= ruleEtiquette ) ) )* )? ( (lv_reponse_9_0= ruleReponse ) )+ )
            {
            // InternalEduquizz.g:253:2: (otherlv_0= 'Question' ( (lv_ennonce_1_0= ruleEString ) )? ( (lv_reponsesMultiples_2_0= 'R\\u00E9ponsesMultiples' ) )? (otherlv_3= 'Difficult\\u00E9' ( (lv_difficulte_4_0= ruleEInt ) ) )? (otherlv_5= 'Etiquettes' ( (lv_etiquette_6_0= ruleEtiquette ) ) (otherlv_7= ',' ( (lv_etiquette_8_0= ruleEtiquette ) ) )* )? ( (lv_reponse_9_0= ruleReponse ) )+ )
            // InternalEduquizz.g:254:3: otherlv_0= 'Question' ( (lv_ennonce_1_0= ruleEString ) )? ( (lv_reponsesMultiples_2_0= 'R\\u00E9ponsesMultiples' ) )? (otherlv_3= 'Difficult\\u00E9' ( (lv_difficulte_4_0= ruleEInt ) ) )? (otherlv_5= 'Etiquettes' ( (lv_etiquette_6_0= ruleEtiquette ) ) (otherlv_7= ',' ( (lv_etiquette_8_0= ruleEtiquette ) ) )* )? ( (lv_reponse_9_0= ruleReponse ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
            		
            // InternalEduquizz.g:258:3: ( (lv_ennonce_1_0= ruleEString ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEduquizz.g:259:4: (lv_ennonce_1_0= ruleEString )
                    {
                    // InternalEduquizz.g:259:4: (lv_ennonce_1_0= ruleEString )
                    // InternalEduquizz.g:260:5: lv_ennonce_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getQuestionAccess().getEnnonceEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_ennonce_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuestionRule());
                    					}
                    					set(
                    						current,
                    						"ennonce",
                    						lv_ennonce_1_0,
                    						"xtext.Eduquizz.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEduquizz.g:277:3: ( (lv_reponsesMultiples_2_0= 'R\\u00E9ponsesMultiples' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEduquizz.g:278:4: (lv_reponsesMultiples_2_0= 'R\\u00E9ponsesMultiples' )
                    {
                    // InternalEduquizz.g:278:4: (lv_reponsesMultiples_2_0= 'R\\u00E9ponsesMultiples' )
                    // InternalEduquizz.g:279:5: lv_reponsesMultiples_2_0= 'R\\u00E9ponsesMultiples'
                    {
                    lv_reponsesMultiples_2_0=(Token)match(input,17,FOLLOW_6); 

                    					newLeafNode(lv_reponsesMultiples_2_0, grammarAccess.getQuestionAccess().getReponsesMultiplesRPonsesMultiplesKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionRule());
                    					}
                    					setWithLastConsumed(current, "reponsesMultiples", lv_reponsesMultiples_2_0 != null, "R\u00E9ponsesMultiples");
                    				

                    }


                    }
                    break;

            }

            // InternalEduquizz.g:291:3: (otherlv_3= 'Difficult\\u00E9' ( (lv_difficulte_4_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEduquizz.g:292:4: otherlv_3= 'Difficult\\u00E9' ( (lv_difficulte_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getDifficultKeyword_3_0());
                    			
                    // InternalEduquizz.g:296:4: ( (lv_difficulte_4_0= ruleEInt ) )
                    // InternalEduquizz.g:297:5: (lv_difficulte_4_0= ruleEInt )
                    {
                    // InternalEduquizz.g:297:5: (lv_difficulte_4_0= ruleEInt )
                    // InternalEduquizz.g:298:6: lv_difficulte_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getDifficulteEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_difficulte_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						set(
                    							current,
                    							"difficulte",
                    							lv_difficulte_4_0,
                    							"xtext.Eduquizz.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEduquizz.g:316:3: (otherlv_5= 'Etiquettes' ( (lv_etiquette_6_0= ruleEtiquette ) ) (otherlv_7= ',' ( (lv_etiquette_8_0= ruleEtiquette ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEduquizz.g:317:4: otherlv_5= 'Etiquettes' ( (lv_etiquette_6_0= ruleEtiquette ) ) (otherlv_7= ',' ( (lv_etiquette_8_0= ruleEtiquette ) ) )*
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getEtiquettesKeyword_4_0());
                    			
                    // InternalEduquizz.g:321:4: ( (lv_etiquette_6_0= ruleEtiquette ) )
                    // InternalEduquizz.g:322:5: (lv_etiquette_6_0= ruleEtiquette )
                    {
                    // InternalEduquizz.g:322:5: (lv_etiquette_6_0= ruleEtiquette )
                    // InternalEduquizz.g:323:6: lv_etiquette_6_0= ruleEtiquette
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_etiquette_6_0=ruleEtiquette();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						add(
                    							current,
                    							"etiquette",
                    							lv_etiquette_6_0,
                    							"xtext.Eduquizz.Etiquette");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEduquizz.g:340:4: (otherlv_7= ',' ( (lv_etiquette_8_0= ruleEtiquette ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalEduquizz.g:341:5: otherlv_7= ',' ( (lv_etiquette_8_0= ruleEtiquette ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalEduquizz.g:345:5: ( (lv_etiquette_8_0= ruleEtiquette ) )
                    	    // InternalEduquizz.g:346:6: (lv_etiquette_8_0= ruleEtiquette )
                    	    {
                    	    // InternalEduquizz.g:346:6: (lv_etiquette_8_0= ruleEtiquette )
                    	    // InternalEduquizz.g:347:7: lv_etiquette_8_0= ruleEtiquette
                    	    {

                    	    							newCompositeNode(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_etiquette_8_0=ruleEtiquette();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQuestionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"etiquette",
                    	    								lv_etiquette_8_0,
                    	    								"xtext.Eduquizz.Etiquette");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalEduquizz.g:366:3: ( (lv_reponse_9_0= ruleReponse ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEduquizz.g:367:4: (lv_reponse_9_0= ruleReponse )
            	    {
            	    // InternalEduquizz.g:367:4: (lv_reponse_9_0= ruleReponse )
            	    // InternalEduquizz.g:368:5: lv_reponse_9_0= ruleReponse
            	    {

            	    					newCompositeNode(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_reponse_9_0=ruleReponse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reponse",
            	    						lv_reponse_9_0,
            	    						"xtext.Eduquizz.Reponse");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleEInt"
    // InternalEduquizz.g:389:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalEduquizz.g:389:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalEduquizz.g:390:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalEduquizz.g:396:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalEduquizz.g:402:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalEduquizz.g:403:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalEduquizz.g:403:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalEduquizz.g:404:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalEduquizz.g:404:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEduquizz.g:405:4: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEtiquette"
    // InternalEduquizz.g:422:1: entryRuleEtiquette returns [EObject current=null] : iv_ruleEtiquette= ruleEtiquette EOF ;
    public final EObject entryRuleEtiquette() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEtiquette = null;


        try {
            // InternalEduquizz.g:422:50: (iv_ruleEtiquette= ruleEtiquette EOF )
            // InternalEduquizz.g:423:2: iv_ruleEtiquette= ruleEtiquette EOF
            {
             newCompositeNode(grammarAccess.getEtiquetteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEtiquette=ruleEtiquette();

            state._fsp--;

             current =iv_ruleEtiquette; 
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
    // $ANTLR end "entryRuleEtiquette"


    // $ANTLR start "ruleEtiquette"
    // InternalEduquizz.g:429:1: ruleEtiquette returns [EObject current=null] : ( () ( (lv_nom_1_0= ruleEString ) )? ) ;
    public final EObject ruleEtiquette() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nom_1_0 = null;



        	enterRule();

        try {
            // InternalEduquizz.g:435:2: ( ( () ( (lv_nom_1_0= ruleEString ) )? ) )
            // InternalEduquizz.g:436:2: ( () ( (lv_nom_1_0= ruleEString ) )? )
            {
            // InternalEduquizz.g:436:2: ( () ( (lv_nom_1_0= ruleEString ) )? )
            // InternalEduquizz.g:437:3: () ( (lv_nom_1_0= ruleEString ) )?
            {
            // InternalEduquizz.g:437:3: ()
            // InternalEduquizz.g:438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEtiquetteAccess().getEtiquetteAction_0(),
            					current);
            			

            }

            // InternalEduquizz.g:444:3: ( (lv_nom_1_0= ruleEString ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEduquizz.g:445:4: (lv_nom_1_0= ruleEString )
                    {
                    // InternalEduquizz.g:445:4: (lv_nom_1_0= ruleEString )
                    // InternalEduquizz.g:446:5: lv_nom_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getEtiquetteAccess().getNomEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_nom_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEtiquetteRule());
                    					}
                    					set(
                    						current,
                    						"nom",
                    						lv_nom_1_0,
                    						"xtext.Eduquizz.EString");
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
    // $ANTLR end "ruleEtiquette"


    // $ANTLR start "entryRuleReponse"
    // InternalEduquizz.g:467:1: entryRuleReponse returns [EObject current=null] : iv_ruleReponse= ruleReponse EOF ;
    public final EObject entryRuleReponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReponse = null;


        try {
            // InternalEduquizz.g:467:48: (iv_ruleReponse= ruleReponse EOF )
            // InternalEduquizz.g:468:2: iv_ruleReponse= ruleReponse EOF
            {
             newCompositeNode(grammarAccess.getReponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReponse=ruleReponse();

            state._fsp--;

             current =iv_ruleReponse; 
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
    // $ANTLR end "entryRuleReponse"


    // $ANTLR start "ruleReponse"
    // InternalEduquizz.g:474:1: ruleReponse returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_estVraie_2_0= 'x' ) )? otherlv_3= ']' ( (lv_texte_4_0= ruleEString ) )? ) ;
    public final EObject ruleReponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_estVraie_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_texte_4_0 = null;



        	enterRule();

        try {
            // InternalEduquizz.g:480:2: ( ( () otherlv_1= '[' ( (lv_estVraie_2_0= 'x' ) )? otherlv_3= ']' ( (lv_texte_4_0= ruleEString ) )? ) )
            // InternalEduquizz.g:481:2: ( () otherlv_1= '[' ( (lv_estVraie_2_0= 'x' ) )? otherlv_3= ']' ( (lv_texte_4_0= ruleEString ) )? )
            {
            // InternalEduquizz.g:481:2: ( () otherlv_1= '[' ( (lv_estVraie_2_0= 'x' ) )? otherlv_3= ']' ( (lv_texte_4_0= ruleEString ) )? )
            // InternalEduquizz.g:482:3: () otherlv_1= '[' ( (lv_estVraie_2_0= 'x' ) )? otherlv_3= ']' ( (lv_texte_4_0= ruleEString ) )?
            {
            // InternalEduquizz.g:482:3: ()
            // InternalEduquizz.g:483:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReponseAccess().getReponseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getReponseAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEduquizz.g:493:3: ( (lv_estVraie_2_0= 'x' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEduquizz.g:494:4: (lv_estVraie_2_0= 'x' )
                    {
                    // InternalEduquizz.g:494:4: (lv_estVraie_2_0= 'x' )
                    // InternalEduquizz.g:495:5: lv_estVraie_2_0= 'x'
                    {
                    lv_estVraie_2_0=(Token)match(input,23,FOLLOW_12); 

                    					newLeafNode(lv_estVraie_2_0, grammarAccess.getReponseAccess().getEstVraieXKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReponseRule());
                    					}
                    					setWithLastConsumed(current, "estVraie", lv_estVraie_2_0 != null, "x");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getReponseAccess().getRightSquareBracketKeyword_3());
            		
            // InternalEduquizz.g:511:3: ( (lv_texte_4_0= ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEduquizz.g:512:4: (lv_texte_4_0= ruleEString )
                    {
                    // InternalEduquizz.g:512:4: (lv_texte_4_0= ruleEString )
                    // InternalEduquizz.g:513:5: lv_texte_4_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getReponseAccess().getTexteEStringParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_texte_4_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReponseRule());
                    					}
                    					set(
                    						current,
                    						"texte",
                    						lv_texte_4_0,
                    						"xtext.Eduquizz.EString");
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
    // $ANTLR end "ruleReponse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000013030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000013032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000004E0030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000005E0030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000004E0032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000032L});

}