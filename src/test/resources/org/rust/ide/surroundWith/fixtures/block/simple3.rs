fn main() {
    <selection>let mut server = Nickel::new();
    server.get("**", hello_world);</selection>
    server.listen("127.0.0.1:6767").unwrap();
}
