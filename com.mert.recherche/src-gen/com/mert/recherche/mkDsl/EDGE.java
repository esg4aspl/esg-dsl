/**
 * generated by Xtext 2.25.0
 */
package com.mert.recherche.mkDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDGE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mert.recherche.mkDsl.EDGE#getName <em>Name</em>}</li>
 *   <li>{@link com.mert.recherche.mkDsl.EDGE#getSource <em>Source</em>}</li>
 *   <li>{@link com.mert.recherche.mkDsl.EDGE#getTarget <em>Target</em>}</li>
 *   <li>{@link com.mert.recherche.mkDsl.EDGE#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see com.mert.recherche.mkDsl.MkDslPackage#getEDGE()
 * @model
 * @generated
 */
public interface EDGE extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.mert.recherche.mkDsl.MkDslPackage#getEDGE_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.mert.recherche.mkDsl.EDGE#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(int)
   * @see com.mert.recherche.mkDsl.MkDslPackage#getEDGE_Source()
   * @model
   * @generated
   */
  int getSource();

  /**
   * Sets the value of the '{@link com.mert.recherche.mkDsl.EDGE#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(int value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(int)
   * @see com.mert.recherche.mkDsl.MkDslPackage#getEDGE_Target()
   * @model
   * @generated
   */
  int getTarget();

  /**
   * Sets the value of the '{@link com.mert.recherche.mkDsl.EDGE#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(int value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(COLOR)
   * @see com.mert.recherche.mkDsl.MkDslPackage#getEDGE_Color()
   * @model containment="true"
   * @generated
   */
  COLOR getColor();

  /**
   * Sets the value of the '{@link com.mert.recherche.mkDsl.EDGE#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(COLOR value);

} // EDGE
