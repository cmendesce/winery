/*******************************************************************************
 * Copyright (c) 2013-2018 Contributors to the Eclipse Foundation
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

package org.eclipse.winery.model.tosca;

import org.eclipse.jdt.annotation.NonNull;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.winery.model.tosca.visitor.Visitor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tExportedInterface", propOrder = {
    "operation"
})
public class TExportedInterface implements HasName {

    @XmlElement(name = "Operation", required = true)
    protected List<TExportedOperation> operation;

    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anyURI")
    @NonNull
    protected String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TExportedInterface)) return false;
        TExportedInterface that = (TExportedInterface) o;
        return Objects.equals(operation, that.operation) &&
            Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, name);
    }

    @NonNull
    public List<TExportedOperation> getOperation() {
        if (operation == null) {
            operation = new ArrayList<TExportedOperation>();
        }
        return this.operation;
    }

    @NonNull
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(@NonNull String value) {
        Objects.requireNonNull(value);
        this.name = value;
    }

    public void accept(Visitor visitor) {
        visitor.accept(this);
    }
}
