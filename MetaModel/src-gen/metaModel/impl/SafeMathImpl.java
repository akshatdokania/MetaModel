/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import metaModel.MetaModelPackage;
import metaModel.SafeMath;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safe Math</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SafeMathImpl extends MinimalEObjectImpl.Container implements SafeMath {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafeMathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.SAFE_MATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int safeMul(int a, int b) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int safeDiv(int a, int b) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int safeAdd(int a, int b) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int safeSub(int a, int b) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetaModelPackage.SAFE_MATH___SAFE_MUL__INT_INT:
			return safeMul((Integer) arguments.get(0), (Integer) arguments.get(1));
		case MetaModelPackage.SAFE_MATH___SAFE_DIV__INT_INT:
			return safeDiv((Integer) arguments.get(0), (Integer) arguments.get(1));
		case MetaModelPackage.SAFE_MATH___SAFE_ADD__INT_INT:
			return safeAdd((Integer) arguments.get(0), (Integer) arguments.get(1));
		case MetaModelPackage.SAFE_MATH___SAFE_SUB__INT_INT:
			return safeSub((Integer) arguments.get(0), (Integer) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SafeMathImpl
