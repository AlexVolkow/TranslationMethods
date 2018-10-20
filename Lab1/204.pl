while (<>){
	s/\b(\w{1})(\w{1})(.*)\b/$2$1$3/g;
	print;
}