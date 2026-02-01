package com.android.volley.toolbox;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.i0;
import com.android.volley.AuthFailureError;

@SuppressLint({"MissingPermission"})
/* renamed from: com.android.volley.toolbox.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1074b implements InterfaceC1076d {

    /* renamed from: a, reason: collision with root package name */
    private final AccountManager f24549a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f24550b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24551c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f24552d;

    public C1074b(Context context, Account account, String str) {
        this(context, account, str, false);
    }

    @Override // com.android.volley.toolbox.InterfaceC1076d
    public String a() throws AuthFailureError {
        String str;
        AccountManagerFuture<Bundle> authToken = this.f24549a.getAuthToken(this.f24550b, this.f24551c, this.f24552d, null, null);
        try {
            Bundle result = authToken.getResult();
            if (authToken.isDone() && !authToken.isCancelled()) {
                if (!result.containsKey("intent")) {
                    str = result.getString("authtoken");
                } else {
                    throw new AuthFailureError((Intent) result.getParcelable("intent"));
                }
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
            throw new AuthFailureError("Got null auth token for type: " + this.f24551c);
        } catch (Exception e4) {
            throw new AuthFailureError("Error while retrieving auth token", e4);
        }
    }

    @Override // com.android.volley.toolbox.InterfaceC1076d
    public void b(String str) {
        this.f24549a.invalidateAuthToken(this.f24550b.type, str);
    }

    public Account c() {
        return this.f24550b;
    }

    public String d() {
        return this.f24551c;
    }

    public C1074b(Context context, Account account, String str, boolean z3) {
        this(AccountManager.get(context), account, str, z3);
    }

    @i0
    C1074b(AccountManager accountManager, Account account, String str, boolean z3) {
        this.f24549a = accountManager;
        this.f24550b = account;
        this.f24551c = str;
        this.f24552d = z3;
    }
}
