/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementLatestVersion;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * The AccountClosingAdditionalInformationRequest message is sent from a
 * financial institution to an organisation as part of the account closing
 * process. This message is sent in response to a closing request message from
 * the organisation, if the business content is valid, but additional
 * information is required.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctClsgAddtlInfReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmReferences
 * AccountClosingAdditionalInformationRequestV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmFrom
 * AccountClosingAdditionalInformationRequestV02.mmFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmOrganisationIdentification
 * AccountClosingAdditionalInformationRequestV02.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmAccountIdentification
 * AccountClosingAdditionalInformationRequestV02.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmAccountServicerIdentification
 * AccountClosingAdditionalInformationRequestV02.mmAccountServicerIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmBalanceTransferAccount
 * AccountClosingAdditionalInformationRequestV02.mmBalanceTransferAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmTransferAccountServicerIdentification
 * AccountClosingAdditionalInformationRequestV02.
 * mmTransferAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmDigitalSignature
 * AccountClosingAdditionalInformationRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmSupplementaryData
 * AccountClosingAdditionalInformationRequestV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.021.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountClosingAdditionalInformationRequestV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AccountClosingAdditionalInformationRequest message is sent from a financial institution to an organisation as part of the account closing process. This message is sent in response to a closing request message from the organisation, if the business content is valid, but additional information is required."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountClosingAdditionalInformationRequestV02", propOrder = {"references", "from", "organisationIdentification", "accountIdentification", "accountServicerIdentification", "balanceTransferAccount",
		"transferAccountServicerIdentification", "digitalSignature", "supplementaryData"})
