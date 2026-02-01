package com.spotify.android.appremote.api;

import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.ListItem;
import com.spotify.protocol.types.ListItems;

/* loaded from: classes2.dex */
public interface d {

    /* loaded from: classes2.dex */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f48757a = "automotive";

        /* renamed from: b, reason: collision with root package name */
        public static final String f48758b = "default";

        /* renamed from: c, reason: collision with root package name */
        public static final String f48759c = "navigation";

        /* renamed from: d, reason: collision with root package name */
        public static final String f48760d = "fitness";

        /* renamed from: e, reason: collision with root package name */
        public static final String f48761e = "wake";

        /* renamed from: f, reason: collision with root package name */
        public static final String f48762f = "sleep";
    }

    com.spotify.protocol.client.c<ListItems> a(String type);

    com.spotify.protocol.client.c<ListItems> b(ListItem item, int perpage, int offset);

    com.spotify.protocol.client.c<Empty> c(ListItem item);
}
