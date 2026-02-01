package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1481q5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(zzjd zzjdVar) {
        StringBuilder sb = new StringBuilder(zzjdVar.d());
        for (int i4 = 0; i4 < zzjdVar.d(); i4++) {
            byte b4 = zzjdVar.b(i4);
            if (b4 != 34) {
                if (b4 != 39) {
                    if (b4 != 92) {
                        switch (b4) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (b4 >= 32 && b4 <= 126) {
                                    sb.append((char) b4);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b4 >>> 6) & 3) + 48));
                                    sb.append((char) (((b4 >>> 3) & 7) + 48));
                                    sb.append((char) ((b4 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
