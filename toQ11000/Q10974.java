package toQ11000;
import java.util.*;
public class Q10974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int N1 = N;
		if (N1 < 2) {
			for (int al = 1; al <= N1; al++) {
					System.out.println(al);
			}
		}
		else if (N1 < 3) {
			for (int al = 1; al <= N1; al++) {
				for (int be = 1; be <= N1; be++) {
					if (al == be) {
						continue;
					}
					System.out.println(al + " " + be);
				}
			}
		}
		else if (N1 < 4) {
			for (int al = 1; al <= N1; al++) {
				for (int be = 1; be <= N1; be++) {
					if (be == al) {
						continue;
					}
					for (int ch = 1; ch <= N1; ch++) {
						if (al == ch || be == ch) {
							continue;
						}
						System.out.println(al + " " + be + " " + ch);
					}
				}
			}
		}
		else if (N1 < 5) {
			for (int al = 1; al <= N1; al++) {
				for (int be = 1; be <= N1; be++) {
					if (be == al) {
						continue;
					}
					for (int ch = 1; ch <= N1; ch++) {
						if (al == ch || be == ch) {
							continue;
						}
						for (int de = 1; de <= N1; de++) {
							if (al == de || be == de || ch == de) {
								continue;
							}
							System.out.println(al + " " + be + " " + ch + " " + de);
						}
					}
				}
			}
		}
		else if (N1 < 6) {
			for (int al = 1; al <= N1; al++) {
				for (int be = 1; be <= N1; be++) {
					if (be == al) {
						continue;
					}
					for (int ch = 1; ch <= N1; ch++) {
						if (al == ch || be == ch) {
							continue;
						}
						for (int de = 1; de <= N1; de++) {
							if (al == de || be == de || ch == de) {
								continue;
							}
							for (int ec = 1; ec <= N1; ec++) {
								if (al == ec || be == ec || ch == ec || de == ec) {
									continue;
								}
								System.out.println(al + " " + be + " " + ch + " " + de + " " + ec);
							}
						}
					}
				}
			}
		}
		else if (N1 < 7) {
			for (int al = 1; al <= N1; al++) {
				for (int be = 1; be <= N1; be++) {
					if (be == al) {
						continue;
					}
					for (int ch = 1; ch <= N1; ch++) {
						if (al == ch || be == ch) {
							continue;
						}
						for (int de = 1; de <= N1; de++) {
							if (al == de || be == de || ch == de) {
								continue;
							}
							for (int ec = 1; ec <= N1; ec++) {
								if (al == ec || be == ec || ch == ec || de == ec) {
									continue;
								}
								for (int fo = 1; fo <= N1; fo++) {
									if (al == fo || be == fo || ch == fo || de == fo || ec == fo) {
										continue;
									}
									System.out.println(al + " " + be + " " + ch + " " + de + " " + ec + " " + fo);
								}
							}
						}
					}
				}
			}
		}
		else if (N1 < 8) {
			for (int al = 1; al <= N1; al++) {
				for (int be = 1; be <= N1; be++) {
					if (be == al) {
						continue;
					}
					for (int ch = 1; ch <= N1; ch++) {
						if (al == ch || be == ch) {
							continue;
						}
						for (int de = 1; de <= N1; de++) {
							if (al == de || be == de || ch == de) {
								continue;
							}
							for (int ec = 1; ec <= N1; ec++) {
								if (al == ec || be == ec || ch == ec || de == ec) {
									continue;
								}
								for (int fo = 1; fo <= N1; fo++) {
									if (al == fo || be == fo || ch == fo || de == fo || ec == fo) {
										continue;
									}
									for (int ga = 1; ga <= N1; ga++) {
										if (al == ga || be == ga || ch == ga || de == ga || ec == ga || fo == ga) {
											continue;
										}
										System.out.println(al + " " + be + " " + ch + " " + de + " " + ec + " " + fo + " " + ga);
									}
								}
							}
						}
					}
				}
			}
		}
		else if (N1 < 9) {
			for (int al = 1; al <= N1; al++) {
				for (int be = 1; be <= N1; be++) {
					if (be == al) {
						continue;
					}
					for (int ch = 1; ch <= N1; ch++) {
						if (al == ch || be == ch) {
							continue;
						}
						for (int de = 1; de <= N1; de++) {
							if (al == de || be == de || ch == de) {
								continue;
							}
							for (int ec = 1; ec <= N1; ec++) {
								if (al == ec || be == ec || ch == ec || de == ec) {
									continue;
								}
								for (int fo = 1; fo <= N1; fo++) {
									if (al == fo || be == fo || ch == fo || de == fo || ec == fo) {
										continue;
									}
									for (int ga = 1; ga <= N1; ga++) {
										if (al == ga || be == ga || ch == ga || de == ga || ec == ga || fo == ga) {
											continue;
										}
										for (int ho = 1; ho <= N1; ho++) {
											if (al == ho || be == ho || ch == ho || de == ho || ec == ho || fo == ho || ga == ho) {
												continue;
											}
											System.out.println(al + " " + be + " " + ch + " " + de + " " + ec + " " + fo + " " + ga + " " + ho);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		sc.close();
	}
}
