/*
 * Copyright 2010-2011 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.util.entity.dao;

import java.util.List;
import java.util.UUID;

import com.ning.billing.util.callcontext.InternalCallContext;
import com.ning.billing.util.callcontext.InternalTenantContext;
import com.ning.billing.util.entity.Entity;
import com.ning.billing.util.entity.EntityPersistenceException;

public interface EntityDao<T extends Entity> {

    public void create(T entity, InternalCallContext context) throws EntityPersistenceException;

    public Long getRecordId(UUID id, InternalTenantContext context);

    public T getByRecordId(Long recordId, InternalTenantContext context);

    public T getById(UUID id, InternalTenantContext context);

    public List<T> get(InternalTenantContext context);

    public void test(InternalTenantContext context);
}