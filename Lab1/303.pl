$file = "";
foreach $line (<>) {
	$file = $file . $line;
}

%urls = ();

while ($file =~ /(<\s*(a|A)(.+)\bhref\s*=\s*('\s*([^"]*)\s*'|"\s*([^"]*)\s*")(.*)>)/) {
	$href = $5 . $6;
	#print $href . "\n";

	$href =~ /^(([a-z0-9+\-]+:)?\/\/)(([a-z0-9.\-~]+(:[a-z0-9.\-~]+)?@)?(?<host>[a-z0-9.\-~]+)(\:\d+)?)([\/?#].*)?$/i;
	$urls{$+{host}} = 1;

	$file =~ s/<\s*(a|A).*>//;
}

foreach $url (sort(keys %urls)) {
	if (!($url =~ /^\s*$/)) {
		print $url . "\n";
	}
}