package com.blankj.utilcode.util;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private static int f24752a = 524288;

    /* loaded from: classes.dex */
    public interface a {
        void a(double d4);
    }

    private F() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean A(File file, byte[] bArr, boolean z3, boolean z4) {
        if (bArr != null && H0.t(file)) {
            AbstractInterruptibleChannel abstractInterruptibleChannel = null;
            try {
                try {
                    FileChannel channel = new FileOutputStream(file, z3).getChannel();
                    if (channel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        return false;
                    }
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, channel.size(), bArr.length);
                    map.put(bArr);
                    if (z4) {
                        map.force();
                    }
                    try {
                        channel.close();
                        return true;
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        return true;
                    }
                } catch (IOException e6) {
                    e6.printStackTrace();
                    if (0 != 0) {
                        try {
                            abstractInterruptibleChannel.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        abstractInterruptibleChannel.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                throw th;
            }
        }
        Log.e("FileIOUtils", "create file <" + file + "> failed.");
        return false;
    }

    public static boolean B(String str, byte[] bArr, boolean z3) {
        return C(str, bArr, false, z3);
    }

    public static boolean C(String str, byte[] bArr, boolean z3, boolean z4) {
        return A(H0.P(str), bArr, z3, z4);
    }

    public static boolean D(File file, byte[] bArr) {
        return G(file, bArr, false, null);
    }

    public static boolean E(File file, byte[] bArr, a aVar) {
        return G(file, bArr, false, aVar);
    }

    public static boolean F(File file, byte[] bArr, boolean z3) {
        return G(file, bArr, z3, null);
    }

    public static boolean G(File file, byte[] bArr, boolean z3, a aVar) {
        if (bArr == null) {
            return false;
        }
        return O(file, new ByteArrayInputStream(bArr), z3, aVar);
    }

    public static boolean H(String str, byte[] bArr) {
        return G(H0.P(str), bArr, false, null);
    }

    public static boolean I(String str, byte[] bArr, a aVar) {
        return G(H0.P(str), bArr, false, aVar);
    }

    public static boolean J(String str, byte[] bArr, boolean z3) {
        return G(H0.P(str), bArr, z3, null);
    }

    public static boolean K(String str, byte[] bArr, boolean z3, a aVar) {
        return G(H0.P(str), bArr, z3, aVar);
    }

    public static boolean L(File file, InputStream inputStream) {
        return O(file, inputStream, false, null);
    }

    public static boolean M(File file, InputStream inputStream, a aVar) {
        return O(file, inputStream, false, aVar);
    }

    public static boolean N(File file, InputStream inputStream, boolean z3) {
        return O(file, inputStream, z3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:9|(6:11|(2:12|(1:14)(0))|16|17|18|20)(6:28|(2:29|(1:31)(0))|16|17|18|20)|15|16|17|18|20) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r7.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean O(java.io.File r7, java.io.InputStream r8, boolean r9, com.blankj.utilcode.util.F.a r10) {
        /*
            r0 = 0
            if (r8 == 0) goto L8c
            boolean r1 = com.blankj.utilcode.util.H0.t(r7)
            if (r1 != 0) goto Lb
            goto L8c
        Lb:
            r1 = 0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r3.<init>(r7, r9)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            int r7 = com.blankj.utilcode.util.F.f24752a     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r2.<init>(r3, r7)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r7 = -1
            if (r10 != 0) goto L2f
            int r9 = com.blankj.utilcode.util.F.f24752a     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
        L1f:
            int r10 = r8.read(r9)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            if (r10 == r7) goto L4e
            r2.write(r9, r0, r10)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            goto L1f
        L29:
            r7 = move-exception
            r1 = r2
            goto L79
        L2c:
            r7 = move-exception
            r1 = r2
            goto L63
        L2f:
            int r9 = r8.available()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            double r3 = (double) r9     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r5 = 0
            r10.a(r5)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            int r9 = com.blankj.utilcode.util.F.f24752a     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r1 = r0
        L3e:
            int r5 = r8.read(r9)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            if (r5 == r7) goto L4e
            r2.write(r9, r0, r5)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            int r1 = r1 + r5
            double r5 = (double) r1     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            double r5 = r5 / r3
            r10.a(r5)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            goto L3e
        L4e:
            r8.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r7 = move-exception
            r7.printStackTrace()
        L56:
            r2.close()     // Catch: java.io.IOException -> L5a
            goto L5e
        L5a:
            r7 = move-exception
            r7.printStackTrace()
        L5e:
            r7 = 1
            return r7
        L60:
            r7 = move-exception
            goto L79
        L62:
            r7 = move-exception
        L63:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L60
            r8.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L6a:
            r7 = move-exception
            r7.printStackTrace()
        L6e:
            if (r1 == 0) goto L78
            r1.close()     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r7 = move-exception
            r7.printStackTrace()
        L78:
            return r0
        L79:
            r8.close()     // Catch: java.io.IOException -> L7d
            goto L81
        L7d:
            r8 = move-exception
            r8.printStackTrace()
        L81:
            if (r1 == 0) goto L8b
            r1.close()     // Catch: java.io.IOException -> L87
            goto L8b
        L87:
            r8 = move-exception
            r8.printStackTrace()
        L8b:
            throw r7
        L8c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "create file <"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = "> failed."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "FileIOUtils"
            android.util.Log.e(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.F.O(java.io.File, java.io.InputStream, boolean, com.blankj.utilcode.util.F$a):boolean");
    }

    public static boolean P(String str, InputStream inputStream) {
        return O(H0.P(str), inputStream, false, null);
    }

    public static boolean Q(String str, InputStream inputStream, a aVar) {
        return O(H0.P(str), inputStream, false, aVar);
    }

    public static boolean R(String str, InputStream inputStream, boolean z3) {
        return O(H0.P(str), inputStream, z3, null);
    }

    public static boolean S(String str, InputStream inputStream, boolean z3, a aVar) {
        return O(H0.P(str), inputStream, z3, aVar);
    }

    public static boolean T(File file, String str) {
        return U(file, str, false);
    }

    public static boolean U(File file, String str, boolean z3) {
        BufferedWriter bufferedWriter;
        if (file == null || str == null) {
            return false;
        }
        if (!H0.t(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file, z3));
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            try {
                bufferedWriter.close();
                return true;
            } catch (IOException e5) {
                e5.printStackTrace();
                return true;
            }
        } catch (IOException e6) {
            e = e6;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean V(String str, String str2) {
        return U(H0.P(str), str2, false);
    }

    public static boolean W(String str, String str2, boolean z3) {
        return U(H0.P(str), str2, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    public static byte[] a(File file) {
        FileChannel fileChannel;
        ?? r12 = 0;
        try {
            if (!H0.u0(file)) {
                return null;
            }
            try {
                fileChannel = new RandomAccessFile(file, "r").getChannel();
                try {
                    if (fileChannel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        byte[] bArr = new byte[0];
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        return bArr;
                    }
                    ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel.size());
                    do {
                    } while (fileChannel.read(allocate) > 0);
                    byte[] array = allocate.array();
                    try {
                        fileChannel.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    return array;
                } catch (IOException e6) {
                    e = e6;
                    e.printStackTrace();
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException e8) {
                e = e8;
                fileChannel = null;
            } catch (Throwable th) {
                th = th;
                if (r12 != 0) {
                    try {
                        r12.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r12 = file;
        }
    }

    public static byte[] b(String str) {
        return a(H0.P(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    public static byte[] c(File file) {
        FileChannel fileChannel;
        ?? r12 = 0;
        try {
            if (!H0.u0(file)) {
                return null;
            }
            try {
                fileChannel = new RandomAccessFile(file, "r").getChannel();
                try {
                    if (fileChannel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        byte[] bArr = new byte[0];
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        return bArr;
                    }
                    int size = (int) fileChannel.size();
                    byte[] bArr2 = new byte[size];
                    fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, size).load().get(bArr2, 0, size);
                    try {
                        fileChannel.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    return bArr2;
                } catch (IOException e6) {
                    e = e6;
                    e.printStackTrace();
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException e8) {
                e = e8;
                fileChannel = null;
            } catch (Throwable th) {
                th = th;
                if (r12 != 0) {
                    try {
                        r12.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r12 = file;
        }
    }

    public static byte[] d(String str) {
        return c(H0.P(str));
    }

    public static byte[] e(File file) {
        return f(file, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[Catch: FileNotFoundException -> 0x0063, SYNTHETIC, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0063, blocks: (B:6:0x0008, B:25:0x005f, B:27:0x0057, B:65:0x0085, B:61:0x0092, B:60:0x008f, B:45:0x007c, B:48:0x0072, B:18:0x0052, B:53:0x0080, B:38:0x006d, B:56:0x008a, B:21:0x005a, B:42:0x0077), top: B:5:0x0008, inners: #1, #3, #5, #7, #8, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] f(java.io.File r10, com.blankj.utilcode.util.F.a r11) {
        /*
            boolean r0 = com.blankj.utilcode.util.H0.u0(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L63
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L63
            r2.<init>(r10)     // Catch: java.io.FileNotFoundException -> L63
            int r10 = com.blankj.utilcode.util.F.f24752a     // Catch: java.io.FileNotFoundException -> L63
            r0.<init>(r2, r10)     // Catch: java.io.FileNotFoundException -> L63
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
            r10.<init>()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
            int r2 = com.blankj.utilcode.util.F.f24752a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r3 = -1
            r4 = 0
            if (r11 != 0) goto L31
        L21:
            int r11 = com.blankj.utilcode.util.F.f24752a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r11 = r0.read(r2, r4, r11)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            if (r11 == r3) goto L4e
            r10.write(r2, r4, r11)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            goto L21
        L2d:
            r11 = move-exception
            goto L80
        L2f:
            r11 = move-exception
            goto L6a
        L31:
            int r5 = r0.available()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            double r5 = (double) r5     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r7 = 0
            r11.a(r7)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r7 = r4
        L3c:
            int r8 = com.blankj.utilcode.util.F.f24752a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r8 = r0.read(r2, r4, r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            if (r8 == r3) goto L4e
            r10.write(r2, r4, r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r7 = r7 + r8
            double r8 = (double) r7     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            double r8 = r8 / r5
            r11.a(r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            goto L3c
        L4e:
            byte[] r11 = r10.toByteArray()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r0.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L5a:
            r10.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L62:
            return r11
        L63:
            r10 = move-exception
            goto L93
        L65:
            r11 = move-exception
            r10 = r1
            goto L80
        L68:
            r11 = move-exception
            r10 = r1
        L6a:
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L2d
            r0.close()     // Catch: java.io.IOException -> L71
            goto L75
        L71:
            r11 = move-exception
            r11.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L75:
            if (r10 == 0) goto L7f
            r10.close()     // Catch: java.io.IOException -> L7b
            goto L7f
        L7b:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L7f:
            return r1
        L80:
            r0.close()     // Catch: java.io.IOException -> L84
            goto L88
        L84:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L88:
            if (r10 == 0) goto L92
            r10.close()     // Catch: java.io.IOException -> L8e
            goto L92
        L8e:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L92:
            throw r11     // Catch: java.io.FileNotFoundException -> L63
        L93:
            r10.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.F.f(java.io.File, com.blankj.utilcode.util.F$a):byte[]");
    }

    public static byte[] g(String str) {
        return f(H0.P(str), null);
    }

    public static byte[] h(String str, a aVar) {
        return f(H0.P(str), aVar);
    }

    public static List<String> i(File file) {
        return k(file, 0, Integer.MAX_VALUE, null);
    }

    public static List<String> j(File file, int i4, int i5) {
        return k(file, i4, i5, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> k(java.io.File r6, int r7, int r8, java.lang.String r9) {
        /*
            boolean r0 = com.blankj.utilcode.util.H0.u0(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r7 <= r8) goto Lb
            return r1
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            boolean r2 = com.blankj.utilcode.util.H0.D0(r9)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r3 = 1
            if (r2 == 0) goto L2c
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            goto L3c
        L27:
            r6 = move-exception
            goto L6c
        L29:
            r6 = move-exception
            r9 = r1
            goto L5e
        L2c:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r4.<init>(r5, r9)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r9 = r2
        L3c:
            java.lang.String r6 = r9.readLine()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            if (r6 == 0) goto L55
            if (r3 <= r8) goto L45
            goto L55
        L45:
            if (r7 > r3) goto L52
            if (r3 > r8) goto L52
            r0.add(r6)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            goto L52
        L4d:
            r6 = move-exception
            r1 = r9
            goto L6c
        L50:
            r6 = move-exception
            goto L5e
        L52:
            int r3 = r3 + 1
            goto L3c
        L55:
            r9.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L59:
            r6 = move-exception
            r6.printStackTrace()
        L5d:
            return r0
        L5e:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L4d
            if (r9 == 0) goto L6b
            r9.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r6 = move-exception
            r6.printStackTrace()
        L6b:
            return r1
        L6c:
            if (r1 == 0) goto L76
            r1.close()     // Catch: java.io.IOException -> L72
            goto L76
        L72:
            r7 = move-exception
            r7.printStackTrace()
        L76:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.F.k(java.io.File, int, int, java.lang.String):java.util.List");
    }

    public static List<String> l(File file, String str) {
        return k(file, 0, Integer.MAX_VALUE, str);
    }

    public static List<String> m(String str) {
        return l(H0.P(str), null);
    }

    public static List<String> n(String str, int i4, int i5) {
        return k(H0.P(str), i4, i5, null);
    }

    public static List<String> o(String str, int i4, int i5, String str2) {
        return k(H0.P(str), i4, i5, str2);
    }

    public static List<String> p(String str, String str2) {
        return l(H0.P(str), str2);
    }

    public static String q(File file) {
        return r(file, null);
    }

    public static String r(File file, String str) {
        byte[] e4 = e(file);
        if (e4 == null) {
            return null;
        }
        if (H0.D0(str)) {
            return new String(e4);
        }
        try {
            return new String(e4, str);
        } catch (UnsupportedEncodingException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static String s(String str) {
        return r(H0.P(str), null);
    }

    public static String t(String str, String str2) {
        return r(H0.P(str), str2);
    }

    public static void u(int i4) {
        f24752a = i4;
    }

    public static boolean v(File file, byte[] bArr, boolean z3) {
        return w(file, bArr, false, z3);
    }

    public static boolean w(File file, byte[] bArr, boolean z3, boolean z4) {
        if (bArr == null) {
            Log.e("FileIOUtils", "bytes is null.");
            return false;
        }
        if (!H0.t(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            try {
                FileChannel channel = new FileOutputStream(file, z3).getChannel();
                if (channel == null) {
                    Log.e("FileIOUtils", "fc is null.");
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return false;
                }
                channel.position(channel.size());
                channel.write(ByteBuffer.wrap(bArr));
                if (z4) {
                    channel.force(true);
                }
                try {
                    channel.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                return true;
            } catch (IOException e6) {
                e6.printStackTrace();
                if (0 != 0) {
                    try {
                        abstractInterruptibleChannel.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    abstractInterruptibleChannel.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean x(String str, byte[] bArr, boolean z3) {
        return w(H0.P(str), bArr, false, z3);
    }

    public static boolean y(String str, byte[] bArr, boolean z3, boolean z4) {
        return w(H0.P(str), bArr, z3, z4);
    }

    public static boolean z(File file, byte[] bArr, boolean z3) {
        return A(file, bArr, false, z3);
    }
}
