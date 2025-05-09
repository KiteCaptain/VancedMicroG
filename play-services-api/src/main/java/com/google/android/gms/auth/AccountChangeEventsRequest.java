/*
 * Copyright (C) 2013-2017 microG Project Team
 *
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
 */

package com.google.android.gms.auth;

import static org.microg.gms.auth.AuthConstants.DEFAULT_ACCOUNT_TYPE;

import android.accounts.Account;

import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParceled;

public class AccountChangeEventsRequest extends AutoSafeParcelable {
    @Field(1)
    private final int versionCode = 1;
    @Field(2)
    private int since;
    @Field(3)
    @Deprecated
    private String accountName;
    @Field(4)
    private Account account;

    public Account getAccount() {
        if (account != null) return account;
        if (accountName != null) return new Account(accountName, DEFAULT_ACCOUNT_TYPE);
        return null;
    }

    public static Creator<AccountChangeEventsRequest> CREATOR = new AutoCreator<AccountChangeEventsRequest>(AccountChangeEventsRequest.class);

}
