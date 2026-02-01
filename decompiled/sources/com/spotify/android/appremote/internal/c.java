package com.spotify.android.appremote.internal;

import G2.a;
import com.spotify.protocol.types.ChildrenPageRequest;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.Identifier;
import com.spotify.protocol.types.ListItem;
import com.spotify.protocol.types.ListItems;

/* loaded from: classes2.dex */
public class c implements com.spotify.android.appremote.api.d {

    /* renamed from: a, reason: collision with root package name */
    private final com.spotify.protocol.client.k f48799a;

    public c(com.spotify.protocol.client.k remoteClient) {
        this.f48799a = remoteClient;
    }

    @Override // com.spotify.android.appremote.api.d
    public com.spotify.protocol.client.c<ListItems> a(String type) {
        r.a(type);
        return this.f48799a.d(a.C0008a.f600t, new com.spotify.protocol.types.a(type), ListItems.class);
    }

    @Override // com.spotify.android.appremote.api.d
    public com.spotify.protocol.client.c<ListItems> b(ListItem item, int perpage, int offset) {
        r.a(item);
        return this.f48799a.d(a.C0008a.f599s, new ChildrenPageRequest(item.id, perpage, offset), ListItems.class);
    }

    @Override // com.spotify.android.appremote.api.d
    public com.spotify.protocol.client.c<Empty> c(ListItem item) {
        com.spotify.protocol.client.d.a(item);
        if (item.playable) {
            return this.f48799a.d(a.C0008a.f584d, new Identifier(item.id), Empty.class);
        }
        throw new IllegalArgumentException("The ContentItem is not playable.");
    }
}
