/**
 * Copyright 2016-2017 The Reaktivity Project
 *
 * The Reaktivity Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.reaktivity.specification.nukleus.control;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.rules.RuleChain.outerRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.kaazing.k3po.junit.annotation.Specification;
import org.kaazing.k3po.junit.rules.K3poRule;

public class ControlIT
{
    private final K3poRule k3po = new K3poRule();

    private final TestRule timeout = new DisableOnDebug(new Timeout(5, SECONDS));

    @Rule
    public final TestRule chain = outerRule(k3po).around(timeout);

    @Test
    @Specification({
        "route/input/none/nukleus",
        "route/input/none/controller"
    })
    public void shouldRouteInputNone() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/input/new/nukleus",
        "route/input/new/controller"
    })
    public void shouldRouteInputNew() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/input/established/nukleus",
        "route/input/established/controller"
    })
    public void shouldRouteInputEstablished() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/output/none/nukleus",
        "route/output/none/controller"
    })
    public void shouldRouteOutputNone() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/output/new/nukleus",
        "route/output/new/controller"
    })
    public void shouldRouteOutputNew() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/output/established/nukleus",
        "route/output/established/controller"
    })
    public void shouldRouteOutputEstablished() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/input/none/nukleus",
        "route/input/none/controller",
        "unroute/input/none/nukleus",
        "unroute/input/none/controller"
    })
    public void shouldUnrouteInputNone() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/input/new/nukleus",
        "route/input/new/controller",
        "unroute/input/new/nukleus",
        "unroute/input/new/controller"
    })
    public void shouldUnrouteInputNew() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/input/established/nukleus",
        "route/input/established/controller",
        "unroute/input/established/nukleus",
        "unroute/input/established/controller"
    })
    public void shouldUnrouteInputEstablished() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/output/none/nukleus",
        "route/output/none/controller",
        "unroute/output/none/nukleus",
        "unroute/output/none/controller"
    })
    public void shouldUnrouteOutputNone() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/output/new/nukleus",
        "route/output/new/controller",
        "unroute/output/new/nukleus",
        "unroute/output/new/controller"
    })
    public void shouldUnrouteOutputNew() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/output/established/nukleus",
        "route/output/established/controller",
        "unroute/output/established/nukleus",
        "unroute/output/established/controller"
    })
    public void shouldUnrouteOutputEstablished() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/input/new/nukleus",
        "route/input/new/controller",
        "authorize/succeeds/nukleus",
        "authorize/succeeds/controller"
    })
    public void shouldAuthorize() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/input/new/nukleus",
        "route/input/new/controller",
        "authorize/fails.too.many.roles/nukleus",
        "authorize/fails.too.many.roles/controller"
    })
    public void shouldFailToAuthorizeMoreThan48Roles() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "route/input/new/nukleus",
        "route/input/new/controller",
        "authorize/succeeds/nukleus",
        "authorize/succeeds/controller",
        "unauthorize/nukleus",
        "unauthorize/controller"
    })
    public void shouldUnauthorize() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "resolve/succeeds/nukleus",
        "resolve/succeeds/controller"
    })
    public void shouldResolve() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "resolve/fails.too.many.roles/nukleus",
        "resolve/fails.too.many.roles/controller"
    })
    public void shouldFailToResolveMoreThan48Roles() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "resolve/succeeds/nukleus",
        "resolve/succeeds/controller",
        "unresolve/succeeds/nukleus",
        "unresolve/succeeds/controller"
    })
    public void shouldUnresolve() throws Exception
    {
        k3po.finish();
    }

    @Test
    @Specification({
        "unresolve/fails.unknown.role/nukleus",
        "unresolve/fails.unknown.role/controller"
    })
    public void shouldFailToUnresolveUnknownRole() throws Exception
    {
        k3po.finish();
    }

}
