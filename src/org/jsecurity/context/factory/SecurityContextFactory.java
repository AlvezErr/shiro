/*
* Copyright (C) 2005-2007 Jeremy Haile, Les Hazlewood
*
* This library is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as published
* by the Free Software Foundation; either version 2.1 of the License, or
* (at your option) any later version.
*
* This library is distributed in the hope that it will be useful, but
* WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
* or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
* Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this library; if not, write to the
*
* Free Software Foundation, Inc.
* 59 Temple Place, Suite 330
* Boston, MA 02111-1307
* USA
*
* Or, you may view it online at
* http://www.opensource.org/licenses/lgpl-license.php
*/
package org.jsecurity.context.factory;

import org.jsecurity.authc.Account;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.context.SecurityContext;

/**
 * <p>Factory used to create the SecurityContext that is returned from the
 * {@link org.jsecurity.authc.Authenticator}.
 *
 * @since 0.1
 * @author Jeremy Haile
 * @author Les Hazlewood
 */
public interface SecurityContextFactory {

    /**
     * Returns an implementation of the SecurityContext instance for the
     * given account data after a successful authentication.
     * @param token the authentication token submitted for authentication attempt
     * @param account Account created as a result of the successful authentication
     * @return a SecurityContext for the corresponding subject that will be used by the application.
     */
    SecurityContext createSecurityContext( AuthenticationToken token, Account account );

}