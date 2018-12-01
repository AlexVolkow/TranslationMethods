program testNormal;

const
  N : integer = 69;

var
  a, b : integer;
begin
  read(a, b);
  a := b + a + 42;

  if a >= b then begin
    b := b * 2;
    if b <> N then begin
      write(a);
      write(b);
    end;
  end else begin
    a := a / 2;
  end;


  write('result');
  writeln(a);
end.