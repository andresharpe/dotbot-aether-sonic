package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class SendException extends Exception {

    /* renamed from: F, reason: collision with root package name */
    public static final int f36501F = 0;

    /* renamed from: G, reason: collision with root package name */
    public static final int f36502G = 1;

    /* renamed from: H, reason: collision with root package name */
    public static final int f36503H = 2;

    /* renamed from: I, reason: collision with root package name */
    public static final int f36504I = 3;

    /* renamed from: J, reason: collision with root package name */
    public static final int f36505J = 4;

    /* renamed from: E, reason: collision with root package name */
    private final int f36506E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SendException(String str) {
        super(str);
        this.f36506E = b(str);
    }

    private int b(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        char c4 = 65535;
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    c4 = 1;
                    break;
                }
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    c4 = 2;
                    break;
                }
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    c4 = 3;
                    break;
                }
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    c4 = 4;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
            case 4:
                return 1;
            case 3:
                return 2;
            default:
                return 0;
        }
    }

    public int a() {
        return this.f36506E;
    }
}
