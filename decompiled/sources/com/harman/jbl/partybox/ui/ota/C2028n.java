package com.harman.jbl.partybox.ui.ota;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: com.harman.jbl.partybox.ui.ota.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2028n {

    /* renamed from: i, reason: collision with root package name */
    public static final int f44657i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f44658j = 3;

    /* renamed from: k, reason: collision with root package name */
    private static final String f44659k = "HmPbSPPSecure";

    /* renamed from: l, reason: collision with root package name */
    private static final String f44660l = "HmPbSPPInsecure";

    /* renamed from: m, reason: collision with root package name */
    private static final int f44661m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f44662n = 2;

    /* renamed from: o, reason: collision with root package name */
    private static final String f44663o = "OTA_LOG";

    /* renamed from: p, reason: collision with root package name */
    private static final String f44664p = "00001101-0000-1000-8000-00805F9B34FB";

    /* renamed from: q, reason: collision with root package name */
    private static final UUID f44665q = UUID.fromString(f44664p);

    /* renamed from: r, reason: collision with root package name */
    private static final UUID f44666r = UUID.fromString(f44664p);

    /* renamed from: b, reason: collision with root package name */
    private final Handler f44668b;

    /* renamed from: c, reason: collision with root package name */
    private a f44669c;

    /* renamed from: d, reason: collision with root package name */
    private a f44670d;

    /* renamed from: e, reason: collision with root package name */
    private b f44671e;

    /* renamed from: f, reason: collision with root package name */
    private c f44672f;

    /* renamed from: a, reason: collision with root package name */
    private final BluetoothAdapter f44667a = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: g, reason: collision with root package name */
    private int f44673g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f44674h = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.harman.jbl.partybox.ui.ota.n$a */
    /* loaded from: classes2.dex */
    public class a extends Thread {

        /* renamed from: E, reason: collision with root package name */
        private final BluetoothServerSocket f44675E;

        /* renamed from: F, reason: collision with root package name */
        private final String f44676F;

        a(boolean z3) {
            String str;
            BluetoothServerSocket bluetoothServerSocket;
            if (z3) {
                str = "Secure";
            } else {
                str = "Insecure";
            }
            this.f44676F = str;
            try {
                if (z3) {
                    bluetoothServerSocket = C2028n.this.f44667a.listenUsingRfcommWithServiceRecord(C2028n.f44659k, C2028n.f44665q);
                } else {
                    bluetoothServerSocket = C2028n.this.f44667a.listenUsingInsecureRfcommWithServiceRecord(C2028n.f44660l, C2028n.f44666r);
                }
            } catch (IOException e4) {
                Log.e(C2028n.f44663o, "Socket Type: " + this.f44676F + "listen() failed", e4);
                bluetoothServerSocket = null;
            }
            this.f44675E = bluetoothServerSocket;
            C2028n.this.f44673g = 1;
        }

        void a() {
            com.harman.log.f.a(C2028n.f44663o, "Socket Type" + this.f44676F + "cancel " + this);
            try {
                BluetoothServerSocket bluetoothServerSocket = this.f44675E;
                if (bluetoothServerSocket != null) {
                    bluetoothServerSocket.close();
                }
            } catch (IOException e4) {
                com.harman.log.f.b(C2028n.f44663o, "Socket Type" + this.f44676F + "close() of server failed" + e4.getMessage());
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:10|11|(3:13|(1:23)(1:(1:18))|19)|24|25|19) */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
        
            android.util.Log.e(com.harman.jbl.partybox.ui.ota.C2028n.f44663o, "Could not close unwanted socket", r0);
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                java.lang.String r0 = "OTA_LOG"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Socket Type: "
                r1.append(r2)
                java.lang.String r2 = r5.f44676F
                r1.append(r2)
                java.lang.String r2 = "BEGIN mAcceptThread"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                com.harman.log.f.a(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AcceptThread"
                r0.append(r1)
                java.lang.String r1 = r5.f44676F
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r5.setName(r0)
            L36:
                com.harman.jbl.partybox.ui.ota.n r0 = com.harman.jbl.partybox.ui.ota.C2028n.this
                int r0 = com.harman.jbl.partybox.ui.ota.C2028n.c(r0)
                r1 = 3
                if (r0 == r1) goto L79
                android.bluetooth.BluetoothServerSocket r0 = r5.f44675E     // Catch: java.lang.Exception -> L79
                android.bluetooth.BluetoothSocket r0 = r0.accept()     // Catch: java.lang.Exception -> L79
                if (r0 == 0) goto L36
                com.harman.jbl.partybox.ui.ota.n r2 = com.harman.jbl.partybox.ui.ota.C2028n.this
                monitor-enter(r2)
                com.harman.jbl.partybox.ui.ota.n r3 = com.harman.jbl.partybox.ui.ota.C2028n.this     // Catch: java.lang.Throwable -> L67
                int r3 = com.harman.jbl.partybox.ui.ota.C2028n.c(r3)     // Catch: java.lang.Throwable -> L67
                if (r3 == 0) goto L69
                r4 = 1
                if (r3 == r4) goto L5b
                r4 = 2
                if (r3 == r4) goto L5b
                if (r3 == r1) goto L69
                goto L75
            L5b:
                com.harman.jbl.partybox.ui.ota.n r1 = com.harman.jbl.partybox.ui.ota.C2028n.this     // Catch: java.lang.Throwable -> L67
                android.bluetooth.BluetoothDevice r3 = r0.getRemoteDevice()     // Catch: java.lang.Throwable -> L67
                java.lang.String r4 = r5.f44676F     // Catch: java.lang.Throwable -> L67
                com.harman.jbl.partybox.ui.ota.C2028n.f(r1, r0, r3, r4)     // Catch: java.lang.Throwable -> L67
                goto L75
            L67:
                r0 = move-exception
                goto L77
            L69:
                r0.close()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6d
                goto L75
            L6d:
                r0 = move-exception
                java.lang.String r1 = "OTA_LOG"
                java.lang.String r3 = "Could not close unwanted socket"
                android.util.Log.e(r1, r3, r0)     // Catch: java.lang.Throwable -> L67
            L75:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L67
                goto L36
            L77:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L67
                throw r0
            L79:
                java.lang.String r0 = "OTA_LOG"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "END mAcceptThread, socket Type: "
                r1.append(r2)
                java.lang.String r2 = r5.f44676F
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.harman.log.f.d(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.ota.C2028n.a.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.harman.jbl.partybox.ui.ota.n$b */
    /* loaded from: classes2.dex */
    public class b extends Thread {

        /* renamed from: E, reason: collision with root package name */
        private final BluetoothSocket f44678E;

        /* renamed from: F, reason: collision with root package name */
        private final BluetoothDevice f44679F;

        /* renamed from: G, reason: collision with root package name */
        private final String f44680G;

        b(BluetoothDevice bluetoothDevice, boolean z3) {
            String str;
            BluetoothSocket bluetoothSocket;
            this.f44679F = bluetoothDevice;
            if (z3) {
                str = "Secure";
            } else {
                str = "Insecure";
            }
            this.f44680G = str;
            try {
                if (z3) {
                    bluetoothSocket = bluetoothDevice.createRfcommSocketToServiceRecord(C2028n.f44665q);
                } else {
                    bluetoothSocket = bluetoothDevice.createInsecureRfcommSocketToServiceRecord(C2028n.f44666r);
                }
            } catch (IOException e4) {
                Log.e(C2028n.f44663o, "Socket Type: " + this.f44680G + "create() failed", e4);
                bluetoothSocket = null;
            }
            this.f44678E = bluetoothSocket;
            C2028n.this.f44673g = 2;
        }

        void a() {
            try {
                BluetoothSocket bluetoothSocket = this.f44678E;
                if (bluetoothSocket != null) {
                    bluetoothSocket.close();
                }
            } catch (IOException e4) {
                Log.e(C2028n.f44663o, "close() of " + this.f44680G + " socket failed", e4);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com.harman.log.f.d(C2028n.f44663o, "BEGIN mConnectThread SocketType:" + this.f44680G);
            setName("ConnectThread" + this.f44680G);
            C2028n.this.f44667a.cancelDiscovery();
            if (!O.f44533a.i()) {
                try {
                    this.f44678E.connect();
                } catch (IOException e4) {
                    Log.e(C2028n.f44663o, "Exception during socket connect() Exception =", e4);
                    try {
                        this.f44678E.close();
                    } catch (IOException e5) {
                        Log.e(C2028n.f44663o, "unable to close() " + this.f44680G + " socket during connection failure", e5);
                    }
                    C2028n.this.m();
                    return;
                }
            }
            synchronized (C2028n.this) {
                C2028n.this.f44671e = null;
            }
            C2028n.this.l(this.f44678E, this.f44679F, this.f44680G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.harman.jbl.partybox.ui.ota.n$c */
    /* loaded from: classes2.dex */
    public class c extends Thread {

        /* renamed from: E, reason: collision with root package name */
        private final BluetoothSocket f44682E;

        /* renamed from: F, reason: collision with root package name */
        private final InputStream f44683F;

        /* renamed from: G, reason: collision with root package name */
        private final OutputStream f44684G;

        c(BluetoothSocket bluetoothSocket, String str) {
            InputStream inputStream;
            com.harman.log.f.a(C2028n.f44663o, "create ConnectedThread: " + str);
            this.f44682E = bluetoothSocket;
            OutputStream outputStream = null;
            try {
                inputStream = bluetoothSocket.getInputStream();
            } catch (IOException e4) {
                e = e4;
                inputStream = null;
            }
            try {
                outputStream = bluetoothSocket.getOutputStream();
            } catch (IOException e5) {
                e = e5;
                Log.e(C2028n.f44663o, " Failed to create ConnectedThread() for socketType=" + str + " : exception=" + e);
                this.f44683F = inputStream;
                this.f44684G = outputStream;
                C2028n.this.f44673g = 3;
            }
            this.f44683F = inputStream;
            this.f44684G = outputStream;
            C2028n.this.f44673g = 3;
        }

        void a() {
            try {
                this.f44682E.close();
            } catch (IOException e4) {
                Log.e(C2028n.f44663o, "close() of connect socket failed", e4);
            }
        }

        void b(byte[] bArr) {
            String str;
            String g4 = com.harman.sdk.utils.g.g(bArr);
            O o4 = O.f44533a;
            if (o4.j()) {
                if (g4.substring(0, 4).equalsIgnoreCase("aa23")) {
                    C2028n.this.f44668b.obtainMessage(o4.e(), 0, -1, "").sendToTarget();
                    Message obtainMessage = C2028n.this.f44668b.obtainMessage(o4.e());
                    obtainMessage.arg1 = 0;
                    obtainMessage.arg2 = -1;
                    obtainMessage.obj = "aa24070111010026AC00";
                    C2028n.this.f44668b.sendMessageDelayed(obtainMessage, 1500L);
                    return;
                }
                if (g4.substring(0, 4).equalsIgnoreCase("aa25")) {
                    C2028n.this.f44668b.obtainMessage(o4.e(), 0, -1, "aa00022500").sendToTarget();
                    Message obtainMessage2 = C2028n.this.f44668b.obtainMessage(o4.e());
                    obtainMessage2.obj = "aa2706010000000000";
                    C2028n.this.f44668b.sendMessageDelayed(obtainMessage2, 10L);
                    return;
                }
                if (g4.contains("aa26")) {
                    C2028n.this.f44668b.obtainMessage(o4.e(), 0, -1, "aa0002600").sendToTarget();
                    Message obtainMessage3 = C2028n.this.f44668b.obtainMessage(o4.e());
                    byte[] array = ByteBuffer.allocate(4).putInt(o4.b()).array();
                    if (o4.b() >= o4.h() - 1) {
                        str = "aa270603" + com.harman.sdk.utils.g.g(array) + "00";
                    } else {
                        str = "aa270602" + com.harman.sdk.utils.g.g(array) + "00";
                    }
                    obtainMessage3.obj = str;
                    C2028n.this.f44668b.sendMessageDelayed(obtainMessage3, 10L);
                    return;
                }
                if (g4.contains("aa2a")) {
                    C2028n.this.f44668b.obtainMessage(o4.e(), 0, -1, "aa00022a00").sendToTarget();
                    return;
                } else {
                    if (g4.contains("aa28")) {
                        C2028n.this.f44668b.obtainMessage(o4.e(), 0, -1, "aa00022800").sendToTarget();
                        return;
                    }
                    return;
                }
            }
            try {
                this.f44684G.write(bArr);
                com.harman.log.f.a(C2028n.f44663o, "APP write data= " + g4);
            } catch (IOException e4) {
                Log.e(C2028n.f44663o, "Exception during app sent command= ", e4);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Log.i(C2028n.f44663o, " ConnectedThread Running ");
            if (!O.f44533a.j()) {
                Log.d(C2028n.f44663o, "Connected Thread State " + C2028n.this.f44673g);
                while (C2028n.this.f44673g == 3) {
                    try {
                        byte[] bArr = new byte[1024];
                        int read = this.f44683F.read(bArr);
                        byte[] bArr2 = new byte[read];
                        System.arraycopy(bArr, 0, bArr2, 0, read);
                        String h4 = com.harman.sdk.utils.g.h(bArr2, true);
                        com.harman.log.f.a(C2028n.f44663o, "app received command : " + h4);
                        Message obtainMessage = C2028n.this.f44668b.obtainMessage(O.f44533a.e());
                        obtainMessage.obj = h4;
                        C2028n.this.f44668b.sendMessageDelayed(obtainMessage, 10L);
                    } catch (IOException e4) {
                        Log.e(C2028n.f44663o, "Error in running ConnectedThread", e4);
                        C2028n.this.n();
                        return;
                    }
                }
            }
        }
    }

    public C2028n(Handler handler) {
        this.f44668b = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l(BluetoothSocket bluetoothSocket, BluetoothDevice bluetoothDevice, String str) {
        try {
            com.harman.log.f.a(f44663o, "connected, Socket Type:" + str);
            b bVar = this.f44671e;
            if (bVar != null) {
                bVar.a();
                this.f44671e = null;
            }
            c cVar = this.f44672f;
            if (cVar != null) {
                cVar.a();
                this.f44672f = null;
            }
            a aVar = this.f44669c;
            if (aVar != null) {
                aVar.a();
                this.f44669c = null;
            }
            a aVar2 = this.f44670d;
            if (aVar2 != null) {
                aVar2.a();
                this.f44670d = null;
            }
            c cVar2 = new c(bluetoothSocket, str);
            this.f44672f = cVar2;
            cVar2.start();
            Handler handler = this.f44668b;
            O o4 = O.f44533a;
            Message obtainMessage = handler.obtainMessage(o4.d());
            Bundle bundle = new Bundle();
            bundle.putString(o4.c(), bluetoothDevice.getName());
            obtainMessage.setData(bundle);
            this.f44668b.sendMessage(obtainMessage);
            r();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.f44673g = 0;
        r();
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.f44673g = 0;
        r();
    }

    private synchronized void r() {
        this.f44673g = o();
        com.harman.log.f.a(f44663o, "updateConnectionStateChange() from " + this.f44674h + " -to-> " + this.f44673g);
        this.f44674h = this.f44673g;
        this.f44668b.obtainMessage(O.f44533a.f(), this.f44674h, -1).sendToTarget();
    }

    public synchronized void k(BluetoothDevice bluetoothDevice, boolean z3) {
        b bVar;
        try {
            com.harman.log.f.a(f44663o, "connect to: " + bluetoothDevice);
            if (this.f44673g == 2 && (bVar = this.f44671e) != null) {
                bVar.a();
                this.f44671e = null;
            }
            c cVar = this.f44672f;
            if (cVar != null) {
                cVar.a();
                this.f44672f = null;
            }
            b bVar2 = new b(bluetoothDevice, z3);
            this.f44671e = bVar2;
            bVar2.start();
            r();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int o() {
        return this.f44673g;
    }

    public synchronized void p() {
        try {
            Log.d(f44663o, " start mSecureAcceptThread and mInsecureAcceptThread thread ");
            b bVar = this.f44671e;
            if (bVar != null) {
                bVar.a();
                this.f44671e = null;
            }
            c cVar = this.f44672f;
            if (cVar != null) {
                cVar.a();
                this.f44672f = null;
            }
            if (this.f44669c == null) {
                a aVar = new a(true);
                this.f44669c = aVar;
                aVar.start();
            }
            if (this.f44670d == null) {
                a aVar2 = new a(false);
                this.f44670d = aVar2;
                aVar2.start();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void q() {
        try {
            Log.d(f44663o, " Stop all Thread - Connected, connect, SecureAcceptThread, InsecureAcceptThread");
            b bVar = this.f44671e;
            if (bVar != null) {
                bVar.a();
                this.f44671e = null;
            }
            c cVar = this.f44672f;
            if (cVar != null) {
                cVar.a();
                this.f44672f = null;
            }
            a aVar = this.f44669c;
            if (aVar != null) {
                aVar.a();
                this.f44669c = null;
            }
            a aVar2 = this.f44670d;
            if (aVar2 != null) {
                aVar2.a();
                this.f44670d = null;
            }
            this.f44673g = 0;
            r();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void s(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.f44673g != 3) {
                    return;
                }
                this.f44672f.b(bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
