while (<>) {
	print if /\b(.+)\1{1}\b/;
}