/*
 * generated by Xtext 2.37.0
 */
grammar InternalEduquizz;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleQuestionnaire
entryRuleQuestionnaire
:
{ before(grammarAccess.getQuestionnaireRule()); }
	 ruleQuestionnaire
{ after(grammarAccess.getQuestionnaireRule()); } 
	 EOF 
;

// Rule Questionnaire
ruleQuestionnaire 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQuestionnaireAccess().getGroup()); }
		(rule__Questionnaire__Group__0)
		{ after(grammarAccess.getQuestionnaireAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEBoolean
entryRuleEBoolean
:
{ before(grammarAccess.getEBooleanRule()); }
	 ruleEBoolean
{ after(grammarAccess.getEBooleanRule()); } 
	 EOF 
;

// Rule EBoolean
ruleEBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEBooleanAccess().getAlternatives()); }
		(rule__EBoolean__Alternatives)
		{ after(grammarAccess.getEBooleanAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQuestion
entryRuleQuestion
:
{ before(grammarAccess.getQuestionRule()); }
	 ruleQuestion
{ after(grammarAccess.getQuestionRule()); } 
	 EOF 
;

// Rule Question
ruleQuestion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQuestionAccess().getGroup()); }
		(rule__Question__Group__0)
		{ after(grammarAccess.getQuestionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEInt
entryRuleEInt
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntAccess().getGroup()); }
		(rule__EInt__Group__0)
		{ after(grammarAccess.getEIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEtiquette
entryRuleEtiquette
:
{ before(grammarAccess.getEtiquetteRule()); }
	 ruleEtiquette
{ after(grammarAccess.getEtiquetteRule()); } 
	 EOF 
;

// Rule Etiquette
ruleEtiquette 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEtiquetteAccess().getGroup()); }
		(rule__Etiquette__Group__0)
		{ after(grammarAccess.getEtiquetteAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReponse
entryRuleReponse
:
{ before(grammarAccess.getReponseRule()); }
	 ruleReponse
{ after(grammarAccess.getReponseRule()); } 
	 EOF 
;

// Rule Reponse
ruleReponse 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReponseAccess().getGroup()); }
		(rule__Reponse__Group__0)
		{ after(grammarAccess.getReponseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EBoolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
		'true'
		{ after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
		'false'
		{ after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Questionnaire__Group__0__Impl
	rule__Questionnaire__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); }
	'Questionnaire'
	{ after(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Questionnaire__Group__1__Impl
	rule__Questionnaire__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionnaireAccess().getNomAssignment_1()); }
	(rule__Questionnaire__NomAssignment_1)?
	{ after(grammarAccess.getQuestionnaireAccess().getNomAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Questionnaire__Group__2__Impl
	rule__Questionnaire__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionnaireAccess().getGroup_2()); }
	(rule__Questionnaire__Group_2__0)?
	{ after(grammarAccess.getQuestionnaireAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Questionnaire__Group__3__Impl
	rule__Questionnaire__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionnaireAccess().getGroup_3()); }
	(rule__Questionnaire__Group_3__0)?
	{ after(grammarAccess.getQuestionnaireAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Questionnaire__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_4()); }
		(rule__Questionnaire__QuestionAssignment_4)
		{ after(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_4()); }
	)
	(
		{ before(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_4()); }
		(rule__Questionnaire__QuestionAssignment_4)*
		{ after(grammarAccess.getQuestionnaireAccess().getQuestionAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Questionnaire__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Questionnaire__Group_2__0__Impl
	rule__Questionnaire__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionnaireAccess().getRetourAutorisKeyword_2_0()); }
	'RetourAutoris\u00E9'
	{ after(grammarAccess.getQuestionnaireAccess().getRetourAutorisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Questionnaire__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionnaireAccess().getRetourAutoriseAssignment_2_1()); }
	(rule__Questionnaire__RetourAutoriseAssignment_2_1)
	{ after(grammarAccess.getQuestionnaireAccess().getRetourAutoriseAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Questionnaire__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Questionnaire__Group_3__0__Impl
	rule__Questionnaire__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionnaireAccess().getMLangerKeyword_3_0()); }
	'M\u00E9langer'
	{ after(grammarAccess.getQuestionnaireAccess().getMLangerKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Questionnaire__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionnaireAccess().getMelangeAssignment_3_1()); }
	(rule__Questionnaire__MelangeAssignment_3_1)
	{ after(grammarAccess.getQuestionnaireAccess().getMelangeAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__0__Impl
	rule__Question__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); }
	'Question'
	{ after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__1__Impl
	rule__Question__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getEnnonceAssignment_1()); }
	(rule__Question__EnnonceAssignment_1)?
	{ after(grammarAccess.getQuestionAccess().getEnnonceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__2__Impl
	rule__Question__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getReponsesMultiplesAssignment_2()); }
	(rule__Question__ReponsesMultiplesAssignment_2)?
	{ after(grammarAccess.getQuestionAccess().getReponsesMultiplesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__3__Impl
	rule__Question__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getGroup_3()); }
	(rule__Question__Group_3__0)?
	{ after(grammarAccess.getQuestionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__4__Impl
	rule__Question__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getGroup_4()); }
	(rule__Question__Group_4__0)?
	{ after(grammarAccess.getQuestionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getQuestionAccess().getReponseAssignment_5()); }
		(rule__Question__ReponseAssignment_5)
		{ after(grammarAccess.getQuestionAccess().getReponseAssignment_5()); }
	)
	(
		{ before(grammarAccess.getQuestionAccess().getReponseAssignment_5()); }
		(rule__Question__ReponseAssignment_5)*
		{ after(grammarAccess.getQuestionAccess().getReponseAssignment_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group_3__0__Impl
	rule__Question__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getDifficultKeyword_3_0()); }
	'Difficult\u00E9'
	{ after(grammarAccess.getQuestionAccess().getDifficultKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getDifficulteAssignment_3_1()); }
	(rule__Question__DifficulteAssignment_3_1)
	{ after(grammarAccess.getQuestionAccess().getDifficulteAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group_4__0__Impl
	rule__Question__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getEtiquettesKeyword_4_0()); }
	'Etiquettes'
	{ after(grammarAccess.getQuestionAccess().getEtiquettesKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group_4__1__Impl
	rule__Question__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getEtiquetteAssignment_4_1()); }
	(rule__Question__EtiquetteAssignment_4_1)
	{ after(grammarAccess.getQuestionAccess().getEtiquetteAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getGroup_4_2()); }
	(rule__Question__Group_4_2__0)*
	{ after(grammarAccess.getQuestionAccess().getGroup_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group_4_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group_4_2__0__Impl
	rule__Question__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group_4_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getCommaKeyword_4_2_0()); }
	','
	{ after(grammarAccess.getQuestionAccess().getCommaKeyword_4_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group_4_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group_4_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getEtiquetteAssignment_4_2_1()); }
	(rule__Question__EtiquetteAssignment_4_2_1)
	{ after(grammarAccess.getQuestionAccess().getEtiquetteAssignment_4_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Etiquette__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Etiquette__Group__0__Impl
	rule__Etiquette__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Etiquette__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEtiquetteAccess().getEtiquetteAction_0()); }
	()
	{ after(grammarAccess.getEtiquetteAccess().getEtiquetteAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Etiquette__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Etiquette__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Etiquette__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEtiquetteAccess().getNomAssignment_1()); }
	(rule__Etiquette__NomAssignment_1)?
	{ after(grammarAccess.getEtiquetteAccess().getNomAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Reponse__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reponse__Group__0__Impl
	rule__Reponse__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Reponse__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReponseAccess().getReponseAction_0()); }
	()
	{ after(grammarAccess.getReponseAccess().getReponseAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reponse__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reponse__Group__1__Impl
	rule__Reponse__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Reponse__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReponseAccess().getLeftSquareBracketKeyword_1()); }
	'['
	{ after(grammarAccess.getReponseAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reponse__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reponse__Group__2__Impl
	rule__Reponse__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Reponse__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReponseAccess().getEstVraieAssignment_2()); }
	(rule__Reponse__EstVraieAssignment_2)?
	{ after(grammarAccess.getReponseAccess().getEstVraieAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reponse__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reponse__Group__3__Impl
	rule__Reponse__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Reponse__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReponseAccess().getRightSquareBracketKeyword_3()); }
	']'
	{ after(grammarAccess.getReponseAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reponse__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reponse__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Reponse__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReponseAccess().getTexteAssignment_4()); }
	(rule__Reponse__TexteAssignment_4)?
	{ after(grammarAccess.getReponseAccess().getTexteAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Questionnaire__NomAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionnaireAccess().getNomEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getQuestionnaireAccess().getNomEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__RetourAutoriseAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionnaireAccess().getRetourAutoriseEBooleanParserRuleCall_2_1_0()); }
		ruleEBoolean
		{ after(grammarAccess.getQuestionnaireAccess().getRetourAutoriseEBooleanParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__MelangeAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionnaireAccess().getMelangeEBooleanParserRuleCall_3_1_0()); }
		ruleEBoolean
		{ after(grammarAccess.getQuestionnaireAccess().getMelangeEBooleanParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Questionnaire__QuestionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_4_0()); }
		ruleQuestion
		{ after(grammarAccess.getQuestionnaireAccess().getQuestionQuestionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__EnnonceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getEnnonceEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getQuestionAccess().getEnnonceEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__ReponsesMultiplesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getReponsesMultiplesRPonsesMultiplesKeyword_2_0()); }
		(
			{ before(grammarAccess.getQuestionAccess().getReponsesMultiplesRPonsesMultiplesKeyword_2_0()); }
			'R\u00E9ponsesMultiples'
			{ after(grammarAccess.getQuestionAccess().getReponsesMultiplesRPonsesMultiplesKeyword_2_0()); }
		)
		{ after(grammarAccess.getQuestionAccess().getReponsesMultiplesRPonsesMultiplesKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__DifficulteAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getDifficulteEIntParserRuleCall_3_1_0()); }
		ruleEInt
		{ after(grammarAccess.getQuestionAccess().getDifficulteEIntParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__EtiquetteAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_4_1_0()); }
		ruleEtiquette
		{ after(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__EtiquetteAssignment_4_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_4_2_1_0()); }
		ruleEtiquette
		{ after(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_4_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__ReponseAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_5_0()); }
		ruleReponse
		{ after(grammarAccess.getQuestionAccess().getReponseReponseParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Etiquette__NomAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEtiquetteAccess().getNomEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getEtiquetteAccess().getNomEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reponse__EstVraieAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReponseAccess().getEstVraieXKeyword_2_0()); }
		(
			{ before(grammarAccess.getReponseAccess().getEstVraieXKeyword_2_0()); }
			'x'
			{ after(grammarAccess.getReponseAccess().getEstVraieXKeyword_2_0()); }
		)
		{ after(grammarAccess.getReponseAccess().getEstVraieXKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reponse__TexteAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReponseAccess().getTexteEStringParserRuleCall_4_0()); }
		ruleEString
		{ after(grammarAccess.getReponseAccess().getTexteEStringParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
