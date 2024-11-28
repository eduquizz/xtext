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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Questionnaire'", "'{'", "'nom'", "'resultat'", "'retourAutorise'", "'melange'", "'question'", "','", "'}'", "'-'", "'.'", "'E'", "'e'", "'true'", "'false'", "'reponsesMultiples'", "'Question'", "'ennonce'", "'difficulte'", "'etiquette'", "'('", "')'", "'reponse'", "'Etiquette'", "'estVraie'", "'Reponse'", "'texte'"
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
    // InternalEduquizz.g:71:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'Questionnaire' otherlv_1= '{' (otherlv_2= 'nom' ( (lv_nom_3_0= ruleEString ) ) )? (otherlv_4= 'resultat' ( (lv_resultat_5_0= ruleEDouble ) ) )? (otherlv_6= 'retourAutorise' ( (lv_retourAutorise_7_0= ruleEBoolean ) ) )? (otherlv_8= 'melange' ( (lv_melange_9_0= ruleEBoolean ) ) )? otherlv_10= 'question' otherlv_11= '{' ( (lv_question_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_question_14_0= ruleQuestion ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleQuestionnaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_nom_3_0 = null;

        AntlrDatatypeRuleToken lv_resultat_5_0 = null;

        AntlrDatatypeRuleToken lv_retourAutorise_7_0 = null;

        AntlrDatatypeRuleToken lv_melange_9_0 = null;

        EObject lv_question_12_0 = null;

        EObject lv_question_14_0 = null;



        	enterRule();

        try {
            // InternalEduquizz.g:77:2: ( (otherlv_0= 'Questionnaire' otherlv_1= '{' (otherlv_2= 'nom' ( (lv_nom_3_0= ruleEString ) ) )? (otherlv_4= 'resultat' ( (lv_resultat_5_0= ruleEDouble ) ) )? (otherlv_6= 'retourAutorise' ( (lv_retourAutorise_7_0= ruleEBoolean ) ) )? (otherlv_8= 'melange' ( (lv_melange_9_0= ruleEBoolean ) ) )? otherlv_10= 'question' otherlv_11= '{' ( (lv_question_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_question_14_0= ruleQuestion ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalEduquizz.g:78:2: (otherlv_0= 'Questionnaire' otherlv_1= '{' (otherlv_2= 'nom' ( (lv_nom_3_0= ruleEString ) ) )? (otherlv_4= 'resultat' ( (lv_resultat_5_0= ruleEDouble ) ) )? (otherlv_6= 'retourAutorise' ( (lv_retourAutorise_7_0= ruleEBoolean ) ) )? (otherlv_8= 'melange' ( (lv_melange_9_0= ruleEBoolean ) ) )? otherlv_10= 'question' otherlv_11= '{' ( (lv_question_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_question_14_0= ruleQuestion ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalEduquizz.g:78:2: (otherlv_0= 'Questionnaire' otherlv_1= '{' (otherlv_2= 'nom' ( (lv_nom_3_0= ruleEString ) ) )? (otherlv_4= 'resultat' ( (lv_resultat_5_0= ruleEDouble ) ) )? (otherlv_6= 'retourAutorise' ( (lv_retourAutorise_7_0= ruleEBoolean ) ) )? (otherlv_8= 'melange' ( (lv_melange_9_0= ruleEBoolean ) ) )? otherlv_10= 'question' otherlv_11= '{' ( (lv_question_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_question_14_0= ruleQuestion ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalEduquizz.g:79:3: otherlv_0= 'Questionnaire' otherlv_1= '{' (otherlv_2= 'nom' ( (lv_nom_3_0= ruleEString ) ) )? (otherlv_4= 'resultat' ( (lv_resultat_5_0= ruleEDouble ) ) )? (otherlv_6= 'retourAutorise' ( (lv_retourAutorise_7_0= ruleEBoolean ) ) )? (otherlv_8= 'melange' ( (lv_melange_9_0= ruleEBoolean ) ) )? otherlv_10= 'question' otherlv_11= '{' ( (lv_question_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_question_14_0= ruleQuestion ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEduquizz.g:87:3: (otherlv_2= 'nom' ( (lv_nom_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEduquizz.g:88:4: otherlv_2= 'nom' ( (lv_nom_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getNomKeyword_2_0());
                    			
                    // InternalEduquizz.g:92:4: ( (lv_nom_3_0= ruleEString ) )
                    // InternalEduquizz.g:93:5: (lv_nom_3_0= ruleEString )
                    {
                    // InternalEduquizz.g:93:5: (lv_nom_3_0= ruleEString )
                    // InternalEduquizz.g:94:6: lv_nom_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQuestionnaireAccess().getNomEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_nom_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
                    						}
                    						set(
                    							current,
                    							"nom",
                    							lv_nom_3_0,
                    							"xtext.Eduquizz.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEduquizz.g:112:3: (otherlv_4= 'resultat' ( (lv_resultat_5_0= ruleEDouble ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEduquizz.g:113:4: otherlv_4= 'resultat' ( (lv_resultat_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getResultatKeyword_3_0());
                    			
                    // InternalEduquizz.g:117:4: ( (lv_resultat_5_0= ruleEDouble ) )
                    // InternalEduquizz.g:118:5: (lv_resultat_5_0= ruleEDouble )
                    {
                    // InternalEduquizz.g:118:5: (lv_resultat_5_0= ruleEDouble )
                    // InternalEduquizz.g:119:6: lv_resultat_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getQuestionnaireAccess().getResultatEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_resultat_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
                    						}
                    						set(
                    							current,
                    							"resultat",
                    							lv_resultat_5_0,
                    							"xtext.Eduquizz.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEduquizz.g:137:3: (otherlv_6= 'retourAutorise' ( (lv_retourAutorise_7_0= ruleEBoolean ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEduquizz.g:138:4: otherlv_6= 'retourAutorise' ( (lv_retourAutorise_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getQuestionnaireAccess().getRetourAutoriseKeyword_4_0());
                    			
                    // InternalEduquizz.g:142:4: ( (lv_retourAutorise_7_0= ruleEBoolean ) )
                    // InternalEduquizz.g:143:5: (lv_retourAutorise_7_0= ruleEBoolean )
                    {
                    // InternalEduquizz.g:143:5: (lv_retourAutorise_7_0= ruleEBoolean )
                    // InternalEduquizz.g:144:6: lv_retourAutorise_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getQuestionnaireAccess().getRetourAutoriseEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_retourAutorise_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
                    						}
                    						set(
                    							current,
                    							"retourAutorise",
                    							lv_retourAutorise_7_0,
                    							"xtext.Eduquizz.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEduquizz.g:162:3: (otherlv_8= 'melange' ( (lv_melange_9_0= ruleEBoolean ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEduquizz.g:163:4: otherlv_8= 'melange' ( (lv_melange_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getQuestionnaireAccess().getMelangeKeyword_5_0());
                    			
                    // InternalEduquizz.g:167:4: ( (lv_melange_9_0= ruleEBoolean ) )
                    // InternalEduquizz.g:168:5: (lv_melange_9_0= ruleEBoolean )
                    {
                    // InternalEduquizz.g:168:5: (lv_melange_9_0= ruleEBoolean )
                    // InternalEduquizz.g:169:6: lv_melange_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getQuestionnaireAccess().getMelangeEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_melange_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
                    						}
                    						set(
                    							current,
                    							"melange",
                    							lv_melange_9_0,
                    							"xtext.Eduquizz.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getQuestionnaireAccess().getQuestionKeyword_6());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalEduquizz.g:195:3: ( (lv_question_12_0= ruleQuestion ) )
            // InternalEduquizz.g:196:4: (lv_question_12_0= ruleQuestion )
            {
            // InternalEduquizz.g:196:4: (lv_question_12_0= ruleQuestion )
            // InternalEduquizz.g:197:5: lv_question_12_0= ruleQuestion
            {

            					newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_13);
            lv_question_12_0=ruleQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            					}
            					add(
            						current,
            						"question",
            						lv_question_12_0,
            						"xtext.Eduquizz.Question");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEduquizz.g:214:3: (otherlv_13= ',' ( (lv_question_14_0= ruleQuestion ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEduquizz.g:215:4: otherlv_13= ',' ( (lv_question_14_0= ruleQuestion ) )
            	    {
            	    otherlv_13=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_13, grammarAccess.getQuestionnaireAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalEduquizz.g:219:4: ( (lv_question_14_0= ruleQuestion ) )
            	    // InternalEduquizz.g:220:5: (lv_question_14_0= ruleQuestion )
            	    {
            	    // InternalEduquizz.g:220:5: (lv_question_14_0= ruleQuestion )
            	    // InternalEduquizz.g:221:6: lv_question_14_0= ruleQuestion
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_question_14_0=ruleQuestion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	    						}
            	    						add(
            	    							current,
            	    							"question",
            	    							lv_question_14_0,
            	    							"xtext.Eduquizz.Question");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_15=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_15, grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalEduquizz.g:251:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEduquizz.g:251:47: (iv_ruleEString= ruleEString EOF )
            // InternalEduquizz.g:252:2: iv_ruleEString= ruleEString EOF
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
    // InternalEduquizz.g:258:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEduquizz.g:264:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEduquizz.g:265:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEduquizz.g:265:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEduquizz.g:266:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEduquizz.g:274:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEDouble"
    // InternalEduquizz.g:285:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalEduquizz.g:285:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalEduquizz.g:286:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalEduquizz.g:292:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalEduquizz.g:298:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalEduquizz.g:299:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalEduquizz.g:299:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalEduquizz.g:300:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalEduquizz.g:300:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEduquizz.g:301:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalEduquizz.g:307:3: (this_INT_1= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEduquizz.g:308:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_16); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,21,FOLLOW_17); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_18); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalEduquizz.g:328:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=22 && LA11_0<=23)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEduquizz.g:329:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalEduquizz.g:329:4: (kw= 'E' | kw= 'e' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==22) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==23) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalEduquizz.g:330:5: kw= 'E'
                            {
                            kw=(Token)match(input,22,FOLLOW_19); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalEduquizz.g:336:5: kw= 'e'
                            {
                            kw=(Token)match(input,23,FOLLOW_19); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalEduquizz.g:342:4: (kw= '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==20) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalEduquizz.g:343:5: kw= '-'
                            {
                            kw=(Token)match(input,20,FOLLOW_17); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEBoolean"
    // InternalEduquizz.g:361:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalEduquizz.g:361:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalEduquizz.g:362:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalEduquizz.g:368:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEduquizz.g:374:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalEduquizz.g:375:2: (kw= 'true' | kw= 'false' )
            {
            // InternalEduquizz.g:375:2: (kw= 'true' | kw= 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalEduquizz.g:376:3: kw= 'true'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEduquizz.g:382:3: kw= 'false'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

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
    // InternalEduquizz.g:391:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalEduquizz.g:391:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalEduquizz.g:392:2: iv_ruleQuestion= ruleQuestion EOF
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
    // InternalEduquizz.g:398:1: ruleQuestion returns [EObject current=null] : ( ( (lv_reponsesMultiples_0_0= 'reponsesMultiples' ) )? otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'ennonce' ( (lv_ennonce_4_0= ruleEString ) ) )? (otherlv_5= 'difficulte' ( (lv_difficulte_6_0= ruleEInt ) ) )? (otherlv_7= 'etiquette' otherlv_8= '(' ( (lv_etiquette_9_0= ruleEtiquette ) ) (otherlv_10= ',' ( (lv_etiquette_11_0= ruleEtiquette ) ) )* otherlv_12= ')' )? otherlv_13= 'reponse' otherlv_14= '{' ( (lv_reponse_15_0= ruleReponse ) ) (otherlv_16= ',' ( (lv_reponse_17_0= ruleReponse ) ) )* otherlv_18= '}' otherlv_19= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_reponsesMultiples_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_ennonce_4_0 = null;

        AntlrDatatypeRuleToken lv_difficulte_6_0 = null;

        EObject lv_etiquette_9_0 = null;

        EObject lv_etiquette_11_0 = null;

        EObject lv_reponse_15_0 = null;

        EObject lv_reponse_17_0 = null;



        	enterRule();

        try {
            // InternalEduquizz.g:404:2: ( ( ( (lv_reponsesMultiples_0_0= 'reponsesMultiples' ) )? otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'ennonce' ( (lv_ennonce_4_0= ruleEString ) ) )? (otherlv_5= 'difficulte' ( (lv_difficulte_6_0= ruleEInt ) ) )? (otherlv_7= 'etiquette' otherlv_8= '(' ( (lv_etiquette_9_0= ruleEtiquette ) ) (otherlv_10= ',' ( (lv_etiquette_11_0= ruleEtiquette ) ) )* otherlv_12= ')' )? otherlv_13= 'reponse' otherlv_14= '{' ( (lv_reponse_15_0= ruleReponse ) ) (otherlv_16= ',' ( (lv_reponse_17_0= ruleReponse ) ) )* otherlv_18= '}' otherlv_19= '}' ) )
            // InternalEduquizz.g:405:2: ( ( (lv_reponsesMultiples_0_0= 'reponsesMultiples' ) )? otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'ennonce' ( (lv_ennonce_4_0= ruleEString ) ) )? (otherlv_5= 'difficulte' ( (lv_difficulte_6_0= ruleEInt ) ) )? (otherlv_7= 'etiquette' otherlv_8= '(' ( (lv_etiquette_9_0= ruleEtiquette ) ) (otherlv_10= ',' ( (lv_etiquette_11_0= ruleEtiquette ) ) )* otherlv_12= ')' )? otherlv_13= 'reponse' otherlv_14= '{' ( (lv_reponse_15_0= ruleReponse ) ) (otherlv_16= ',' ( (lv_reponse_17_0= ruleReponse ) ) )* otherlv_18= '}' otherlv_19= '}' )
            {
            // InternalEduquizz.g:405:2: ( ( (lv_reponsesMultiples_0_0= 'reponsesMultiples' ) )? otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'ennonce' ( (lv_ennonce_4_0= ruleEString ) ) )? (otherlv_5= 'difficulte' ( (lv_difficulte_6_0= ruleEInt ) ) )? (otherlv_7= 'etiquette' otherlv_8= '(' ( (lv_etiquette_9_0= ruleEtiquette ) ) (otherlv_10= ',' ( (lv_etiquette_11_0= ruleEtiquette ) ) )* otherlv_12= ')' )? otherlv_13= 'reponse' otherlv_14= '{' ( (lv_reponse_15_0= ruleReponse ) ) (otherlv_16= ',' ( (lv_reponse_17_0= ruleReponse ) ) )* otherlv_18= '}' otherlv_19= '}' )
            // InternalEduquizz.g:406:3: ( (lv_reponsesMultiples_0_0= 'reponsesMultiples' ) )? otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'ennonce' ( (lv_ennonce_4_0= ruleEString ) ) )? (otherlv_5= 'difficulte' ( (lv_difficulte_6_0= ruleEInt ) ) )? (otherlv_7= 'etiquette' otherlv_8= '(' ( (lv_etiquette_9_0= ruleEtiquette ) ) (otherlv_10= ',' ( (lv_etiquette_11_0= ruleEtiquette ) ) )* otherlv_12= ')' )? otherlv_13= 'reponse' otherlv_14= '{' ( (lv_reponse_15_0= ruleReponse ) ) (otherlv_16= ',' ( (lv_reponse_17_0= ruleReponse ) ) )* otherlv_18= '}' otherlv_19= '}'
            {
            // InternalEduquizz.g:406:3: ( (lv_reponsesMultiples_0_0= 'reponsesMultiples' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEduquizz.g:407:4: (lv_reponsesMultiples_0_0= 'reponsesMultiples' )
                    {
                    // InternalEduquizz.g:407:4: (lv_reponsesMultiples_0_0= 'reponsesMultiples' )
                    // InternalEduquizz.g:408:5: lv_reponsesMultiples_0_0= 'reponsesMultiples'
                    {
                    lv_reponsesMultiples_0_0=(Token)match(input,26,FOLLOW_20); 

                    					newLeafNode(lv_reponsesMultiples_0_0, grammarAccess.getQuestionAccess().getReponsesMultiplesReponsesMultiplesKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionRule());
                    					}
                    					setWithLastConsumed(current, "reponsesMultiples", lv_reponsesMultiples_0_0 != null, "reponsesMultiples");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getQuestionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEduquizz.g:428:3: (otherlv_3= 'ennonce' ( (lv_ennonce_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEduquizz.g:429:4: otherlv_3= 'ennonce' ( (lv_ennonce_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getEnnonceKeyword_3_0());
                    			
                    // InternalEduquizz.g:433:4: ( (lv_ennonce_4_0= ruleEString ) )
                    // InternalEduquizz.g:434:5: (lv_ennonce_4_0= ruleEString )
                    {
                    // InternalEduquizz.g:434:5: (lv_ennonce_4_0= ruleEString )
                    // InternalEduquizz.g:435:6: lv_ennonce_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getEnnonceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_ennonce_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						set(
                    							current,
                    							"ennonce",
                    							lv_ennonce_4_0,
                    							"xtext.Eduquizz.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEduquizz.g:453:3: (otherlv_5= 'difficulte' ( (lv_difficulte_6_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEduquizz.g:454:4: otherlv_5= 'difficulte' ( (lv_difficulte_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getDifficulteKeyword_4_0());
                    			
                    // InternalEduquizz.g:458:4: ( (lv_difficulte_6_0= ruleEInt ) )
                    // InternalEduquizz.g:459:5: (lv_difficulte_6_0= ruleEInt )
                    {
                    // InternalEduquizz.g:459:5: (lv_difficulte_6_0= ruleEInt )
                    // InternalEduquizz.g:460:6: lv_difficulte_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getDifficulteEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_difficulte_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						set(
                    							current,
                    							"difficulte",
                    							lv_difficulte_6_0,
                    							"xtext.Eduquizz.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEduquizz.g:478:3: (otherlv_7= 'etiquette' otherlv_8= '(' ( (lv_etiquette_9_0= ruleEtiquette ) ) (otherlv_10= ',' ( (lv_etiquette_11_0= ruleEtiquette ) ) )* otherlv_12= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEduquizz.g:479:4: otherlv_7= 'etiquette' otherlv_8= '(' ( (lv_etiquette_9_0= ruleEtiquette ) ) (otherlv_10= ',' ( (lv_etiquette_11_0= ruleEtiquette ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getEtiquetteKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getQuestionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalEduquizz.g:487:4: ( (lv_etiquette_9_0= ruleEtiquette ) )
                    // InternalEduquizz.g:488:5: (lv_etiquette_9_0= ruleEtiquette )
                    {
                    // InternalEduquizz.g:488:5: (lv_etiquette_9_0= ruleEtiquette )
                    // InternalEduquizz.g:489:6: lv_etiquette_9_0= ruleEtiquette
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_etiquette_9_0=ruleEtiquette();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						add(
                    							current,
                    							"etiquette",
                    							lv_etiquette_9_0,
                    							"xtext.Eduquizz.Etiquette");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEduquizz.g:506:4: (otherlv_10= ',' ( (lv_etiquette_11_0= ruleEtiquette ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==18) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalEduquizz.g:507:5: otherlv_10= ',' ( (lv_etiquette_11_0= ruleEtiquette ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FOLLOW_25); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getQuestionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalEduquizz.g:511:5: ( (lv_etiquette_11_0= ruleEtiquette ) )
                    	    // InternalEduquizz.g:512:6: (lv_etiquette_11_0= ruleEtiquette )
                    	    {
                    	    // InternalEduquizz.g:512:6: (lv_etiquette_11_0= ruleEtiquette )
                    	    // InternalEduquizz.g:513:7: lv_etiquette_11_0= ruleEtiquette
                    	    {

                    	    							newCompositeNode(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_etiquette_11_0=ruleEtiquette();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQuestionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"etiquette",
                    	    								lv_etiquette_11_0,
                    	    								"xtext.Eduquizz.Etiquette");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_12, grammarAccess.getQuestionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getQuestionAccess().getReponseKeyword_6());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_14, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalEduquizz.g:544:3: ( (lv_reponse_15_0= ruleReponse ) )
            // InternalEduquizz.g:545:4: (lv_reponse_15_0= ruleReponse )
            {
            // InternalEduquizz.g:545:4: (lv_reponse_15_0= ruleReponse )
            // InternalEduquizz.g:546:5: lv_reponse_15_0= ruleReponse
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_13);
            lv_reponse_15_0=ruleReponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					add(
            						current,
            						"reponse",
            						lv_reponse_15_0,
            						"xtext.Eduquizz.Reponse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEduquizz.g:563:3: (otherlv_16= ',' ( (lv_reponse_17_0= ruleReponse ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEduquizz.g:564:4: otherlv_16= ',' ( (lv_reponse_17_0= ruleReponse ) )
            	    {
            	    otherlv_16=(Token)match(input,18,FOLLOW_28); 

            	    				newLeafNode(otherlv_16, grammarAccess.getQuestionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalEduquizz.g:568:4: ( (lv_reponse_17_0= ruleReponse ) )
            	    // InternalEduquizz.g:569:5: (lv_reponse_17_0= ruleReponse )
            	    {
            	    // InternalEduquizz.g:569:5: (lv_reponse_17_0= ruleReponse )
            	    // InternalEduquizz.g:570:6: lv_reponse_17_0= ruleReponse
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_reponse_17_0=ruleReponse();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"reponse",
            	    							lv_reponse_17_0,
            	    							"xtext.Eduquizz.Reponse");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_18=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_18, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalEduquizz.g:600:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalEduquizz.g:600:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalEduquizz.g:601:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalEduquizz.g:607:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalEduquizz.g:613:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalEduquizz.g:614:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalEduquizz.g:614:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalEduquizz.g:615:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalEduquizz.g:615:3: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEduquizz.g:616:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_17); 

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
    // InternalEduquizz.g:633:1: entryRuleEtiquette returns [EObject current=null] : iv_ruleEtiquette= ruleEtiquette EOF ;
    public final EObject entryRuleEtiquette() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEtiquette = null;


        try {
            // InternalEduquizz.g:633:50: (iv_ruleEtiquette= ruleEtiquette EOF )
            // InternalEduquizz.g:634:2: iv_ruleEtiquette= ruleEtiquette EOF
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
    // InternalEduquizz.g:640:1: ruleEtiquette returns [EObject current=null] : ( () otherlv_1= 'Etiquette' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleEtiquette() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nom_4_0 = null;



        	enterRule();

        try {
            // InternalEduquizz.g:646:2: ( ( () otherlv_1= 'Etiquette' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalEduquizz.g:647:2: ( () otherlv_1= 'Etiquette' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalEduquizz.g:647:2: ( () otherlv_1= 'Etiquette' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalEduquizz.g:648:3: () otherlv_1= 'Etiquette' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalEduquizz.g:648:3: ()
            // InternalEduquizz.g:649:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEtiquetteAccess().getEtiquetteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEtiquetteAccess().getEtiquetteKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getEtiquetteAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEduquizz.g:663:3: (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEduquizz.g:664:4: otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getEtiquetteAccess().getNomKeyword_3_0());
                    			
                    // InternalEduquizz.g:668:4: ( (lv_nom_4_0= ruleEString ) )
                    // InternalEduquizz.g:669:5: (lv_nom_4_0= ruleEString )
                    {
                    // InternalEduquizz.g:669:5: (lv_nom_4_0= ruleEString )
                    // InternalEduquizz.g:670:6: lv_nom_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEtiquetteAccess().getNomEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_nom_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEtiquetteRule());
                    						}
                    						set(
                    							current,
                    							"nom",
                    							lv_nom_4_0,
                    							"xtext.Eduquizz.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEtiquetteAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalEduquizz.g:696:1: entryRuleReponse returns [EObject current=null] : iv_ruleReponse= ruleReponse EOF ;
    public final EObject entryRuleReponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReponse = null;


        try {
            // InternalEduquizz.g:696:48: (iv_ruleReponse= ruleReponse EOF )
            // InternalEduquizz.g:697:2: iv_ruleReponse= ruleReponse EOF
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
    // InternalEduquizz.g:703:1: ruleReponse returns [EObject current=null] : ( () ( (lv_estVraie_1_0= 'estVraie' ) )? otherlv_2= 'Reponse' otherlv_3= '{' (otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleReponse() throws RecognitionException {
        EObject current = null;

        Token lv_estVraie_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_texte_5_0 = null;



        	enterRule();

        try {
            // InternalEduquizz.g:709:2: ( ( () ( (lv_estVraie_1_0= 'estVraie' ) )? otherlv_2= 'Reponse' otherlv_3= '{' (otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalEduquizz.g:710:2: ( () ( (lv_estVraie_1_0= 'estVraie' ) )? otherlv_2= 'Reponse' otherlv_3= '{' (otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalEduquizz.g:710:2: ( () ( (lv_estVraie_1_0= 'estVraie' ) )? otherlv_2= 'Reponse' otherlv_3= '{' (otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalEduquizz.g:711:3: () ( (lv_estVraie_1_0= 'estVraie' ) )? otherlv_2= 'Reponse' otherlv_3= '{' (otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalEduquizz.g:711:3: ()
            // InternalEduquizz.g:712:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReponseAccess().getReponseAction_0(),
            					current);
            			

            }

            // InternalEduquizz.g:718:3: ( (lv_estVraie_1_0= 'estVraie' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEduquizz.g:719:4: (lv_estVraie_1_0= 'estVraie' )
                    {
                    // InternalEduquizz.g:719:4: (lv_estVraie_1_0= 'estVraie' )
                    // InternalEduquizz.g:720:5: lv_estVraie_1_0= 'estVraie'
                    {
                    lv_estVraie_1_0=(Token)match(input,35,FOLLOW_30); 

                    					newLeafNode(lv_estVraie_1_0, grammarAccess.getReponseAccess().getEstVraieEstVraieKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReponseRule());
                    					}
                    					setWithLastConsumed(current, "estVraie", lv_estVraie_1_0 != null, "estVraie");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getReponseAccess().getReponseKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getReponseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEduquizz.g:740:3: (otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEduquizz.g:741:4: otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getReponseAccess().getTexteKeyword_4_0());
                    			
                    // InternalEduquizz.g:745:4: ( (lv_texte_5_0= ruleEString ) )
                    // InternalEduquizz.g:746:5: (lv_texte_5_0= ruleEString )
                    {
                    // InternalEduquizz.g:746:5: (lv_texte_5_0= ruleEString )
                    // InternalEduquizz.g:747:6: lv_texte_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReponseAccess().getTexteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_texte_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReponseRule());
                    						}
                    						set(
                    							current,
                    							"texte",
                    							lv_texte_5_0,
                    							"xtext.Eduquizz.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getReponseAccess().getRightCurlyBracketKeyword_5());
            		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000300040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000270000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000260000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000080000L});

}