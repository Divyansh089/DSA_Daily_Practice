package Graph;

import java.io.*;




import java.io.*;
import java.util.*;

public class LockedOut {
    static class FS {
        final InputStream in; final byte[] buf=new byte[1<<16];
        int p=0,l=0; FS(InputStream is){in=is;}
        int r() throws IOException{ if(p>=l){ l=in.read(buf); p=0; if(l<0) return -1; } return buf[p++]; }
        int nextInt() throws IOException{ int c=r(); while(c<=32) c=r(); int s=1; if(c=='-'){s=-1; c=r();} int x=0; while(c>32){ x=x*10+(c-'0'); c=r(); } return x*s; }
    }

    static class Seg {
        int n; int[] t;
        Seg(int sz){ n=1; while(n<sz) n<<=1; t=new int[n<<1]; }
        void upd(int i,int v){ i+=n; if(v<=t[i]) return; t[i]=v; for(i>>=1;i>0;i>>=1) t[i]=Math.max(t[i<<1],t[i<<1|1]); }
        int qry(int l,int r){
            if(l>r) return 0;
            l+=n; r+=n; int res=0;
            while(l<=r){
                if((l&1)==1) res=Math.max(res,t[l++]);
                if((r&1)==0) res=Math.max(res,t[r--]);
                l>>=1; r>>=1;
            }
            return res;
        }
        int all(){ return t[1]; }
    }

    public static void main(String[] args) throws Exception {
        FS fs=new FS(System.in);
        StringBuilder sb=new StringBuilder();
        int T=fs.nextInt();
        while(T-- > 0){
            int n=fs.nextInt();
            int[] a=new int[n];
            int mx=0;
            for(int i=0;i<n;i++){ a[i]=fs.nextInt(); if(a[i]>mx) mx=a[i]; }
            int size=mx+2;
            Seg seg=new Seg(size);
            int[] dp=new int[size];
            int best=0;
            for(int x: a){
                int left = (x>=2) ? seg.qry(0,x-2) : 0;
                int right = seg.qry(x, size-1);
                int base = Math.max(left,right);
                int nv = base+1;
                if(nv>dp[x]){
                    dp[x]=nv;
                    seg.upd(x,nv);
                    if(nv>best) best=nv;
                }
            }
            sb.append(n-best).append('\n');
        }
        System.out.print(sb.toString());
    }
}
