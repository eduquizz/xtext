/*
 * generated by Xtext 2.37.0
 */
package xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EduquizzGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class QuestionnaireElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Eduquizz.Questionnaire");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionnaireKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNomAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNomEStringParserRuleCall_1_0 = (RuleCall)cNomAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cRetourAutorisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRetourAutoriseAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRetourAutoriseEBooleanParserRuleCall_2_1_0 = (RuleCall)cRetourAutoriseAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cMLangerKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cMelangeAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cMelangeEBooleanParserRuleCall_3_1_0 = (RuleCall)cMelangeAssignment_3_1.eContents().get(0);
		private final Assignment cQuestionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cQuestionQuestionParserRuleCall_4_0 = (RuleCall)cQuestionAssignment_4.eContents().get(0);
		
		//Questionnaire returns Questionnaire:
		//    'Questionnaire' (nom=EString)?
		//    ('RetourAutorisé' retourAutorise=EBoolean)?
		//    ('Mélanger' melange=EBoolean)?
		//    (question+=Question)+;
		@Override public ParserRule getRule() { return rule; }
		
		//'Questionnaire' (nom=EString)?
		//('RetourAutorisé' retourAutorise=EBoolean)?
		//('Mélanger' melange=EBoolean)?
		//(question+=Question)+
		public Group getGroup() { return cGroup; }
		
		//'Questionnaire'
		public Keyword getQuestionnaireKeyword_0() { return cQuestionnaireKeyword_0; }
		
		//(nom=EString)?
		public Assignment getNomAssignment_1() { return cNomAssignment_1; }
		
		//EString
		public RuleCall getNomEStringParserRuleCall_1_0() { return cNomEStringParserRuleCall_1_0; }
		
		//('RetourAutorisé' retourAutorise=EBoolean)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'RetourAutorisé'
		public Keyword getRetourAutorisKeyword_2_0() { return cRetourAutorisKeyword_2_0; }
		
		//retourAutorise=EBoolean
		public Assignment getRetourAutoriseAssignment_2_1() { return cRetourAutoriseAssignment_2_1; }
		
		//EBoolean
		public RuleCall getRetourAutoriseEBooleanParserRuleCall_2_1_0() { return cRetourAutoriseEBooleanParserRuleCall_2_1_0; }
		
		//('Mélanger' melange=EBoolean)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'Mélanger'
		public Keyword getMLangerKeyword_3_0() { return cMLangerKeyword_3_0; }
		
		//melange=EBoolean
		public Assignment getMelangeAssignment_3_1() { return cMelangeAssignment_3_1; }
		
		//EBoolean
		public RuleCall getMelangeEBooleanParserRuleCall_3_1_0() { return cMelangeEBooleanParserRuleCall_3_1_0; }
		
		//(question+=Question)+
		public Assignment getQuestionAssignment_4() { return cQuestionAssignment_4; }
		
		//Question
		public RuleCall getQuestionQuestionParserRuleCall_4_0() { return cQuestionQuestionParserRuleCall_4_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Eduquizz.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Eduquizz.EDouble");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_4_0 = (Alternatives)cGroup_4.eContents().get(0);
		private final Keyword cEKeyword_4_0_0 = (Keyword)cAlternatives_4_0.eContents().get(0);
		private final Keyword cEKeyword_4_0_1 = (Keyword)cAlternatives_4_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_4_2 = (RuleCall)cGroup_4.eContents().get(2);
		
		//EDouble returns ecore::EDouble:
		//    '-'? INT? '.' INT (('E'|'e') '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT? '.' INT (('E'|'e') '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//(('E'|'e') '-'? INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//('E'|'e')
		public Alternatives getAlternatives_4_0() { return cAlternatives_4_0; }
		
		//'E'
		public Keyword getEKeyword_4_0_0() { return cEKeyword_4_0_0; }
		
		//'e'
		public Keyword getEKeyword_4_0_1() { return cEKeyword_4_0_1; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_4_1() { return cHyphenMinusKeyword_4_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4_2() { return cINTTerminalRuleCall_4_2; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Eduquizz.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean returns ecore::EBoolean:
		//    'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Eduquizz.Question");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEnnonceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEnnonceEStringParserRuleCall_1_0 = (RuleCall)cEnnonceAssignment_1.eContents().get(0);
		private final Assignment cReponsesMultiplesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cReponsesMultiplesRPonsesMultiplesKeyword_2_0 = (Keyword)cReponsesMultiplesAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDifficultKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDifficulteAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDifficulteEIntParserRuleCall_3_1_0 = (RuleCall)cDifficulteAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cEtiquettesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cEtiquetteAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cEtiquetteEtiquetteParserRuleCall_4_1_0 = (RuleCall)cEtiquetteAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cEtiquetteAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cEtiquetteEtiquetteParserRuleCall_4_2_1_0 = (RuleCall)cEtiquetteAssignment_4_2_1.eContents().get(0);
		private final Assignment cReponseAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cReponseReponseParserRuleCall_5_0 = (RuleCall)cReponseAssignment_5.eContents().get(0);
		
		//Question returns Question:
		//    'Question' (ennonce=EString)?
		//    (reponsesMultiples?='RéponsesMultiples')?
		//    ('Difficulté' difficulte=EInt)?
		//    ('Etiquettes' etiquette+=Etiquette ( "," etiquette+=Etiquette)* )?
		//    (reponse+=Reponse)+;
		@Override public ParserRule getRule() { return rule; }
		
		//'Question' (ennonce=EString)?
		//(reponsesMultiples?='RéponsesMultiples')?
		//('Difficulté' difficulte=EInt)?
		//('Etiquettes' etiquette+=Etiquette ( "," etiquette+=Etiquette)* )?
		//(reponse+=Reponse)+
		public Group getGroup() { return cGroup; }
		
		//'Question'
		public Keyword getQuestionKeyword_0() { return cQuestionKeyword_0; }
		
		//(ennonce=EString)?
		public Assignment getEnnonceAssignment_1() { return cEnnonceAssignment_1; }
		
		//EString
		public RuleCall getEnnonceEStringParserRuleCall_1_0() { return cEnnonceEStringParserRuleCall_1_0; }
		
		//(reponsesMultiples?='RéponsesMultiples')?
		public Assignment getReponsesMultiplesAssignment_2() { return cReponsesMultiplesAssignment_2; }
		
		//'RéponsesMultiples'
		public Keyword getReponsesMultiplesRPonsesMultiplesKeyword_2_0() { return cReponsesMultiplesRPonsesMultiplesKeyword_2_0; }
		
		//('Difficulté' difficulte=EInt)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'Difficulté'
		public Keyword getDifficultKeyword_3_0() { return cDifficultKeyword_3_0; }
		
		//difficulte=EInt
		public Assignment getDifficulteAssignment_3_1() { return cDifficulteAssignment_3_1; }
		
		//EInt
		public RuleCall getDifficulteEIntParserRuleCall_3_1_0() { return cDifficulteEIntParserRuleCall_3_1_0; }
		
		//('Etiquettes' etiquette+=Etiquette ( "," etiquette+=Etiquette)* )?
		public Group getGroup_4() { return cGroup_4; }
		
		//'Etiquettes'
		public Keyword getEtiquettesKeyword_4_0() { return cEtiquettesKeyword_4_0; }
		
		//etiquette+=Etiquette
		public Assignment getEtiquetteAssignment_4_1() { return cEtiquetteAssignment_4_1; }
		
		//Etiquette
		public RuleCall getEtiquetteEtiquetteParserRuleCall_4_1_0() { return cEtiquetteEtiquetteParserRuleCall_4_1_0; }
		
		//( "," etiquette+=Etiquette)*
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }
		
		//etiquette+=Etiquette
		public Assignment getEtiquetteAssignment_4_2_1() { return cEtiquetteAssignment_4_2_1; }
		
		//Etiquette
		public RuleCall getEtiquetteEtiquetteParserRuleCall_4_2_1_0() { return cEtiquetteEtiquetteParserRuleCall_4_2_1_0; }
		
		//(reponse+=Reponse)+
		public Assignment getReponseAssignment_5() { return cReponseAssignment_5; }
		
		//Reponse
		public RuleCall getReponseReponseParserRuleCall_5_0() { return cReponseReponseParserRuleCall_5_0; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Eduquizz.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt returns ecore::EInt:
		//    '-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class EtiquetteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Eduquizz.Etiquette");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEtiquetteAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNomAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNomEStringParserRuleCall_1_0 = (RuleCall)cNomAssignment_1.eContents().get(0);
		
		//Etiquette returns Etiquette:
		//    {Etiquette}
		//    (nom=EString)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Etiquette}
		//(nom=EString)?
		public Group getGroup() { return cGroup; }
		
		//{Etiquette}
		public Action getEtiquetteAction_0() { return cEtiquetteAction_0; }
		
		//(nom=EString)?
		public Assignment getNomAssignment_1() { return cNomAssignment_1; }
		
		//EString
		public RuleCall getNomEStringParserRuleCall_1_0() { return cNomEStringParserRuleCall_1_0; }
	}
	public class ReponseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xtext.Eduquizz.Reponse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cReponseAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEstVraieAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cEstVraieXKeyword_2_0 = (Keyword)cEstVraieAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTexteAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTexteEStringParserRuleCall_4_0 = (RuleCall)cTexteAssignment_4.eContents().get(0);
		
		//Reponse returns Reponse:
		//    {Reponse}
		//    '['
		//    (estVraie?='x')?
		//    ']'
		//    (texte=EString)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Reponse}
		//'['
		//(estVraie?='x')?
		//']'
		//(texte=EString)?
		public Group getGroup() { return cGroup; }
		
		//{Reponse}
		public Action getReponseAction_0() { return cReponseAction_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//(estVraie?='x')?
		public Assignment getEstVraieAssignment_2() { return cEstVraieAssignment_2; }
		
		//'x'
		public Keyword getEstVraieXKeyword_2_0() { return cEstVraieXKeyword_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
		
		//(texte=EString)?
		public Assignment getTexteAssignment_4() { return cTexteAssignment_4; }
		
		//EString
		public RuleCall getTexteEStringParserRuleCall_4_0() { return cTexteEStringParserRuleCall_4_0; }
	}
	
	
	private final QuestionnaireElements pQuestionnaire;
	private final EStringElements pEString;
	private final EDoubleElements pEDouble;
	private final EBooleanElements pEBoolean;
	private final QuestionElements pQuestion;
	private final EIntElements pEInt;
	private final EtiquetteElements pEtiquette;
	private final ReponseElements pReponse;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EduquizzGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pQuestionnaire = new QuestionnaireElements();
		this.pEString = new EStringElements();
		this.pEDouble = new EDoubleElements();
		this.pEBoolean = new EBooleanElements();
		this.pQuestion = new QuestionElements();
		this.pEInt = new EIntElements();
		this.pEtiquette = new EtiquetteElements();
		this.pReponse = new ReponseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("xtext.Eduquizz".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Questionnaire returns Questionnaire:
	//    'Questionnaire' (nom=EString)?
	//    ('RetourAutorisé' retourAutorise=EBoolean)?
	//    ('Mélanger' melange=EBoolean)?
	//    (question+=Question)+;
	public QuestionnaireElements getQuestionnaireAccess() {
		return pQuestionnaire;
	}
	
	public ParserRule getQuestionnaireRule() {
		return getQuestionnaireAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EDouble returns ecore::EDouble:
	//    '-'? INT? '.' INT (('E'|'e') '-'? INT)?;
	public EDoubleElements getEDoubleAccess() {
		return pEDouble;
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}
	
	//EBoolean returns ecore::EBoolean:
	//    'true' | 'false';
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//Question returns Question:
	//    'Question' (ennonce=EString)?
	//    (reponsesMultiples?='RéponsesMultiples')?
	//    ('Difficulté' difficulte=EInt)?
	//    ('Etiquettes' etiquette+=Etiquette ( "," etiquette+=Etiquette)* )?
	//    (reponse+=Reponse)+;
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}
	
	//EInt returns ecore::EInt:
	//    '-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//Etiquette returns Etiquette:
	//    {Etiquette}
	//    (nom=EString)?;
	public EtiquetteElements getEtiquetteAccess() {
		return pEtiquette;
	}
	
	public ParserRule getEtiquetteRule() {
		return getEtiquetteAccess().getRule();
	}
	
	//Reponse returns Reponse:
	//    {Reponse}
	//    '['
	//    (estVraie?='x')?
	//    ']'
	//    (texte=EString)?;
	public ReponseElements getReponseAccess() {
		return pReponse;
	}
	
	public ParserRule getReponseRule() {
		return getReponseAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
