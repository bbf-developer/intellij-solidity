package me.serce.solidity.lang.core

import com.intellij.core.CoreApplicationEnvironment
import com.intellij.lang.LanguageExtensionPoint
import com.intellij.openapi.extensions.Extensions
import com.intellij.rt.execution.junit.FileComparisonFailure
import com.intellij.testFramework.ParsingTestCase
import org.junit.Assert

abstract class SolidityParsingTestBase(baseDir: String) : ParsingTestCase(baseDir, "sol", true, SolidityParserDefinition()) {

  override fun setUp() {
    super.setUp()
    CoreApplicationEnvironment.registerExtensionPoint(
      Extensions.getRootArea(), "com.intellij.lang.braceMatcher", LanguageExtensionPoint::class.java)
  }

  /**
   * This method is needed because in 2017.1 support for FileComparisonFailure was broken
   */
  override fun doTest(checkResult: Boolean) {
    try {
      super.doTest(checkResult)
    } catch (e: FileComparisonFailure) {
      Assert.assertEquals(e.expected, e.actual)
    }
  }

  override fun getTestDataPath() = "src/test/resources"
}

class SolidityCompleteCustomParsingTest : SolidityParsingTestBase("fixtures/parser") {
  fun testPragma() = doTest(true)
  fun testArrays() = doTest(true)
  fun testArithmetic() = doTest(true)
  fun testAssignments() = doTest(true)
  fun testAssembly() = doTest(true)
  fun testComments() = doTest(true)
  fun testCallChain() = doTest(true)
  fun testLibrary() = doTest(true)
  fun testLiterals() = doTest(true)
  fun testImports() = doTest(true)
  fun testEnums() = doTest(true)
  fun testMappings() = doTest(true)
  fun testModifiers() = doTest(true)
  fun testEvent() = doTest(true)
  fun testFunctions() = doTest(true)
  fun testStateVars() = doTest(true)
  fun testTernary() = doTest(true)
  fun testReturnTuples() = doTest(true)
  fun testMapInvoke() = doTest(true)
  fun testNewArray() = doTest(true)
  fun testDestructuring() = doTest(true)
  fun testContractWithLiterals() = doTest(true)
  fun testContractWithDifferentFields() = doTest(true)
}

