/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.teiid.spring.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "teiid")
public class TeiidProperties {

    private String vdbFile;
    private int metadataLoadWaitTimeInMillis = 30000;
    private boolean jdbcEnable = false;
    private int jdbcPort = 31000;
    private boolean pgEnable = false;
    private int pgPort = 35432;
    private boolean allowAlter = false;

    public boolean isAllowAlter() {
        return allowAlter;
    }

    public void setAllowAlter(boolean allowAlter) {
        this.allowAlter = allowAlter;
    }

    public String getVdbFile() {
        return vdbFile;
    }

    public void setVdbFile(String vdb) {
        this.vdbFile = vdb;
    }

    public int getMetadataLoadWaitTimeInMillis() {
        return metadataLoadWaitTimeInMillis;
    }

    public void setMetadataLoadWaitTimeInMillis(int metadataLoadWaitTimeInMillis) {
        this.metadataLoadWaitTimeInMillis = metadataLoadWaitTimeInMillis;
    }

    public boolean isJdbcEnable() {
        return jdbcEnable;
    }

    public void setJdbcEnable(boolean jdbcEnable) {
        this.jdbcEnable = jdbcEnable;
    }

    public int getJdbcPort() {
        return jdbcPort;
    }

    public void setJdbcPort(int jdbcPort) {
        this.jdbcPort = jdbcPort;
    }

    public boolean isPgEnable() {
        return pgEnable;
    }

    public void setPgEnable(boolean pgEnable) {
        this.pgEnable = pgEnable;
    }

    public int getPgPort() {
        return pgPort;
    }

    public void setPgPort(int pgPort) {
        this.pgPort = pgPort;
    }
}
