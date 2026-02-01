package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    private final int id;

    DeliveryMechanism(int i4) {
        this.id = i4;
    }

    public static DeliveryMechanism b(String str) {
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    public int e() {
        return this.id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.id);
    }
}
