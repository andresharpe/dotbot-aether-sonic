package com.google.firebase.installations.local;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.a;

@AutoValue
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    @N
    public static c f36068a = a().a();

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        @N
        public abstract c a();

        @N
        public abstract a b(@P String str);

        @N
        public abstract a c(long j4);

        @N
        public abstract a d(@N String str);

        @N
        public abstract a e(@P String str);

        @N
        public abstract a f(@P String str);

        @N
        public abstract a g(@N PersistedInstallation.RegistrationStatus registrationStatus);

        @N
        public abstract a h(long j4);
    }

    @N
    public static a a() {
        return new a.b().h(0L).g(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).c(0L);
    }

    @P
    public abstract String b();

    public abstract long c();

    @P
    public abstract String d();

    @P
    public abstract String e();

    @P
    public abstract String f();

    @N
    public abstract PersistedInstallation.RegistrationStatus g();

    public abstract long h();

    public boolean i() {
        if (g() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (g() != PersistedInstallation.RegistrationStatus.NOT_GENERATED && g() != PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    public boolean k() {
        if (g() == PersistedInstallation.RegistrationStatus.REGISTERED) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (g() == PersistedInstallation.RegistrationStatus.UNREGISTERED) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    @N
    public abstract a n();

    @N
    public c o(@N String str, long j4, long j5) {
        return n().b(str).c(j4).h(j5).a();
    }

    @N
    public c p() {
        return n().b(null).a();
    }

    @N
    public c q(@N String str) {
        return n().e(str).g(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).a();
    }

    @N
    public c r() {
        return n().g(PersistedInstallation.RegistrationStatus.NOT_GENERATED).a();
    }

    @N
    public c s(@N String str, @N String str2, long j4, @P String str3, long j5) {
        return n().d(str).g(PersistedInstallation.RegistrationStatus.REGISTERED).b(str3).f(str2).c(j5).h(j4).a();
    }

    @N
    public c t(@N String str) {
        return n().d(str).g(PersistedInstallation.RegistrationStatus.UNREGISTERED).a();
    }
}
