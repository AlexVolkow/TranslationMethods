$mode = 0;
$prev = 'undefined';

while (<>) {
	s/<.*>//g;
	
	if (!$mode) {
		if (!/^\s*$/) {
			$mode = 1;
		}
	}
	if ($mode){
		if (!/^\s*$/) {
			if ($prev =~ /^\s*$/) {
				print $prev;
				$prev = 'undefined';
			}
			s/^\s+//g;
			s/\s+$//g;
			s/(\s)\s+/$1/g;
			print $_ . "\n";
		} else {
			$prev = "\n";
		}
	}
}