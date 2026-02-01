package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.C0669d;
import com.google.android.gms.common.internal.C1240b;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1701q extends A2 {

    /* renamed from: c, reason: collision with root package name */
    private long f30914c;

    /* renamed from: d, reason: collision with root package name */
    private String f30915d;

    /* renamed from: e, reason: collision with root package name */
    private AccountManager f30916e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f30917f;

    /* renamed from: g, reason: collision with root package name */
    private long f30918g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1701q(C1638f2 c1638f2) {
        super(c1638f2);
    }

    @Override // com.google.android.gms.measurement.internal.A2
    protected final boolean h() {
        Calendar calendar = Calendar.getInstance();
        this.f30914c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f30915d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final long m() {
        f();
        return this.f30918g;
    }

    public final long n() {
        i();
        return this.f30914c;
    }

    public final String o() {
        i();
        return this.f30915d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void p() {
        f();
        this.f30917f = null;
        this.f30918g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean q() {
        Account[] result;
        f();
        long a4 = this.f31060a.zzav().a();
        if (a4 - this.f30918g > 86400000) {
            this.f30917f = null;
        }
        Boolean bool = this.f30917f;
        if (bool == null) {
            if (C0669d.a(this.f31060a.d(), "android.permission.GET_ACCOUNTS") != 0) {
                this.f31060a.b().w().a("Permission error checking for dasher/unicorn accounts");
                this.f30918g = a4;
                this.f30917f = Boolean.FALSE;
                return false;
            }
            if (this.f30916e == null) {
                this.f30916e = AccountManager.get(this.f31060a.d());
            }
            try {
                result = this.f30916e.getAccountsByTypeAndFeatures(C1240b.f28682a, new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException e4) {
                e = e4;
                this.f31060a.b().r().b("Exception checking account types", e);
                this.f30918g = a4;
                this.f30917f = Boolean.FALSE;
                return false;
            } catch (OperationCanceledException e5) {
                e = e5;
                this.f31060a.b().r().b("Exception checking account types", e);
                this.f30918g = a4;
                this.f30917f = Boolean.FALSE;
                return false;
            } catch (IOException e6) {
                e = e6;
                this.f31060a.b().r().b("Exception checking account types", e);
                this.f30918g = a4;
                this.f30917f = Boolean.FALSE;
                return false;
            }
            if (result != null && result.length > 0) {
                this.f30917f = Boolean.TRUE;
                this.f30918g = a4;
                return true;
            }
            Account[] result2 = this.f30916e.getAccountsByTypeAndFeatures(C1240b.f28682a, new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f30917f = Boolean.TRUE;
                this.f30918g = a4;
                return true;
            }
            this.f30918g = a4;
            this.f30917f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