public class AccountClosingAdditionalInformationRequestV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected References3 references;
	/**
	 * Set of elements for the identification of the message and related
	 * references.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.References3
	 * References3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements for the identification of the message and related references."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReferences = new MMMessageBuildingBlock() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Set of elements for the identification of the message and related references.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> References3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingAdditionalInformationRequestV02.class.getMethod("getReferences", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrganisationIdentification8 from;
	/**
	 * Identifies the business sender of the message, if it is not the account
	 * owner or account servicing financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "From"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the business sender of the message, if it is not the account owner or account servicing financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFrom = new MMMessageBuildingBlock() {
		{
			xmlTag = "Fr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "From";
			definition = "Identifies the business sender of the message, if it is not the account owner or account servicing financial institution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OrganisationIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingAdditionalInformationRequestV02.class.getMethod("getFrom", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrganisationIdentification8 organisationIdentification;
	/**
	 * Identifier for an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for an organisation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOrganisationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentification";
			definition = "Identifier for an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OrganisationIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingAdditionalInformationRequestV02.class.getMethod("getOrganisationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountForAction1 accountIdentification;
	/**
	 * Unique and unambiguous identification of the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1
	 * AccountForAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification of the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountForAction1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingAdditionalInformationRequestV02.class.getMethod("getAccountIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 accountServicerIdentification;
	/**
	 * Unique and unambiguous identifier of a financial institution, as assigned
	 * under an internationally recognised or proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme. \n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountServicerIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIdentification";
			definition = "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme. \n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingAdditionalInformationRequestV02.class.getMethod("getAccountServicerIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountForAction1 balanceTransferAccount;
	/**
	 * Identification of the account to which the remaining positive balance of
	 * the account to be closed must be transferred or account from which funds
	 * can be moved to the account to be closed and which balance is negative.
	 * This account must be held in the same financial institution as the
	 * account to be closed if the transfer account is used to compensate a
	 * negative balance. For a positive balance to be transferred, an account in
	 * another financial institution might be used. In that case the account
	 * servicer is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1
	 * AccountForAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTrfAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the account to which the remaining positive balance of the account to be closed must be transferred or account from which funds can be moved to the account to be closed and which balance is negative. This account must be held in the same financial institution as the account to be closed if the transfer account is used to compensate a negative balance. For a positive balance to be transferred, an account in another financial institution might be used. In that case the account servicer is mandatory."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBalanceTransferAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "BalTrfAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferAccount";
			definition = "Identification of the account to which the remaining positive balance of the account to be closed must be transferred or account from which funds can be moved to the account to be closed and which balance is negative. This account must be held in the same financial institution as the account to be closed if the transfer account is used to compensate a negative balance. For a positive balance to be transferred, an account in another financial institution might be used. In that case the account servicer is mandatory.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountForAction1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingAdditionalInformationRequestV02.class.getMethod("getBalanceTransferAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 transferAccountServicerIdentification;
	/**
	 * Unique and unambiguous identifier of a financial institution, as assigned
	 * under an internationally recognised or proprietary identification scheme,
	 * that is the servicer of the transfer account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfAcctSvcrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme, that is the servicer of the transfer account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransferAccountServicerIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TrfAcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAccountServicerIdentification";
			definition = "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme, that is the servicer of the transfer account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingAdditionalInformationRequestV02.class.getMethod("getTransferAccountServicerIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PartyAndSignature2> digitalSignature;
	/**
	 * Contains the signature with its components, namely signed info, signature
	 * value, key info and the object.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the signature with its components, namely signed info, signature value, key info and the object."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDigitalSignature = new MMMessageBuildingBlock() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Contains the signature with its components, namely signed info, signature value, key info and the object.";
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingAdditionalInformationRequestV02.class.getMethod("getDigitalSignature", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingAdditionalInformationRequestV02.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountClosingAdditionalInformationRequestV02";
				definition = "The AccountClosingAdditionalInformationRequest message is sent from a financial institution to an organisation as part of the account closing process. This message is sent in response to a closing request message from the organisation, if the business content is valid, but additional information is required.";
				rootElement = "Document";
				xmlTag = "AcctClsgAddtlInfReq";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.mmReferences,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.mmFrom, com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.mmOrganisationIdentification,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.mmAccountIdentification,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.mmAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.mmBalanceTransferAccount,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.mmTransferAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.mmDigitalSignature, com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "021";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountClosingAdditionalInformationRequestV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Refs", required = true)
	public References3 getReferences() {
		return references;
	}

	public void setReferences(References3 references) {
		this.references = references;
	}

	@XmlElement(name = "Fr")
	public OrganisationIdentification8 getFrom() {
		return from;
	}

	public void setFrom(OrganisationIdentification8 from) {
		this.from = from;
	}

	@XmlElement(name = "OrgId", required = true)
	public OrganisationIdentification8 getOrganisationIdentification() {
		return organisationIdentification;
	}

	public void setOrganisationIdentification(OrganisationIdentification8 organisationIdentification) {
		this.organisationIdentification = organisationIdentification;
	}

	@XmlElement(name = "AcctId", required = true)
	public AccountForAction1 getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(AccountForAction1 accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	@XmlElement(name = "AcctSvcrId", required = true)
	public BranchAndFinancialInstitutionIdentification5 getAccountServicerIdentification() {
		return accountServicerIdentification;
	}

	public void setAccountServicerIdentification(BranchAndFinancialInstitutionIdentification5 accountServicerIdentification) {
		this.accountServicerIdentification = accountServicerIdentification;
	}

	@XmlElement(name = "BalTrfAcct")
	public AccountForAction1 getBalanceTransferAccount() {
		return balanceTransferAccount;
	}

	public void setBalanceTransferAccount(AccountForAction1 balanceTransferAccount) {
		this.balanceTransferAccount = balanceTransferAccount;
	}

	@XmlElement(name = "TrfAcctSvcrId")
	public BranchAndFinancialInstitutionIdentification5 getTransferAccountServicerIdentification() {
		return transferAccountServicerIdentification;
	}

	public void setTransferAccountServicerIdentification(BranchAndFinancialInstitutionIdentification5 transferAccountServicerIdentification) {
		this.transferAccountServicerIdentification = transferAccountServicerIdentification;
	}

	@XmlElement(name = "DgtlSgntr")
	public List<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(List<PartyAndSignature2> digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.021.02.02")
	static public class Document {
		@XmlElement(name = "AcctClsgAddtlInfReq", required = true)
		public AccountClosingAdditionalInformationRequestV02 messageBody;
	}
}