class SolidityCompleteOfficialSuccessfulParsingTest :
  SolidityParsingTestBase("fixtures/parser/solidity_official_tests/shouldSucceed") {
  fun testArraysInEvents() = doTest(true)
  fun testArraysInExpressions() = doTest(true)
  fun testArraysInStorage() = doTest(true)
  fun testCallingFunction() = doTest(true)
  fun testCommentEndWithDoubleStar() = doTest(true)
  fun testComplexExpression() = doTest(true)
  fun testComplexImport() = doTest(true)
//  fun testConditionalMultiple() = doTest(true)
  fun testConditionalTrueFalseLiteral() = doTest(true)
  fun testConditionalWithAssignment() = doTest(true)
  fun testConditionalWithConstants() = doTest(true)
  fun testConditionalWithVariables() = doTest(true)
  fun testContractInheritance() = doTest(true)
  fun testContractMultipleInheritance() = doTest(true)
  fun testContractMultipleInheritanceWithArguments() = doTest(true)
  fun testDeclaringFixedAndUfixedVariables() = doTest(true)
  fun testDeclaringFixedLiteralVariables() = doTest(true)
  fun testElseIfStatement() = doTest(true)
  fun testEmptyComment() = doTest(true)
  fun testEmptyFunction() = doTest(true)
  fun testEnumValidDeclaration() = doTest(true)
  fun testEvent() = doTest(true)
  fun testEventArguments() = doTest(true)
  fun testEventArgumentsIndexed() = doTest(true)
  fun testExpExpression() = doTest(true)
  fun testExternalFunction() = doTest(true)
  fun testFallbackFunction() = doTest(true)
  fun testForLoopSimpleInitexpr() = doTest(true)
  fun testForLoopSimpleNoexpr() = doTest(true)
  fun testForLoopSingleStmtBody() = doTest(true)
  fun testForLoopVardefInitexpr() = doTest(true)
  fun testFromIsNotKeyword() = doTest(true)
  fun testFunctionNatspecDocumentation() = doTest(true)
  fun testFunctionNoBody() = doTest(true)
  fun testFunctionNormalComments() = doTest(true)
  fun testFunctionTypeAsParameter() = doTest(true)
  fun testFunctionTypeAsStorageVariable() = doTest(true)
  fun testFunctionTypeAsStorageVariableWithAssignment() = doTest(true)
  fun testFunctionTypeInExpression() = doTest(true)
  fun testFunctionTypeInStruct() = doTest(true)
  fun testFunctionTypeStateVariable() = doTest(true)
  fun testIfStatement() = doTest(true)
  fun testImportDirective() = doTest(true)
  fun testInlineArrayDeclaration() = doTest(true)
  fun testLibrarySimple() = doTest(true)
  fun testLiteralConstantsWithEtherSubdenominations() = doTest(true)
  fun testLiteralConstantsWithEtherSubdenominationsInExpressions() = doTest(true)
  fun testLocationSpecifiersForLocals() = doTest(true)
  fun testLocationSpecifiersForParams() = doTest(true)
  fun testMapping() = doTest(true)
  fun testMappingAndArrayOfFunctions() = doTest(true)
  fun testMappingInStruct() = doTest(true)
  fun testMappingToMappingInStruct() = doTest(true)
  fun testMemberAccessParserAmbiguity() = doTest(true)
  fun testModifier() = doTest(true)
  fun testModifierArguments() = doTest(true)
  fun testModifierInvocation() = doTest(true)
  fun testMultiArrays() = doTest(true)
  fun testMultiVariableDeclaration() = doTest(true)
  fun testMultilineFunctionDocumentation() = doTest(true)
  fun testMultipleContracts() = doTest(true)
  fun testMultipleContractsAndImports() = doTest(true)
  fun testMultipleFunctionsNatspecDocumentation() = doTest(true)
  fun testNatspecCommentInFunctionBody() = doTest(true)
  fun testNatspecDocstringAfterSignature() = doTest(true)
  fun testNatspecDocstringBetweenKeywordAndSignature() = doTest(true)
  fun testNoFunctionParams() = doTest(true)
  fun testOperatorExpression() = doTest(true)
  fun testOverloadedFunctions() = doTest(true)
  fun testPlaceholderInFunctionContext() = doTest(true)
  fun testSingleFunctionParam() = doTest(true)
  fun testSmokeTest() = doTest(true)
  fun testStatementStartingWithTypeConversion() = doTest(true)
  fun testStructDefinition() = doTest(true)
  fun testTuples() = doTest(true)
  fun testTwoExactFunctions() = doTest(true)
  fun testTypeConversionToDynamicArray() = doTest(true)
  fun testUsingFor() = doTest(true)
  fun testVariableDefinition() = doTest(true)
  fun testVariableDefinitionWithInitialization() = doTest(true)
  fun testVisibilitySpecifiers() = doTest(true)
  fun testWhileLoop() = doTest(true)
}

class SolidityCompleteOfficialFailingParsingTest :
  SolidityParsingTestBase("fixtures/parser/solidity_official_tests/shouldFail") {
  fun testConstantIsKeyword() = doTest(true)
//  fun testEmptyEnumDeclaration() = doTest(true)
  fun testExternalVariable() = doTest(true)
  fun testFunctionTypeAsStorageVariableWithModifiers() = doTest(true)
  fun testInlineArrayEmptyCellsCheckLvalue() = doTest(true)
  fun testInlineArrayEmptyCellsCheckWithoutLvalue() = doTest(true)
  fun testInvalidFixedConversionLeadingZeroesCheck() = doTest(true)
  fun testLocalConstVariable() = doTest(true)
  fun testLocationSpecifiersForState() = doTest(true)
  fun testLocationSpecifiersWithVar() = doTest(true)
  fun testMalformedEnumDeclaration() = doTest(true)
  fun testMissingArgumentInNamedArgs() = doTest(true)
  fun testMissingParameterNameInNamedArgs() = doTest(true)
  fun testMissingVariableNameInDeclaration() = doTest(true)
  fun testModifierWithoutSemicolon() = doTest(true)
  fun testMultipleVisibilitySpecifiers() = doTest(true)
  fun testNoDoubleRadixInFixedLiteral() = doTest(true)
  fun testPayableAccessor() = doTest(true)
  fun testVarArray() = doTest(true)
//  fun testVariableDefinitionInFunctionParameter() = doTest(true)
//  fun testVariableDefinitionInFunctionReturn() = doTest(true)
//  fun testVariableDefinitionInMapping() = doTest(true)
}