while (<>){
	s/\([^)]*\)/\(\)/g;
	print;
}