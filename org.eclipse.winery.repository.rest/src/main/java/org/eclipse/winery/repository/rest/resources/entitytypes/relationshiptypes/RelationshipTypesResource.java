/*******************************************************************************
 * Copyright (c) 2012-2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *******************************************************************************/
package org.eclipse.winery.repository.rest.resources.entitytypes.relationshiptypes;

import io.swagger.annotations.Api;
import org.eclipse.winery.repository.rest.resources._support.AbstractComponentsWithoutTypeReferenceResource;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Api(tags = "Relationship Types")
public class RelationshipTypesResource extends AbstractComponentsWithoutTypeReferenceResource<RelationshipTypeResource> {
    @Path("{namespace}/{id}/")
    public RelationshipTypeResource getComponentInstanceResource(@PathParam("namespace") String namespace, @PathParam("id") String id) {
        return this.getComponentInstanceResource(namespace, id, true);
    }
}
