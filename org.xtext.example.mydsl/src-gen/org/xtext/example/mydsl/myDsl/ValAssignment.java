/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Val Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ValAssignment#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ValAssignment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getValAssignment()
 * @model
 * @generated
 */
public interface ValAssignment extends primary_expression
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' reference.
   * @see #setDeclaration(DECLARATION)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getValAssignment_Declaration()
   * @model
   * @generated
   */
  DECLARATION getDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ValAssignment#getDeclaration <em>Declaration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(DECLARATION value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(LITERAL)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getValAssignment_Value()
   * @model containment="true"
   * @generated
   */
  LITERAL getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ValAssignment#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(LITERAL value);

} // ValAssignment
