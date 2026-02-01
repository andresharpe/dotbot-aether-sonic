package org.junit.experimental.theories;

/* loaded from: classes2.dex */
public abstract class PotentialAssignment {

    /* loaded from: classes2.dex */
    public static class CouldNotGenerateValueException extends Exception {

        /* renamed from: E, reason: collision with root package name */
        private static final long f55520E = 1;

        public CouldNotGenerateValueException() {
        }

        public CouldNotGenerateValueException(Throwable th) {
            super(th);
        }
    }

    /* loaded from: classes2.dex */
    static class a extends PotentialAssignment {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f55521a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f55522b;

        a(Object obj, String str) {
            this.f55521a = obj;
            this.f55522b = str;
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public String b() {
            String format;
            Object obj = this.f55521a;
            if (obj == null) {
                format = "null";
            } else {
                try {
                    format = String.format("\"%s\"", obj);
                } catch (Throwable th) {
                    format = String.format("[toString() threw %s: %s]", th.getClass().getSimpleName(), th.getMessage());
                }
            }
            return String.format("%s <from %s>", format, this.f55522b);
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public Object c() {
            return this.f55521a;
        }

        public String toString() {
            return String.format("[%s]", this.f55521a);
        }
    }

    public static PotentialAssignment a(String str, Object obj) {
        return new a(obj, str);
    }

    public abstract String b() throws CouldNotGenerateValueException;

    public abstract Object c() throws CouldNotGenerateValueException;
}
