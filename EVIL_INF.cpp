#include<bits/stdc++.h>
using namespace std;
#define nline '\n';
#define fastio    		ios:: sync_with_stdio(0);cin.tie(0);cout.tie(0);cout<<fixed;cout<<setprecision(15);
typedef  long long   ll;
typedef  long double ld;
const ll   N     =  2e5 + 5;
const ll   mod   =  1e9 + 7;
const ll   inf   =  1e16;
int dx[] = { -1, 0, 1, 0};
int dy[] = {0, 1, 0, -1};


void solve() {
	int n;
	cin >> n;
	vector<int>a(n), b(n);
	map<int, int>mp;
	for (int i = 0; i < n; i++) cin >> a[i];
	for (int i = 0; i < n; i++) cin >> b[i], mp[a[i]] = b[i];
	vector<pair<int, int>>p;
	for (int i = 0; i < n; i++) p.emplace_back(b[i], a[i]);
	sort(p.begin(), p.end());
	vector<int>dp(2 * n + 1);
	set<int>st{p.back().second};
	int ans = 0;
	for (int i = n - 2; i >= 0; i--) {
		//lets say the ith persons package gets stolen
		int steal = *st.begin();
		if (steal < p[i].first) {
			dp[p[i].first] = 1 + dp[mp[steal]];
			ans = max(ans, dp[p[i].first]);
		}
		st.emplace(p[i].second);
	}
	cout << ans;
}


int main() {
#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif
	fastio;
	int tc = 1;
	cin >> tc;
	int t = tc;
	while (tc--) {
		//cout << "Case #" << t - tc << ": ";
		solve();
		cout << nline;
	}
	return 0;
}


