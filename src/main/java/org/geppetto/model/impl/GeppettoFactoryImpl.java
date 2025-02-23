/**
 */
package org.geppetto.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.geppetto.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeppettoFactoryImpl extends EFactoryImpl implements GeppettoFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeppettoFactory init()
	{
		try
		{
			GeppettoFactory theGeppettoFactory = (GeppettoFactory)EPackage.Registry.INSTANCE.getEFactory(GeppettoPackage.eNS_URI);
			if (theGeppettoFactory != null)
			{
				return theGeppettoFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeppettoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case GeppettoPackage.GEPPETTO_MODEL: return createGeppettoModel();
			case GeppettoPackage.GEPPETTO_LIBRARY: return createGeppettoLibrary();
			case GeppettoPackage.LIBRARY_MANAGER: return createLibraryManager();
			case GeppettoPackage.EXPERIMENT_STATE: return createExperimentState();
			case GeppettoPackage.VARIABLE_VALUE: return createVariableValue();
			case GeppettoPackage.TAG: return createTag();
			case GeppettoPackage.DOMAIN_MODEL: return createDomainModel();
			case GeppettoPackage.MODEL_FORMAT: return createModelFormat();
			case GeppettoPackage.EXTERNAL_DOMAIN_MODEL: return createExternalDomainModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case GeppettoPackage.FILE_FORMAT:
				return createFileFormatFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case GeppettoPackage.FILE_FORMAT:
				return convertFileFormatToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoModel createGeppettoModel()
	{
		GeppettoModelImpl geppettoModel = new GeppettoModelImpl();
		return geppettoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoLibrary createGeppettoLibrary()
	{
		GeppettoLibraryImpl geppettoLibrary = new GeppettoLibraryImpl();
		return geppettoLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryManager createLibraryManager()
	{
		LibraryManagerImpl libraryManager = new LibraryManagerImpl();
		return libraryManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentState createExperimentState()
	{
		ExperimentStateImpl experimentState = new ExperimentStateImpl();
		return experimentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableValue createVariableValue()
	{
		VariableValueImpl variableValue = new VariableValueImpl();
		return variableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag()
	{
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel()
	{
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFormat createModelFormat()
	{
		ModelFormatImpl modelFormat = new ModelFormatImpl();
		return modelFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDomainModel createExternalDomainModel()
	{
		ExternalDomainModelImpl externalDomainModel = new ExternalDomainModelImpl();
		return externalDomainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileFormat createFileFormatFromString(EDataType eDataType, String initialValue)
	{
		FileFormat result = FileFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileFormatToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeppettoPackage getGeppettoPackage()
	{
		return (GeppettoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeppettoPackage getPackage()
	{
		return GeppettoPackage.eINSTANCE;
	}

} //GeppettoFactoryImpl
