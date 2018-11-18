program testNormal;

const
  N : integer = 69;

var
  a, b : integer;
begin
  read(a, b);
  a := b + a + 42;
  write('result');
  writeln(a);
end.