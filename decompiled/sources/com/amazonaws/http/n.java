package com.amazonaws.http;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionManager;

/* loaded from: classes.dex */
public final class n extends Thread {

    /* renamed from: F, reason: collision with root package name */
    private static final int f23678F = 60000;

    /* renamed from: G, reason: collision with root package name */
    private static final int f23679G = 60;

    /* renamed from: I, reason: collision with root package name */
    private static n f23681I;

    /* renamed from: E, reason: collision with root package name */
    private volatile boolean f23683E;

    /* renamed from: H, reason: collision with root package name */
    private static final ArrayList<ClientConnectionManager> f23680H = new ArrayList<>();

    /* renamed from: J, reason: collision with root package name */
    static final com.amazonaws.logging.c f23682J = LogFactory.c(n.class);

    private n() {
        super("java-sdk-http-connection-reaper");
        setDaemon(true);
    }

    private void a() {
        this.f23683E = true;
    }

    public static synchronized boolean b(ClientConnectionManager clientConnectionManager) {
        boolean add;
        synchronized (n.class) {
            try {
                if (f23681I == null) {
                    n nVar = new n();
                    f23681I = nVar;
                    nVar.start();
                }
                add = f23680H.add(clientConnectionManager);
            } catch (Throwable th) {
                throw th;
            }
        }
        return add;
    }

    public static synchronized boolean c(ClientConnectionManager clientConnectionManager) {
        boolean remove;
        synchronized (n.class) {
            ArrayList<ClientConnectionManager> arrayList = f23680H;
            remove = arrayList.remove(clientConnectionManager);
            if (arrayList.isEmpty()) {
                d();
            }
        }
        return remove;
    }

    public static synchronized boolean d() {
        synchronized (n.class) {
            n nVar = f23681I;
            if (nVar != null) {
                nVar.a();
                f23681I.interrupt();
                f23680H.clear();
                f23681I = null;
                return true;
            }
            return false;
        }
    }

    static synchronized int e() {
        int size;
        synchronized (n.class) {
            size = f23680H.size();
        }
        return size;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        List list;
        while (!this.f23683E) {
            try {
                Thread.sleep(com.harman.jbl.partybox.ui.party.b.f44883c);
                synchronized (n.class) {
                    list = (List) f23680H.clone();
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((ClientConnectionManager) it.next()).closeIdleConnections(60L, TimeUnit.SECONDS);
                    } catch (Exception e4) {
                        f23682J.j("Unable to close idle connections", e4);
                    }
                }
            } catch (Throwable th) {
                f23682J.b("Reaper thread: ", th);
            }
        }
        f23682J.a("Shutting down reaper thread.");
    }
}
