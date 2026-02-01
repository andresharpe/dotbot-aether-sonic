package com.spotify.protocol.types;

import java.util.Locale;

/* loaded from: classes2.dex */
public interface b {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f48925b = new a(-1);

        /* renamed from: a, reason: collision with root package name */
        private final int f48926a;

        private a(int value) {
            this.f48926a = value;
        }

        public static a a(int value) {
            return new a(value);
        }

        public int b() {
            return this.f48926a;
        }

        public boolean equals(Object o4) {
            if (this == o4) {
                return true;
            }
            if ((o4 instanceof a) && this.f48926a == ((a) o4).f48926a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f48926a;
        }

        public String toString() {
            return String.format(Locale.US, "RequestId{%d}", Integer.valueOf(this.f48926a));
        }
    }

    /* renamed from: com.spotify.protocol.types.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0436b {

        /* renamed from: b, reason: collision with root package name */
        public static final C0436b f48927b = new C0436b(-1);

        /* renamed from: a, reason: collision with root package name */
        private final int f48928a;

        private C0436b(int value) {
            this.f48928a = value;
        }

        public static C0436b a(int value) {
            return new C0436b(value);
        }

        public int b() {
            return this.f48928a;
        }

        public boolean equals(Object o4) {
            if (this == o4) {
                return true;
            }
            if ((o4 instanceof C0436b) && this.f48928a == ((C0436b) o4).f48928a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f48928a;
        }

        public String toString() {
            return String.format(Locale.US, "SubscriptionId{%d}", Integer.valueOf(this.f48928a));
        }
    }
}
