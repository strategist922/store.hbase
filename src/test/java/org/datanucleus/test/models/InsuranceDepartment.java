/**********************************************************************
 * Copyright (c) 2010 Ghais Issa and others. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Contributors :
 * ...
 ************************************************************************/

package org.datanucleus.test.models;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable(detachable = "true")
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)
public class InsuranceDepartment extends Department
{
    private String someInfo1;

    private String someInfo2;

    public InsuranceDepartment(String name, String someInfo1, String someInfo2)
    {
        super(name);
    }

    public String getSomeInfo1()
    {
        return someInfo1;
    }

    public void setSomeInfo1(String someInfo1)
    {
        this.someInfo1 = someInfo1;
    }

    public String getSomeInfo2()
    {
        return someInfo2;
    }

    public void setSomeInfo2(String someInfo2)
    {
        this.someInfo2 = someInfo2;
    }
}