/**
 * Copyright 2013 ForgeRock, Inc.
 *
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 */
package org.forgerock.openam.cts.api.tokens;

import javax.inject.Inject;
import com.iplanet.dpro.session.SessionID;
import com.iplanet.dpro.session.service.InternalSession;
import org.forgerock.openam.cts.api.fields.OAuthTokenField;
import org.forgerock.openam.cts.utils.KeyConversion;

import java.util.UUID;

/**
 * Responsible for generating Token Ids and for converting objects into their corresponding Token Ids.
 *
 * @author robert.wapshott@forgerock.com
 */
public class TokenIdFactory {

    private KeyConversion encoding;
    public static final String ID = OAuthTokenField.ID.getOAuthField();

    @Inject
    public TokenIdFactory(KeyConversion encoding) {
        this.encoding = encoding;
    }

    /**
     * @param requestId The request Id to convert to a Token Id.
     * @return Non null Token Id.
     */
    public String toSAMLPrimaryTokenId(String requestId) {
        return encoding.encodeKey(requestId);
    }

    /**
     * @param secondaryKey The secondary key to convert to a Token Id.
     * @return Non null Token Id.
     */
    public String toSAMLSecondaryTokenId(String secondaryKey) {
        return encoding.encodeKey(secondaryKey);
    }

    /**
     * Extract a suitable Id from the InternalSession to use as a Token Id.
     *
     * @param session InternalSession to use.
     * @return Non null Token Id.
     */
    public String toSessionTokenId(InternalSession session) {
        return toSessionTokenId(session.getID());
    }

    /**
     * Extract a suitable Id from the SessionId to use as the Token Id.
     *
     * @param sessionID SessionID to use.
     * @return Non null Token Id.
     */
    public String toSessionTokenId(SessionID sessionID) {
        return encoding.encryptKey(sessionID);
    }

    /**
     * Checks that the given id is not null, if so will generate an unique id, and then returns the non-null id.
     *
     * @param id The ID of the OAuth Token.
     * @return Non null Token Id.
     */
    public String getOAuthTokenId(String id) {

        if (id == null){
            id = UUID.randomUUID().toString();
        }

        return id;
    }
}
