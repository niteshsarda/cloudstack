// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package org.apache.cloudstack.api.command.test;

import com.cloud.storage.VolumeApiService;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.apache.cloudstack.api.ResponseGenerator;

import org.apache.cloudstack.api.command.user.volume.AddVolumeDetailCmd;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class AddVolumeDetailCmdTest extends TestCase{

    private AddVolumeDetailCmd addVolumeDetailCmd;
    private ResponseGenerator responseGenerator;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {

        addVolumeDetailCmd = new AddVolumeDetailCmd();

    }


    @Test
    public void testCreateSuccess() {

        VolumeApiService volumeService = Mockito.mock(VolumeApiService.class);
        doNothing().when(volumeService).addVolumeDetail(addVolumeDetailCmd);

    }

}
