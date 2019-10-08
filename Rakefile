require ’rake/clean’

CLEAN.include(’∗.o’,’example’)
task :default => ["example"]

SRC = FileList[’∗.c’]
OBJ = SRC.ext(’o’)

rule ’.o’ => ’.c’ do |t|
sh "cc −c −o #{t.name} #{t.source}"
end

file "example" => OBJ do
sh "cc −o example #{OBJ}"
end

# File dependencies go here ...
file ’main.o’ => [’main.c’, ’function.h’]
file ’function.o’ => [’function.c’]