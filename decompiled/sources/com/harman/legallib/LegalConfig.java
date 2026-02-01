package com.harman.legallib;

import kotlin.E;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class LegalConfig {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final String f47539b = "https://appstorage-dev.onecloud.harman.com/general/legal/android/";

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    public static final String f47542e = "4.0.1";

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    public static final String f47543f = "global";

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    public static final String f47544g = "accepted_version";

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    public static final String f47545h = "accepted_content_from_local_file";

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    public static final String f47546i = "new_downloaded_version";

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final LegalConfig f47538a = new LegalConfig();

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final String f47540c = "https://appstorage.onecloud.harman.com/general/legal/android/";

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    private static String f47547j = f47540c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final String f47541d = "legal_global.json";

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    private static String f47548k = f47540c + f47541d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/harman/legallib/LegalConfig$Language;", "", "", "value", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "EN", "CN", "DE", "FR", "legalLib_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class Language {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Language[] $VALUES;

        @l3.d
        private String value;
        public static final Language EN = new Language("EN", 0, "en");
        public static final Language CN = new Language("CN", 1, "cn");
        public static final Language DE = new Language("DE", 2, "de");
        public static final Language FR = new Language("FR", 3, "fr");

        static {
            Language[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private Language(String str, int i4, String str2) {
            this.value = str2;
        }

        private static final /* synthetic */ Language[] b() {
            return new Language[]{EN, CN, DE, FR};
        }

        @l3.d
        public static kotlin.enums.a<Language> e() {
            return $ENTRIES;
        }

        public static Language valueOf(String str) {
            return (Language) Enum.valueOf(Language.class, str);
        }

        public static Language[] values() {
            return (Language[]) $VALUES.clone();
        }

        @l3.d
        public final String f() {
            return this.value;
        }

        public final void g(@l3.d String str) {
            F.p(str, "<set-?>");
            this.value = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/harman/legallib/LegalConfig$Type;", "", "", "value", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "EULA", "PRIVACY", "legalLib_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class Type {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type EULA = new Type("EULA", 0, "eula");
        public static final Type PRIVACY = new Type("PRIVACY", 1, "privacy");

        @l3.d
        private String value;

        static {
            Type[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private Type(String str, int i4, String str2) {
            this.value = str2;
        }

        private static final /* synthetic */ Type[] b() {
            return new Type[]{EULA, PRIVACY};
        }

        @l3.d
        public static kotlin.enums.a<Type> e() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @l3.d
        public final String f() {
            return this.value;
        }

        public final void g(@l3.d String str) {
            F.p(str, "<set-?>");
            this.value = str;
        }
    }

    private LegalConfig() {
    }

    @l3.d
    public final String a() {
        return f47547j;
    }

    @l3.d
    public final String b() {
        return f47548k;
    }

    public final void c(@l3.d String str) {
        F.p(str, "<set-?>");
        f47547j = str;
    }

    public final void d(@l3.d String str) {
        F.p(str, "<set-?>");
        f47548k = str;
    }
}
