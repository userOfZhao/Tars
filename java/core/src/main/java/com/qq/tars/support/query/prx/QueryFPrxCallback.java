/**
 * Tencent is pleased to support the open source community by making Tars available.
 *
 * Copyright (C) 2016 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.support.query.prx;

import com.qq.tars.rpc.protocol.tars.support.TarsAbstractCallback;

/** 
 * 获取对象endpoint的query接口
 */
public abstract class QueryFPrxCallback extends TarsAbstractCallback {

	public abstract void callback_findObjectById(java.util.List<EndpointF> ret);

	public abstract void callback_findObjectById4Any(int ret, java.util.List<EndpointF> activeEp, java.util.List<EndpointF> inactiveEp);

	public abstract void callback_findObjectById4All(int ret, java.util.List<EndpointF> activeEp, java.util.List<EndpointF> inactiveEp);

	public abstract void callback_findObjectByIdInSameGroup(int ret, java.util.List<EndpointF> activeEp, java.util.List<EndpointF> inactiveEp);

	public abstract void callback_findObjectByIdInSameStation(int ret, java.util.List<EndpointF> activeEp, java.util.List<EndpointF> inactiveEp);

	public abstract void callback_findObjectByIdInSameSet(int ret, java.util.List<EndpointF> activeEp, java.util.List<EndpointF> inactiveEp);

}
