/**
 */
package metaModel.impl;

import java.lang.reflect.InvocationTargetException;

import metaModel.ECDSA;
import metaModel.MetaModelPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECDSA</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ECDSAImpl extends MinimalEObjectImpl.Container implements ECDSA {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECDSAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.ECDSA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void recover() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void toEthSignedMessageHash() {
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
		case MetaModelPackage.ECDSA___RECOVER:
			recover();
			return null;
		case MetaModelPackage.ECDSA___TO_ETH_SIGNED_MESSAGE_HASH:
			toEthSignedMessageHash();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ECDSAImpl
